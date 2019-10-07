package ModelClass;

import Connection.Consult;
import Models.Clientes;
import Models.RegistrosClientes;
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

public class Cliente extends Consult implements Printable{

    private DefaultTableModel modelo, modelo2;
    private List<Clientes> cliente, clienteFilter;
    private int id_cliente;
    private String id;
    private String query;
    private Object[] object;
    private JPanel panel;

    public void insertCliente(String id, String nombre, String apellido, String direccion, String telefono) {

        query = "INSERT INTO clientes(id, nombre, apellido, direccion, telefono) VALUES(?, ?, ?, ?, ?)";
        object = new Object[]{id, nombre, apellido, direccion, telefono};
        insert(query, object);
        cliente = clientes();
        cliente.forEach(item -> {
            this.id_cliente = item.getId_Cliente();
            this.id = item.getId();
        });

        query = "INSERT INTO reportes_clientes(id_cliente, id, saldo_actual, fecha_actual, ultimo_pago, fecha_pago) VALUES(?, ?, ?, ?, ?, ?)";
        object = new Object[]{this.id_cliente, this.id, "$0.00", "Sin fecha", "$0.00", "Sin fecha"};
        insert(query, object);
    }

    public List<Clientes> getClientes() {
        return clientes();
    }

    public void searchCliente(JTable table, String campo, int numRegistro, int regPorPagina) {
        String[] registros = new String[6];
        String[] titulos = {"id_cliente", "id", "nombre", "pellido", "direccion", "telefono"};
        modelo = new DefaultTableModel(null, titulos);
        cliente = clientes();
        if (campo.equals("")) {
            clienteFilter = cliente.stream().skip(numRegistro).limit(regPorPagina).collect(Collectors.toList());
        } else {
            clienteFilter = cliente.stream().filter(c -> c.getId().startsWith(campo) || c.getNombre().startsWith(campo) || c.getApellido().startsWith(campo)).limit(regPorPagina).collect(Collectors.toList());
        }
        clienteFilter.forEach(item -> {
            registros[0] = String.valueOf(item.getId_Cliente());
            registros[1] = item.getId();
            registros[2] = item.getNombre();
            registros[3] = item.getApellido();
            registros[4] = item.getDireccion();
            registros[5] = item.getTelefono();
            modelo.addRow(registros);
        });
        table.setModel(modelo);
        table.setRowHeight(30);
        table.getColumnModel().getColumn(0).setMaxWidth(0);
        table.getColumnModel().getColumn(0).setMinWidth(0);
        table.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public DefaultTableModel reportesCliente(JTable table, int idCliente) {
        String[] registros = new String[7];
        String[] titulos = {"Id", "Nombre", "Apelldo", "Saldo Actual", "Fecha Actual", "Ultimo Pago", "Fecha Pago"};
        modelo2 = new DefaultTableModel(null, titulos);
        List<RegistrosClientes> reportes = registrosClientes(idCliente);
        reportes.forEach(item -> {
            registros[0] = String.valueOf(item.getId_Registro());
            registros[1] = item.getNombre();
            registros[2] = item.getApellido();
            registros[3] = item.getSaldo_actual();
            registros[4] = item.getFecha_actual();
            registros[5] = item.getUltimo_pago();
            registros[6] = item.getFecha_pago();
            modelo2.addRow(registros);
        });
        table.setModel(modelo2);
        table.setRowHeight(30);
        table.getColumnModel().getColumn(0).setMaxWidth(0);
        table.getColumnModel().getColumn(0).setMinWidth(0);
        table.getColumnModel().getColumn(0).setPreferredWidth(0);
        return modelo2;
    }

    public void updateCliente(String id, String nombre, String apellido, String direccion, String telefono, int idCliente) {
        query = "UPDATE clientes SET id = ?, nombre = ?, apellido = ?, direccion = ?, telefono = ? WHERE id_cliente =" + idCliente;
        Object[] cliente = new Object[]{id, nombre, apellido, direccion, telefono};
        update(query, cliente);
        List<RegistrosClientes> reportes = registrosClientes(idCliente);
        int idRegistro = reportes.get(0).getId_Registro();
        int IdCliente = reportes.get(0).getId_Cliente();
        String saldoActual = reportes.get(0).getSaldo_actual();
        String fechaActual = reportes.get(0).getFecha_actual();
        String ultimoPago = reportes.get(0).getUltimo_pago();
        String fechaPago = reportes.get(0).getFecha_pago();
        String Id = id;
        query = "UPDATE reportes_clientes SET id_Cliente = ?, id = ?, saldo_actual = ?, fecha_actual = ?, ultimo_pago = ?, fecha_pago= ? WHERE id_registro =" + idRegistro;
        Object[] reporte = new Object[]{IdCliente, Id, saldoActual, fechaActual, ultimoPago, fechaPago};
        update(query, reporte);
    }

    public void deleteCliente(int idCliente, int idRegistro) {
        query = "DELETE FROM reportes_clientes WHERE id_registro LIKE ?";
        delete(query, idRegistro);

        query = "DELETE FROM clientes WHERE id_cliente LIKE ?";
        delete(query, idCliente);
    }

    public void updateReportes(String saldoActual, String fecha, String pago, int idCliente) {
        List<RegistrosClientes> reportes = registrosClientes(idCliente);
        int idRegistro = reportes.get(0).getId_Registro();
        int IdCliente = reportes.get(0).getId_Cliente();
        String ID = reportes.get(0).getId();

        query = "UPDATE reportes_clientes SET id_cliente = ?, id = ?, saldo_actual = ?, fecha_actual = ?, ultimo_pago = ?, fecha_pago = ? WHERE id_registro=" + idRegistro;
        Object[] reporte = new Object[]{IdCliente, ID, "$" + saldoActual, fecha, "$" + pago, fecha};
        update(query, reporte);
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
    
    public void imprimirRecibo(JPanel panel){        
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
