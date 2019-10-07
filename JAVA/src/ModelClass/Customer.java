package ModelClass;

import Connection.Consult;
import Models.Customers;
import Models.CustomersRecords;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Customer extends Consult implements Printable{

    private DefaultTableModel model1, model2;
    private List<Customers> customers, customerFilter;
    private int idCustomer;
    private String id;
    private String query;
    private Object[] object;
    private JPanel panel;

    public void insertCustomer(String id, String name, String surname, String direction, String telephone) {

        query = "INSERT INTO clientes(id, nombre, apellido, direccion, telefono) VALUES(?, ?, ?, ?, ?)";
        object = new Object[]{id, name, surname, direction, telephone};
        insert(query, object);
        customers = customers();
        customers.forEach(item -> {
            this.idCustomer = item.getId_Cliente();
            this.id = item.getId();
        });

        query = "INSERT INTO reportes_clientes(id_cliente, id, saldo_actual, fecha_actual, ultimo_pago, fecha_pago) VALUES(?, ?, ?, ?, ?, ?)";
        object = new Object[]{this.idCustomer, this.id, "$0.00", "Sin fecha", "$0.00", "Sin fecha"};
        insert(query, object);
    }

    public List<Customers> getCustomers() {
        return customers();
    }

    public void searchCustomer(JTable table, String field, int numRecord, int recordsForPage) {
        String[] records = new String[6];
        String[] tittles = {"id_cliente", "id", "nombre", "pellido", "direccion", "telefono"};
        model1 = new DefaultTableModel(null, tittles);
        customers = customers();
        if (field.equals("")) {
            customerFilter = customers.stream().skip(numRecord).limit(recordsForPage).collect(Collectors.toList());
        } else {
            customerFilter = customers.stream().filter(c -> c.getId().startsWith(field) || c.getNombre().startsWith(field) || c.getApellido().startsWith(field)).limit(recordsForPage).collect(Collectors.toList());
        }
        customerFilter.forEach(item -> {
            records[0] = String.valueOf(item.getId_Cliente());
            records[1] = item.getId();
            records[2] = item.getNombre();
            records[3] = item.getApellido();
            records[4] = item.getDireccion();
            records[5] = item.getTelefono();
            model1.addRow(records);
        });
        table.setModel(model1);
        table.setRowHeight(30);
        table.getColumnModel().getColumn(0).setMaxWidth(0);
        table.getColumnModel().getColumn(0).setMinWidth(0);
        table.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    public DefaultTableModel getModel() {
        return model1;
    }

    public DefaultTableModel customerRecords(JTable table, int idCustomer) {
        String[] records = new String[7];
        String[] tittles = {"Id", "Nombre", "Apelldo", "Saldo Actual", "Fecha Actual", "Ultimo Pago", "Fecha Pago"};
        model2 = new DefaultTableModel(null, tittles);
        List<CustomersRecords> reports = customersRecords(idCustomer);
        reports.forEach(item -> {
            records[0] = String.valueOf(item.getId_Registro());
            records[1] = item.getNombre();
            records[2] = item.getApellido();
            records[3] = item.getSaldo_actual();
            records[4] = item.getFecha_actual();
            records[5] = item.getUltimo_pago();
            records[6] = item.getFecha_pago();
            model2.addRow(records);
        });
        table.setModel(model2);
        table.setRowHeight(30);
        table.getColumnModel().getColumn(0).setMaxWidth(0);
        table.getColumnModel().getColumn(0).setMinWidth(0);
        table.getColumnModel().getColumn(0).setPreferredWidth(0);
        return model2;
    }

    public void updateCustomer(String id, String name, String surname, String direction, String telephone, int idCustomer) {
        query = "UPDATE clientes SET id = ?, nombre = ?, apellido = ?, direccion = ?, telefono = ? WHERE id_cliente =" + idCustomer;
        Object[] customer = new Object[]{id, name, surname, direction, telephone};
        update(query, customer);
        List<CustomersRecords> reports = customersRecords(idCustomer);
        int idRecord = reports.get(0).getId_Registro();
        int IdCustomer = reports.get(0).getId_Cliente();
        String currentBalance = reports.get(0).getSaldo_actual();
        String currentDate = reports.get(0).getFecha_actual();
        String lastPayment = reports.get(0).getUltimo_pago();
        String paymentDate = reports.get(0).getFecha_pago();
        query = "UPDATE reportes_clientes SET id_Cliente = ?, id = ?, saldo_actual = ?, fecha_actual = ?, ultimo_pago = ?, fecha_pago= ? WHERE id_registro =" + idRecord;
        Object[] report = new Object[]{IdCustomer, id, currentBalance, currentDate, lastPayment, paymentDate};
        update(query, report);
    }

    public void deleteCustomer(int idCustomer, int idRecord) {
        query = "DELETE FROM reportes_clientes WHERE id_registro LIKE ?";
        delete(query, idRecord);

        query = "DELETE FROM clientes WHERE id_cliente LIKE ?";
        delete(query, idCustomer);
    }

    public void updateReports(String currentBalance, String currentDate, String payment, int idCustomer) {
        List<CustomersRecords> reports = customersRecords(idCustomer);
        int idRecord = reports.get(0).getId_Registro();
        int IdCustomer = reports.get(0).getId_Cliente();
        String ID = reports.get(0).getId();

        query = "UPDATE reportes_clientes SET id_cliente = ?, id = ?, saldo_actual = ?, fecha_actual = ?, ultimo_pago = ?, fecha_pago = ? WHERE id_registro=" + idRecord;
        Object[] report = new Object[]{IdCustomer, ID, "$" + currentBalance, currentDate, "$" + payment, currentDate};
        update(query, report);
    }
    
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex){
        if(pageIndex == 0){
            Graphics2D g2d = (Graphics2D) graphics;
            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            g2d.scale(0.70, 0.70); //reduccion de la impresion al 70%
            this.panel.printAll(graphics);
            return PAGE_EXISTS;
        }else{
            return NO_SUCH_PAGE;
        }
    }
    
    public void receiptPrint(JPanel panel){        
        this.panel = panel;
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        //Se pasa la instancia del JFrame al PrinterJob
        printerJob.setPrintable(this);
        //Muestra la ventana de dialogo para imprimir
        if(printerJob.printDialog()){
            try {
                printerJob.print();
            } catch (PrinterException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex);
            }
        }
    }
}