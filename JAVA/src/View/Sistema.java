package View;

import ModelClass.Cliente;
import ModelClass.FormatDecimal;
import ModelClass.ImagenBanner;
import ModelClass.TextFieldEvent;
import Models.Clientes;
import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Sistema extends javax.swing.JFrame {

    private String accion = "insert", fecha, dia, mes, anio, funcionCatDpt, idCat, dpt, pago, deudaActual;
    private int pageSize = 6, tab, maxReg, pageCount, currentPage, numReg;
    private int startRec, endRec, numRegistro = 0, numPagina = 0, idCliente, idRegistro;

    ImagenBanner p = new ImagenBanner();
    TextFieldEvent evento = new TextFieldEvent();
    Cliente cliente = new Cliente();
    List<Clientes> numCliente;
    DefaultTableModel tablaModeloCLT, tablaModelReporteCLT;
    Pattern pattern;
    Matcher matcher;
    FormatDecimal formato = new FormatDecimal();

    Color fieldEmpty = new Color(102, 102, 102);
    Color fieldOk = new Color(0, 153, 51);
    Color fieldWrong = Color.RED;

    public Sistema() {
        initComponents();
        //Agregar la imagen al jPanel
        PanelBanner.add(p);
        
        Calendar c = new GregorianCalendar();
        dia = Integer.toString(c.get(Calendar.DAY_OF_MONTH));
        mes = Integer.toString(c.get(Calendar.MONTH));
        anio = Integer.toString(c.get(Calendar.YEAR));
        fecha = dia + "/" + mes + "/" + anio;

        //<editor-fold defaultstate="collapsed" desc="CODIGO CLIENTE">
        jrbIngresarCliente.setSelected(true);
        jrbIngresarCliente.setForeground(fieldOk);
        txtPagosCliente.setEnabled(false);
        cliente.reportesCliente(Table_ReportesCLT, idCliente);
        //</editor-fold>
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBanner = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        Button_Compras = new javax.swing.JButton();
        Button_Cat_Dpt = new javax.swing.JButton();
        Button_Poductos = new javax.swing.JButton();
        Button_Cliente = new javax.swing.JButton();
        Button_Ventas = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TextField_BuscarCliente1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Table_Clientes1 =   Table_Clientes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        Button_AnteriorCLT1 = new javax.swing.JButton();
        Button_SiguienteCLT1 = new javax.swing.JButton();
        Button_PrimeroCLT1 = new javax.swing.JButton();
        Button_UltimoCLT1 = new javax.swing.JButton();
        Label_Paginas3 = new javax.swing.JLabel();
        Button_Factura2 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        Label_NombreCliente1 = new javax.swing.JLabel();
        TextField_NombreCliente1 = new javax.swing.JTextField();
        Label_ApellidoCliente1 = new javax.swing.JLabel();
        Label_DireccionCliente1 = new javax.swing.JLabel();
        Label_TelefonoCliente1 = new javax.swing.JLabel();
        Label_Pago1 = new javax.swing.JLabel();
        Button_GuardarCliente2 = new javax.swing.JButton();
        Button_CancelarCLT1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        Label_TelefonoCliente2 = new javax.swing.JLabel();
        Label_Pago2 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        Table_ReportesCLT1 = Table_ReportesCLT = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        TextField_BuscarCliente2 = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBuscarCliente = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jrbIngresarCliente = new javax.swing.JRadioButton();
        jrbPagosCliente = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        Label_NombreCliente = new javax.swing.JLabel();
        TextField_NombreCliente = new javax.swing.JTextField();
        Label_ApellidoCliente = new javax.swing.JLabel();
        TextField_ApellidioCliente = new javax.swing.JTextField();
        Label_DireccionCliente = new javax.swing.JLabel();
        TextField_DireccioCliente = new javax.swing.JTextField();
        Label_TelefonoCliente = new javax.swing.JLabel();
        TextField_TelefonoCliente = new javax.swing.JTextField();
        lblPagoCliente = new javax.swing.JLabel();
        txtPagosCliente = new javax.swing.JTextField();
        btnGuardarCliente = new javax.swing.JButton();
        Button_EliminarCLT = new javax.swing.JButton();
        Button_CancelarCLT = new javax.swing.JButton();
        lblIdCliente = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_Clientes =   Table_Clientes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        Button_AnteriorCLT = new javax.swing.JButton();
        Button_SiguienteCLT = new javax.swing.JButton();
        Button_PrimeroCLT = new javax.swing.JButton();
        Button_UltimoCLT = new javax.swing.JButton();
        Label_PaginasClientes = new javax.swing.JLabel();
        btnFacturaCliente = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table_ReportesCLT = Table_ReportesCLT = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panReciboCliente = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        lblDeudaActualCLT = new javax.swing.JLabel();
        lblNombreCLT = new javax.swing.JLabel();
        lblApellidoCLT = new javax.swing.JLabel();
        lblUltimoPagoCLT = new javax.swing.JLabel();
        lblFechaPagoCLT = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jrbIngresarCliente1 = new javax.swing.JRadioButton();
        jrbPagosCliente1 = new javax.swing.JRadioButton();
        jLabel39 = new javax.swing.JLabel();
        Label_NombreCliente3 = new javax.swing.JLabel();
        TextField_NombreCliente2 = new javax.swing.JTextField();
        Label_ApellidoCliente2 = new javax.swing.JLabel();
        TextField_ApellidioCliente1 = new javax.swing.JTextField();
        Label_DireccionCliente2 = new javax.swing.JLabel();
        TextField_DireccioCliente1 = new javax.swing.JTextField();
        Label_TelefonoCliente3 = new javax.swing.JLabel();
        TextField_TelefonoCliente1 = new javax.swing.JTextField();
        lblPagoCliente1 = new javax.swing.JLabel();
        txtPagosCliente1 = new javax.swing.JTextField();
        btnGuardarCliente1 = new javax.swing.JButton();
        Button_EliminarCLT3 = new javax.swing.JButton();
        Button_CancelarCLT2 = new javax.swing.JButton();
        Label_IdCliente1 = new javax.swing.JLabel();
        txtIdCliente1 = new javax.swing.JTextField();
        jPanel30 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        TextField_BuscarCliente3 = new javax.swing.JTextField();
        jPanel31 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblProveedores = tblProveedores = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {         
                return false; //Disallow the editing of any cell
            }
        };
        Button_AnteriorCLT2 = new javax.swing.JButton();
        Button_SiguienteCLT2 = new javax.swing.JButton();
        Button_PrimeroCLT2 = new javax.swing.JButton();
        Button_UltimoCLT2 = new javax.swing.JButton();
        Label_PaginasClientes1 = new javax.swing.JLabel();
        btnFacturaCliente1 = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblReportesPV = tblReportesPV = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;//Disallow the editing of any cell
            }
        };
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        panReciboCliente1 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        lblDeudaActualCLT1 = new javax.swing.JLabel();
        lblNombreCLT1 = new javax.swing.JLabel();
        lblApellidoCLT1 = new javax.swing.JLabel();
        lblUltimoPagoCLT1 = new javax.swing.JLabel();
        lblFechaPagoCLT1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Label_CodigoPDT = new javax.swing.JLabel();
        TextField_CodigoPDT = new javax.swing.JTextField();
        Label_DescripcionPDT = new javax.swing.JLabel();
        TextField_DescripcionPDT = new javax.swing.JTextField();
        Label_UnidadPDT = new javax.swing.JLabel();
        TextField_PrecioUnidadPDT = new javax.swing.JTextField();
        Label_MayoreoPDT = new javax.swing.JLabel();
        TextField_PrecioMayoreoPDT = new javax.swing.JTextField();
        Label_DepartamentoPDT = new javax.swing.JLabel();
        Button_GuardarPDT = new javax.swing.JButton();
        Button_EliminarCLT1 = new javax.swing.JButton();
        Button_CancelarPDT = new javax.swing.JButton();
        Label_CategoriaPDT = new javax.swing.JLabel();
        ComboBox_Departamento = new javax.swing.JComboBox();
        ComboBox_Categoria = new javax.swing.JComboBox();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Table_ComprasPDT =   Table_ComprasPDT = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        Label1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Table_BodegaPDT = Table_BodegaPDT = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        jLabel14 = new javax.swing.JLabel();
        Label = new javax.swing.JLabel();
        Button_PrimeroPDT = new javax.swing.JButton();
        Button_AnteriorPDT = new javax.swing.JButton();
        Button_SiguientePDT = new javax.swing.JButton();
        Button_UltimoPDT = new javax.swing.JButton();
        Label_Paginas1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TextField_BuscarPDT = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        RadioButton_Dpt = new javax.swing.JRadioButton();
        RadioButton_Cat = new javax.swing.JRadioButton();
        Button_GuardarCatDpt = new javax.swing.JButton();
        Button_EliminarCatDpt = new javax.swing.JButton();
        Button_CancelarCatDpt = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        Label_Cat = new javax.swing.JLabel();
        TextField_Categoria = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        Label_Dpt = new javax.swing.JLabel();
        TextField_Departamento = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Table_Dpt =   Table_Dpt = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        jPanel20 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        TextField_BuscarDpt = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        Table_Cat =   Table_Cat = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        RadioButton_Unidad = new javax.swing.JRadioButton();
        RadioButton_Mayoreo = new javax.swing.JRadioButton();
        Label_DescripcionCP = new javax.swing.JLabel();
        TextField_DescripcionCP = new javax.swing.JTextField();
        Label_CantidadCP = new javax.swing.JLabel();
        TextField_CantidadCP = new javax.swing.JTextField();
        Label_PrecioCP = new javax.swing.JLabel();
        TextField_PrecioCP = new javax.swing.JTextField();
        Label_ImporteCP = new javax.swing.JLabel();
        TextField_ImporteCP = new javax.swing.JTextField();
        Button_GuardarCliente1 = new javax.swing.JButton();
        Button_EliminarCLT2 = new javax.swing.JButton();
        Button_CancelarCompras = new javax.swing.JButton();
        Label_NombreCliente2 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        Table_Compras =   Table_Compras = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        Button_AnteriorCP = new javax.swing.JButton();
        Button_SiguienteCP = new javax.swing.JButton();
        Button_PrimeroCP = new javax.swing.JButton();
        Button_UltimoCP = new javax.swing.JButton();
        Label_Paginas2 = new javax.swing.JLabel();
        Button_Factura1 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TextField_BuscarCompras = new javax.swing.JTextField();
        btnProveedores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema punto de ventas");
        setPreferredSize(new java.awt.Dimension(996, 745));

        PanelBanner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelBanner.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout PanelBannerLayout = new javax.swing.GroupLayout(PanelBanner);
        PanelBanner.setLayout(PanelBannerLayout);
        PanelBannerLayout.setHorizontalGroup(
            PanelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelBannerLayout.setVerticalGroup(
            PanelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Process-Accept.png"))); // NOI18N
        jButton6.setText(" Config");
        jButton6.setToolTipText("");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);

        Button_Compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Carrito-de-compras.png"))); // NOI18N
        Button_Compras.setText(" Compras");
        Button_Compras.setToolTipText("");
        Button_Compras.setBorder(null);
        Button_Compras.setBorderPainted(false);

        Button_Cat_Dpt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Etiqueta.png"))); // NOI18N
        Button_Cat_Dpt.setText("Cat Dpt.");
        Button_Cat_Dpt.setToolTipText("");
        Button_Cat_Dpt.setBorder(null);
        Button_Cat_Dpt.setBorderPainted(false);

        Button_Poductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ordering.png"))); // NOI18N
        Button_Poductos.setText("Productos");
        Button_Poductos.setToolTipText("");
        Button_Poductos.setBorder(null);
        Button_Poductos.setBorderPainted(false);

        Button_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Clientes.png"))); // NOI18N
        Button_Cliente.setText("Clientes");
        Button_Cliente.setToolTipText("");
        Button_Cliente.setBorder(null);
        Button_Cliente.setBorderPainted(false);
        Button_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ClienteActionPerformed(evt);
            }
        });

        Button_Ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/compras.png"))); // NOI18N
        Button_Ventas.setText("Ventas");
        Button_Ventas.setToolTipText("");
        Button_Ventas.setBorder(null);
        Button_Ventas.setBorderPainted(false);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 204));
        jLabel12.setText("Ventas");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 204));
        jLabel15.setText("Buscar");

        jButton1.setText("Buscar");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(205, 205, 205)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(TextField_BuscarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(TextField_BuscarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Table_Clientes1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Table_Clientes1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Table_Clientes1.setRowHeight(20);
        Table_Clientes1.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane7.setViewportView(Table_Clientes1);

        Button_AnteriorCLT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Left.png"))); // NOI18N
        Button_AnteriorCLT1.setText("Anterior ");

        Button_SiguienteCLT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Right.png"))); // NOI18N
        Button_SiguienteCLT1.setText("Siguiente");

        Button_PrimeroCLT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Left-12.png"))); // NOI18N
        Button_PrimeroCLT1.setText("Primero");

        Button_UltimoCLT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Right-12.png"))); // NOI18N
        Button_UltimoCLT1.setText("Ultimo");

        Label_Paginas3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_Paginas3.setForeground(new java.awt.Color(0, 153, 204));
        Label_Paginas3.setText("Page");

        Button_Factura2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Imprimir.png"))); // NOI18N
        Button_Factura2.setText("Factura");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane7)
                .addGap(10, 10, 10))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(Button_PrimeroCLT1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_AnteriorCLT1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_SiguienteCLT1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_UltimoCLT1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_Factura2))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(Label_Paginas3)))
                .addGap(28, 28, 28))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_Paginas3)
                .addGap(4, 4, 4)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Button_UltimoCLT1)
                        .addComponent(Button_Factura2))
                    .addComponent(Button_SiguienteCLT1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button_AnteriorCLT1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button_PrimeroCLT1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 204));
        jLabel16.setText("Configuración de venta");
        jLabel16.setToolTipText("");

        Label_NombreCliente1.setForeground(new java.awt.Color(0, 153, 153));
        Label_NombreCliente1.setText("Pagó con");
        Label_NombreCliente1.setToolTipText("");

        Label_ApellidoCliente1.setForeground(new java.awt.Color(0, 153, 153));
        Label_ApellidoCliente1.setText("Monto a pagar");

        Label_DireccionCliente1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Label_DireccionCliente1.setForeground(new java.awt.Color(0, 102, 153));
        Label_DireccionCliente1.setText("$0.00");
        Label_DireccionCliente1.setToolTipText("");

        Label_TelefonoCliente1.setForeground(new java.awt.Color(0, 153, 153));
        Label_TelefonoCliente1.setText("Su cambio");

        Label_Pago1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Label_Pago1.setForeground(new java.awt.Color(0, 102, 153));
        Label_Pago1.setText("$0.00");

        Button_GuardarCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Agregar.png"))); // NOI18N
        Button_GuardarCliente2.setText("Cobrar");
        Button_GuardarCliente2.setBorder(null);

        Button_CancelarCLT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancelar.png"))); // NOI18N
        Button_CancelarCLT1.setText("Cancelar");
        Button_CancelarCLT1.setBorder(null);

        jCheckBox1.setText("Credito");

        Label_TelefonoCliente2.setForeground(new java.awt.Color(0, 153, 153));
        Label_TelefonoCliente2.setText("Deudada total");

        Label_Pago2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Label_Pago2.setForeground(new java.awt.Color(0, 102, 153));
        Label_Pago2.setText("$0.00");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(Button_GuardarCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button_CancelarCLT1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox1)
                            .addComponent(Label_TelefonoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_DireccionCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_NombreCliente1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextField_NombreCliente1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Label_ApellidoCliente1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 82, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_Pago1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Pago2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_TelefonoCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(Label_NombreCliente1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_NombreCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label_ApellidoCliente1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label_DireccionCliente1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label_TelefonoCliente1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label_Pago1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label_TelefonoCliente2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label_Pago2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_GuardarCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_CancelarCLT1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Table_ReportesCLT1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Table_ReportesCLT1.setRowHeight(20);
        Table_ReportesCLT1.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane10.setViewportView(Table_ReportesCLT1);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 204));
        jLabel20.setText("Cliente");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Clientes.png"))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("©PDHN");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 153, 204));
        jLabel25.setText("Buscar");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(TextField_BuscarCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(TextField_BuscarCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addGap(5, 5, 5))
        );

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel17.setText("Abarrotes punto de venta");

        jLabel26.setText("Nombre:");

        jLabel27.setText("Deuda:");

        jLabel28.setText("Deuda anterior:");

        jLabel29.setText("Deuda actual:");

        jLabel30.setText("Ultimo pago:");

        jLabel31.setText("Fecha:");

        jLabel32.setText("$0.00");

        jLabel33.setText("Nombre");

        jLabel34.setText("$0.00");

        jLabel35.setText("$0.00");

        jLabel36.setText("$0.00");

        jLabel37.setText("Fecha");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel17))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(jLabel36)
                            .addComponent(jLabel35)
                            .addComponent(jLabel34)
                            .addComponent(jLabel33)
                            .addComponent(jLabel32))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel37)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 169, Short.MAX_VALUE)))
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Clientes");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Buscar");

        txtBuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarClienteKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(204, 204, 204)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Configuració del cliente");
        jLabel2.setToolTipText("");

        jrbIngresarCliente.setForeground(new java.awt.Color(0, 153, 51));
        jrbIngresarCliente.setText("Ingresar cliente");
        jrbIngresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbIngresarClienteActionPerformed(evt);
            }
        });

        jrbPagosCliente.setText("Pagos de cliente");
        jrbPagosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPagosClienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Llene la infomacón del nuevo cliente");
        jLabel3.setToolTipText("");

        Label_NombreCliente.setForeground(new java.awt.Color(102, 102, 102));
        Label_NombreCliente.setText("Nombre completo");
        Label_NombreCliente.setToolTipText("");

        TextField_NombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextField_NombreClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextField_NombreClienteKeyTyped(evt);
            }
        });

        Label_ApellidoCliente.setForeground(new java.awt.Color(102, 102, 102));
        Label_ApellidoCliente.setText("Apellido");

        TextField_ApellidioCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextField_ApellidioClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextField_ApellidioClienteKeyTyped(evt);
            }
        });

        Label_DireccionCliente.setForeground(new java.awt.Color(102, 102, 102));
        Label_DireccionCliente.setText("Dirección");
        Label_DireccionCliente.setToolTipText("");

        TextField_DireccioCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextField_DireccioClienteKeyReleased(evt);
            }
        });

        Label_TelefonoCliente.setForeground(new java.awt.Color(102, 102, 102));
        Label_TelefonoCliente.setText("Telefono");

        TextField_TelefonoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextField_TelefonoClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextField_TelefonoClienteKeyTyped(evt);
            }
        });

        lblPagoCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPagoCliente.setForeground(new java.awt.Color(102, 102, 102));
        lblPagoCliente.setText("Pagos de deudas");

        txtPagosCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPagosClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPagosClienteKeyTyped(evt);
            }
        });

        btnGuardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Agregar.png"))); // NOI18N
        btnGuardarCliente.setText("Guardar");
        btnGuardarCliente.setBorder(null);
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });

        Button_EliminarCLT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar.png"))); // NOI18N
        Button_EliminarCLT.setText("Eliminar");
        Button_EliminarCLT.setBorder(null);
        Button_EliminarCLT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_EliminarCLTActionPerformed(evt);
            }
        });

        Button_CancelarCLT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancelar.png"))); // NOI18N
        Button_CancelarCLT.setText("Cancelar");
        Button_CancelarCLT.setBorder(null);
        Button_CancelarCLT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CancelarCLTActionPerformed(evt);
            }
        });

        lblIdCliente.setForeground(new java.awt.Color(102, 102, 102));
        lblIdCliente.setText("ID");
        lblIdCliente.setToolTipText("");

        txtIdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdClienteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jrbIngresarCliente)
                                .addGap(18, 18, 18)
                                .addComponent(jrbPagosCliente))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(btnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_EliminarCLT, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_CancelarCLT, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Label_NombreCliente)
                            .addComponent(TextField_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_ApellidoCliente)
                            .addComponent(TextField_ApellidioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_DireccionCliente)
                            .addComponent(TextField_DireccioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_TelefonoCliente)
                            .addComponent(TextField_TelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPagoCliente)
                            .addComponent(txtPagosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdCliente)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbIngresarCliente)
                    .addComponent(jrbPagosCliente))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(lblIdCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_NombreCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_ApellidoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_ApellidioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Label_DireccionCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_DireccioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_TelefonoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_TelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPagoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPagosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_EliminarCLT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_CancelarCLT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Table_Clientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Table_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Table_Clientes.setRowHeight(20);
        Table_Clientes.setSelectionBackground(new java.awt.Color(102, 204, 255));
        Table_Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_ClientesMouseClicked(evt);
            }
        });
        Table_Clientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Table_ClientesKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(Table_Clientes);

        Button_AnteriorCLT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Left.png"))); // NOI18N
        Button_AnteriorCLT.setText("Anterior ");
        Button_AnteriorCLT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AnteriorCLTActionPerformed(evt);
            }
        });

        Button_SiguienteCLT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Right.png"))); // NOI18N
        Button_SiguienteCLT.setText("Siguiente");
        Button_SiguienteCLT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SiguienteCLTActionPerformed(evt);
            }
        });

        Button_PrimeroCLT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Left-12.png"))); // NOI18N
        Button_PrimeroCLT.setText("Primero");
        Button_PrimeroCLT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PrimeroCLTActionPerformed(evt);
            }
        });

        Button_UltimoCLT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Right-12.png"))); // NOI18N
        Button_UltimoCLT.setText("Ultimo");
        Button_UltimoCLT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_UltimoCLTActionPerformed(evt);
            }
        });

        Label_PaginasClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_PaginasClientes.setForeground(new java.awt.Color(0, 153, 153));
        Label_PaginasClientes.setText("Page");

        btnFacturaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Imprimir.png"))); // NOI18N
        btnFacturaCliente.setText("Factura");
        btnFacturaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2)
                .addGap(10, 10, 10))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(Button_PrimeroCLT, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_AnteriorCLT, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_SiguienteCLT, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_UltimoCLT, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFacturaCliente))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(Label_PaginasClientes)))
                .addGap(28, 28, 28))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_PaginasClientes)
                .addGap(4, 4, 4)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Button_UltimoCLT)
                        .addComponent(btnFacturaCliente))
                    .addComponent(Button_SiguienteCLT, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button_AnteriorCLT, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button_PrimeroCLT, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Table_ReportesCLT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Table_ReportesCLT.setRowHeight(20);
        Table_ReportesCLT.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane3.setViewportView(Table_ReportesCLT);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Reportes");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Clientes.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("©PDHN");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(5, 5, 5))
        );

        panReciboCliente.setBackground(new java.awt.Color(255, 255, 255));
        panReciboCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel77.setText("Recibo");

        jLabel78.setText("Nombre:");

        jLabel79.setText("Apellido:");

        jLabel80.setText("Deuda actual:");

        jLabel81.setText("Ultimo pago:");

        jLabel83.setText("Fecha:");

        lblDeudaActualCLT.setText("$0.00");

        lblNombreCLT.setText("Nombre");

        lblApellidoCLT.setText("Apellido");

        lblUltimoPagoCLT.setText("$0.00");

        lblFechaPagoCLT.setText("Fecha");

        javax.swing.GroupLayout panReciboClienteLayout = new javax.swing.GroupLayout(panReciboCliente);
        panReciboCliente.setLayout(panReciboClienteLayout);
        panReciboClienteLayout.setHorizontalGroup(
            panReciboClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panReciboClienteLayout.createSequentialGroup()
                .addGroup(panReciboClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panReciboClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panReciboClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel78)
                            .addComponent(jLabel79)
                            .addComponent(jLabel80)
                            .addComponent(jLabel81)
                            .addComponent(jLabel83))
                        .addGap(16, 16, 16)
                        .addGroup(panReciboClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreCLT)
                            .addComponent(lblDeudaActualCLT)
                            .addGroup(panReciboClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblUltimoPagoCLT)
                                .addComponent(lblFechaPagoCLT))
                            .addComponent(lblApellidoCLT, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panReciboClienteLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel77)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panReciboClienteLayout.setVerticalGroup(
            panReciboClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panReciboClienteLayout.createSequentialGroup()
                .addComponent(jLabel77)
                .addGap(18, 18, 18)
                .addGroup(panReciboClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(lblNombreCLT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panReciboClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(lblApellidoCLT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(panReciboClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(lblDeudaActualCLT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panReciboClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(lblUltimoPagoCLT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panReciboClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(lblFechaPagoCLT)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panReciboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panReciboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Clientes", jPanel2);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 153, 153));
        jLabel38.setText("Configuració del cliente");
        jLabel38.setToolTipText("");

        jrbIngresarCliente1.setForeground(new java.awt.Color(0, 153, 51));
        jrbIngresarCliente1.setText("Ingresar cliente");

        jrbPagosCliente1.setText("Pagos de cliente");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 153, 153));
        jLabel39.setText("Llene la infomacón del nuevo cliente");
        jLabel39.setToolTipText("");

        Label_NombreCliente3.setForeground(new java.awt.Color(102, 102, 102));
        Label_NombreCliente3.setText("Nombre completo");
        Label_NombreCliente3.setToolTipText("");

        Label_ApellidoCliente2.setForeground(new java.awt.Color(102, 102, 102));
        Label_ApellidoCliente2.setText("Apellido");

        Label_DireccionCliente2.setForeground(new java.awt.Color(102, 102, 102));
        Label_DireccionCliente2.setText("Dirección");
        Label_DireccionCliente2.setToolTipText("");

        Label_TelefonoCliente3.setForeground(new java.awt.Color(102, 102, 102));
        Label_TelefonoCliente3.setText("Telefono");

        lblPagoCliente1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPagoCliente1.setForeground(new java.awt.Color(102, 102, 102));
        lblPagoCliente1.setText("Pagos de deudas");

        btnGuardarCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Agregar.png"))); // NOI18N
        btnGuardarCliente1.setText("Guardar");
        btnGuardarCliente1.setBorder(null);

        Button_EliminarCLT3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar.png"))); // NOI18N
        Button_EliminarCLT3.setText("Eliminar");
        Button_EliminarCLT3.setBorder(null);

        Button_CancelarCLT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancelar.png"))); // NOI18N
        Button_CancelarCLT2.setText("Cancelar");
        Button_CancelarCLT2.setBorder(null);

        Label_IdCliente1.setForeground(new java.awt.Color(102, 102, 102));
        Label_IdCliente1.setText("ID");
        Label_IdCliente1.setToolTipText("");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(jrbIngresarCliente1)
                                .addGap(18, 18, 18)
                                .addComponent(jrbPagosCliente1))
                            .addComponent(jLabel38)
                            .addComponent(jLabel39))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(btnGuardarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_EliminarCLT3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_CancelarCLT2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Label_NombreCliente3)
                            .addComponent(TextField_NombreCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_ApellidoCliente2)
                            .addComponent(TextField_ApellidioCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_DireccionCliente2)
                            .addComponent(TextField_DireccioCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_TelefonoCliente3)
                            .addComponent(TextField_TelefonoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPagoCliente1)
                            .addComponent(txtPagosCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_IdCliente1)
                            .addComponent(txtIdCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38)
                .addGap(18, 18, 18)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbIngresarCliente1)
                    .addComponent(jrbPagosCliente1))
                .addGap(18, 18, 18)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(Label_IdCliente1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_NombreCliente3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_NombreCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_ApellidoCliente2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_ApellidioCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Label_DireccionCliente2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_DireccioCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_TelefonoCliente3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_TelefonoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPagoCliente1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPagosCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_EliminarCLT3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_CancelarCLT2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 153, 153));
        jLabel40.setText("Clientes");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 153, 153));
        jLabel41.setText("Buscar");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addGap(204, 204, 204)
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addComponent(TextField_BuscarCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(TextField_BuscarCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblProveedores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblProveedores.setRowHeight(20);
        tblProveedores.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane11.setViewportView(tblProveedores);

        Button_AnteriorCLT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Left.png"))); // NOI18N
        Button_AnteriorCLT2.setText("Anterior ");

        Button_SiguienteCLT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Right.png"))); // NOI18N
        Button_SiguienteCLT2.setText("Siguiente");

        Button_PrimeroCLT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Left-12.png"))); // NOI18N
        Button_PrimeroCLT2.setText("Primero");

        Button_UltimoCLT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Right-12.png"))); // NOI18N
        Button_UltimoCLT2.setText("Ultimo");

        Label_PaginasClientes1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_PaginasClientes1.setForeground(new java.awt.Color(0, 153, 153));
        Label_PaginasClientes1.setText("Page");

        btnFacturaCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Imprimir.png"))); // NOI18N
        btnFacturaCliente1.setText("Factura");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane11)
                .addGap(10, 10, 10))
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(Button_PrimeroCLT2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_AnteriorCLT2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_SiguienteCLT2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_UltimoCLT2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFacturaCliente1))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(Label_PaginasClientes1)))
                .addGap(28, 28, 28))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_PaginasClientes1)
                .addGap(4, 4, 4)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Button_UltimoCLT2)
                        .addComponent(btnFacturaCliente1))
                    .addComponent(Button_SiguienteCLT2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button_AnteriorCLT2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button_PrimeroCLT2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblReportesPV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblReportesPV.setRowHeight(20);
        tblReportesPV.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane12.setViewportView(tblReportesPV);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 153, 153));
        jLabel42.setText("Reportes");

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Clientes.png"))); // NOI18N

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setText("©PDHN");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane12))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel43)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel44)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44)
                .addGap(5, 5, 5))
        );

        panReciboCliente1.setBackground(new java.awt.Color(255, 255, 255));
        panReciboCliente1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel82.setText("Recibo");

        jLabel84.setText("Nombre:");

        jLabel85.setText("Apellido:");

        jLabel86.setText("Deuda actual:");

        jLabel87.setText("Ultimo pago:");

        jLabel88.setText("Fecha:");

        lblDeudaActualCLT1.setText("$0.00");

        lblNombreCLT1.setText("Nombre");

        lblApellidoCLT1.setText("Apellido");

        lblUltimoPagoCLT1.setText("$0.00");

        lblFechaPagoCLT1.setText("Fecha");

        javax.swing.GroupLayout panReciboCliente1Layout = new javax.swing.GroupLayout(panReciboCliente1);
        panReciboCliente1.setLayout(panReciboCliente1Layout);
        panReciboCliente1Layout.setHorizontalGroup(
            panReciboCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panReciboCliente1Layout.createSequentialGroup()
                .addGroup(panReciboCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panReciboCliente1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panReciboCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel84)
                            .addComponent(jLabel85)
                            .addComponent(jLabel86)
                            .addComponent(jLabel87)
                            .addComponent(jLabel88))
                        .addGap(16, 16, 16)
                        .addGroup(panReciboCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreCLT1)
                            .addComponent(lblDeudaActualCLT1)
                            .addGroup(panReciboCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblUltimoPagoCLT1)
                                .addComponent(lblFechaPagoCLT1))
                            .addComponent(lblApellidoCLT1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panReciboCliente1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel82)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panReciboCliente1Layout.setVerticalGroup(
            panReciboCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panReciboCliente1Layout.createSequentialGroup()
                .addComponent(jLabel82)
                .addGap(18, 18, 18)
                .addGroup(panReciboCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(lblNombreCLT1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panReciboCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(lblApellidoCLT1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(panReciboCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(lblDeudaActualCLT1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panReciboCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(lblUltimoPagoCLT1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panReciboCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(lblFechaPagoCLT1)))
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panReciboCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panReciboCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Proveedores", jPanel28);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
        jPanel11.setPreferredSize(new java.awt.Dimension(310, 352));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setText("Llene la información del nuevo producto");
        jLabel11.setToolTipText("");

        Label_CodigoPDT.setText("Código de barra");
        Label_CodigoPDT.setToolTipText("");

        Label_DescripcionPDT.setText("Descripción");

        Label_UnidadPDT.setText("Precio unidad");
        Label_UnidadPDT.setToolTipText("");

        Label_MayoreoPDT.setText("Precio mayoreo");

        Label_DepartamentoPDT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Label_DepartamentoPDT.setForeground(new java.awt.Color(0, 204, 51));
        Label_DepartamentoPDT.setText("Departamento");

        Button_GuardarPDT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Agregar.png"))); // NOI18N
        Button_GuardarPDT.setText("Guardar");
        Button_GuardarPDT.setBorder(null);

        Button_EliminarCLT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar.png"))); // NOI18N
        Button_EliminarCLT1.setText("Eliminar");
        Button_EliminarCLT1.setBorder(null);

        Button_CancelarPDT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancelar.png"))); // NOI18N
        Button_CancelarPDT.setText("Cancelar");
        Button_CancelarPDT.setBorder(null);

        Label_CategoriaPDT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Label_CategoriaPDT.setForeground(new java.awt.Color(0, 204, 51));
        Label_CategoriaPDT.setText("Categoria");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(Label_CodigoPDT)
                            .addComponent(TextField_CodigoPDT, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_DescripcionPDT)
                            .addComponent(TextField_DescripcionPDT, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_UnidadPDT))
                        .addContainerGap(83, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextField_PrecioUnidadPDT, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_MayoreoPDT)
                            .addComponent(Label_DepartamentoPDT)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(Button_GuardarPDT, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_EliminarCLT1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_CancelarPDT, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Label_CategoriaPDT)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ComboBox_Categoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboBox_Departamento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextField_PrecioMayoreoPDT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
                        .addGap(0, 17, Short.MAX_VALUE))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label_CodigoPDT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_CodigoPDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_DescripcionPDT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_DescripcionPDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Label_UnidadPDT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_PrecioUnidadPDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_MayoreoPDT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_PrecioMayoreoPDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_DepartamentoPDT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBox_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_CategoriaPDT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBox_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_GuardarPDT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_EliminarCLT1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_CancelarPDT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Table_ComprasPDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Table_ComprasPDT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Table_ComprasPDT.setRowHeight(20);
        Table_ComprasPDT.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane4.setViewportView(Table_ComprasPDT);

        Label1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label1.setForeground(new java.awt.Color(255, 102, 0));
        Label1.setText("Productos comprados");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(Label1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addComponent(Label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Table_BodegaPDT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Table_BodegaPDT.setRowHeight(20);
        Table_BodegaPDT.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane5.setViewportView(Table_BodegaPDT);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("©PDHN");

        Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label.setForeground(new java.awt.Color(255, 102, 0));
        Label.setText("Productos en bodega ");

        Button_PrimeroPDT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Left-12.png"))); // NOI18N
        Button_PrimeroPDT.setText("Primero");

        Button_AnteriorPDT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Left.png"))); // NOI18N
        Button_AnteriorPDT.setText("Anterior ");

        Button_SiguientePDT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Right.png"))); // NOI18N
        Button_SiguientePDT.setText("Siguiente");

        Button_UltimoPDT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Right-12.png"))); // NOI18N
        Button_UltimoPDT.setText("Ultimo");

        Label_Paginas1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_Paginas1.setForeground(new java.awt.Color(255, 102, 0));
        Label_Paginas1.setText("Page");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Buscar");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField_BuscarPDT, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Label)
                        .addGap(0, 276, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel14))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(Button_PrimeroPDT, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_AnteriorPDT, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_SiguientePDT, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_UltimoPDT, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(Label_Paginas1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label)
                    .addComponent(jLabel6)
                    .addComponent(TextField_BuscarPDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_Paginas1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_AnteriorPDT)
                    .addComponent(Button_PrimeroPDT)
                    .addComponent(Button_SiguientePDT)
                    .addComponent(Button_UltimoPDT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("Productos");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab3", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 204));
        jLabel13.setText("Configuració del cliente");
        jLabel13.setToolTipText("");

        RadioButton_Dpt.setForeground(new java.awt.Color(0, 153, 51));
        RadioButton_Dpt.setText("Dpt.");

        RadioButton_Cat.setText("Cat.");

        Button_GuardarCatDpt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Agregar.png"))); // NOI18N
        Button_GuardarCatDpt.setText("Guardar");
        Button_GuardarCatDpt.setBorder(null);

        Button_EliminarCatDpt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar.png"))); // NOI18N
        Button_EliminarCatDpt.setText("Eliminar");
        Button_EliminarCatDpt.setBorder(null);

        Button_CancelarCatDpt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancelar.png"))); // NOI18N
        Button_CancelarCatDpt.setText("Cancelar");
        Button_CancelarCatDpt.setBorder(null);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Label_Cat.setText("Categoria");
        Label_Cat.setToolTipText("");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_Cat)
                    .addComponent(TextField_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Cat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Label_Dpt.setText("Departamento");
        Label_Dpt.setToolTipText("");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_Dpt)
                    .addComponent(TextField_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Dpt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(Button_GuardarCatDpt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_EliminarCatDpt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_CancelarCatDpt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(RadioButton_Dpt)
                                .addGap(18, 18, 18)
                                .addComponent(RadioButton_Cat))
                            .addComponent(jLabel13))
                        .addContainerGap(150, Short.MAX_VALUE))))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButton_Dpt)
                    .addComponent(RadioButton_Cat))
                .addGap(18, 18, 18)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_GuardarCatDpt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_EliminarCatDpt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_CancelarCatDpt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Table_Dpt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Table_Dpt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Table_Dpt.setRowHeight(20);
        Table_Dpt.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane6.setViewportView(Table_Dpt);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
        );

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 153, 204));
        jLabel22.setText("Dpt and Cat");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 153, 204));
        jLabel23.setText("Buscar");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(204, 204, 204)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(TextField_BuscarDpt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(405, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(TextField_BuscarDpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Table_Cat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Table_Cat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Table_Cat.setRowHeight(20);
        Table_Cat.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane8.setViewportView(Table_Cat);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("tab4", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(java.awt.SystemColor.activeCaption);
        jLabel10.setText("Llene la información del producto");
        jLabel10.setToolTipText("");

        RadioButton_Unidad.setForeground(new java.awt.Color(0, 153, 51));
        RadioButton_Unidad.setSelected(true);
        RadioButton_Unidad.setText("Por unidad ");

        RadioButton_Mayoreo.setText("Por mayoreo");

        Label_DescripcionCP.setText("Descripción");
        Label_DescripcionCP.setToolTipText("");

        Label_CantidadCP.setText("Cantidad");
        Label_CantidadCP.setToolTipText("");

        Label_PrecioCP.setText("Precio");

        Label_ImporteCP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Label_ImporteCP.setText("Importe");

        Button_GuardarCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Agregar.png"))); // NOI18N
        Button_GuardarCliente1.setText("Guardar");
        Button_GuardarCliente1.setBorder(null);

        Button_EliminarCLT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar.png"))); // NOI18N
        Button_EliminarCLT2.setText("Eliminar");
        Button_EliminarCLT2.setBorder(null);

        Button_CancelarCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancelar.png"))); // NOI18N
        Button_CancelarCompras.setText("Cancelar");
        Button_CancelarCompras.setBorder(null);

        Label_NombreCliente2.setForeground(new java.awt.Color(0, 153, 51));
        Label_NombreCliente2.setText("Se compra");
        Label_NombreCliente2.setToolTipText("");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(Label_DescripcionCP)
                            .addComponent(TextField_DescripcionCP, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(88, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(Button_GuardarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_EliminarCLT2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_CancelarCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Label_NombreCliente2)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(RadioButton_Unidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RadioButton_Mayoreo))
                            .addComponent(Label_CantidadCP)
                            .addComponent(TextField_CantidadCP, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_PrecioCP)
                            .addComponent(TextField_PrecioCP, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_ImporteCP)
                            .addComponent(TextField_ImporteCP, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(Label_DescripcionCP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_DescripcionCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_NombreCliente2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButton_Unidad)
                    .addComponent(RadioButton_Mayoreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label_CantidadCP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_CantidadCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_PrecioCP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_PrecioCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_ImporteCP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_ImporteCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_GuardarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_EliminarCLT2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_CancelarCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Table_Compras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Table_Compras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Table_Compras.setRowHeight(20);
        Table_Compras.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane9.setViewportView(Table_Compras);

        Button_AnteriorCP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Left.png"))); // NOI18N
        Button_AnteriorCP.setText("Anterior ");

        Button_SiguienteCP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Right.png"))); // NOI18N
        Button_SiguienteCP.setText("Siguiente");

        Button_PrimeroCP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Left-12.png"))); // NOI18N
        Button_PrimeroCP.setText("Primero");

        Button_UltimoCP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Right-12.png"))); // NOI18N
        Button_UltimoCP.setText("Ultimo");

        Label_Paginas2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_Paginas2.setForeground(java.awt.SystemColor.activeCaption);
        Label_Paginas2.setText("Page");

        Button_Factura1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Imprimir.png"))); // NOI18N
        Button_Factura1.setText("Factura");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane9)
                .addGap(10, 10, 10))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(Button_PrimeroCP, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_AnteriorCP, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_SiguienteCP, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_UltimoCP, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_Factura1))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(Label_Paginas2)))
                .addGap(28, 28, 28))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_Paginas2)
                .addGap(4, 4, 4)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Button_UltimoCP)
                        .addComponent(Button_Factura1))
                    .addComponent(Button_SiguienteCP, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button_AnteriorCP, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button_PrimeroCP, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setForeground(java.awt.SystemColor.activeCaption);
        jLabel18.setText("Compras");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(java.awt.SystemColor.activeCaption);
        jLabel19.setText("Buscar");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(204, 204, 204)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(TextField_BuscarCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(TextField_BuscarCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab5", jPanel5);

        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon-diagram.png"))); // NOI18N
        btnProveedores.setText("Proveedores");
        btnProveedores.setToolTipText("");
        btnProveedores.setBorder(null);
        btnProveedores.setBorderPainted(false);
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Button_Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button_Poductos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button_Cat_Dpt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button_Compras, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Poductos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Compras, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Cat_Dpt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="CODIGO PAGINADOR">
    private void cargarDatos() {
        switch (tab) {
            case 1:
                numCliente = cliente.getClientes();
                cliente.searchCliente(Table_Clientes, "", numRegistro, pageSize);
                maxReg = numCliente.size();
                break;
        }
        pageCount = (maxReg / pageSize);
        //Ajuste el numero de la pagina si la ultima pagina contiene una parte de la pagina
        if ((maxReg % pageSize) > 0) {
            pageCount += 1;
        }
        Label_PaginasClientes.setText("Paginas " + "1" + "/ " + String.valueOf(pageCount));
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CODIGO CLIENTE">
    private void Button_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ClienteActionPerformed
        jTabbedPane1.setSelectedIndex(1);
        tab = 1;
        Button_Ventas.setEnabled(true);
        Button_Cliente.setEnabled(false);
        Button_Poductos.setEnabled(true);
        Button_Cat_Dpt.setEnabled(true);
        Button_Compras.setEnabled(true);
        accion = "insert";
        cargarDatos();
    }//GEN-LAST:event_Button_ClienteActionPerformed

    private void jrbIngresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbIngresarClienteActionPerformed
        jrbIngresarCliente.setForeground(fieldOk);
        jrbPagosCliente.setForeground(Color.black);
        txtIdCliente.setEnabled(true);
        TextField_NombreCliente.setEnabled(true);
        TextField_ApellidioCliente.setEnabled(true);
        TextField_DireccioCliente.setEnabled(true);
        TextField_TelefonoCliente.setEnabled(true);
        txtPagosCliente.setEnabled(false);
        jrbPagosCliente.setSelected(false);
    }//GEN-LAST:event_jrbIngresarClienteActionPerformed

    private void jrbPagosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPagosClienteActionPerformed
        jrbPagosCliente.setForeground(fieldOk);
        jrbIngresarCliente.setForeground(Color.black);
        txtIdCliente.setEnabled(false);
        TextField_NombreCliente.setEnabled(false);
        TextField_ApellidioCliente.setEnabled(false);
        TextField_DireccioCliente.setEnabled(false);
        TextField_TelefonoCliente.setEnabled(false);
        txtPagosCliente.setEnabled(true);
        jrbIngresarCliente.setSelected(false);
        
    }//GEN-LAST:event_jrbPagosClienteActionPerformed

    private void txtIdClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdClienteKeyReleased
        if (txtIdCliente.getText().equals("")) {
            lblIdCliente.setForeground(fieldEmpty);
        } else {
            lblIdCliente.setText("ID");
            lblIdCliente.setForeground(fieldOk);
        }
    }//GEN-LAST:event_txtIdClienteKeyReleased

    private void txtIdClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdClienteKeyTyped
        evento.numberKeyPress(evt);
    }//GEN-LAST:event_txtIdClienteKeyTyped

    private void TextField_NombreClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_NombreClienteKeyReleased
        if (TextField_NombreCliente.getText().equals("")) {
            Label_NombreCliente.setForeground(fieldEmpty);
        } else {
            Label_NombreCliente.setText("Nombre completo");
            Label_NombreCliente.setForeground(fieldOk);
        }
    }//GEN-LAST:event_TextField_NombreClienteKeyReleased

    private void TextField_NombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_NombreClienteKeyTyped
        evento.textKeyPress(evt);
    }//GEN-LAST:event_TextField_NombreClienteKeyTyped

    private void TextField_ApellidioClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_ApellidioClienteKeyReleased
        if (TextField_ApellidioCliente.getText().equals("")) {
            Label_ApellidoCliente.setForeground(fieldEmpty);
        } else {
            Label_ApellidoCliente.setText("Apellido");
            Label_ApellidoCliente.setForeground(fieldOk);
        }
    }//GEN-LAST:event_TextField_ApellidioClienteKeyReleased

    private void TextField_ApellidioClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_ApellidioClienteKeyTyped
        evento.textKeyPress(evt);
    }//GEN-LAST:event_TextField_ApellidioClienteKeyTyped

    private void TextField_DireccioClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_DireccioClienteKeyReleased
        if (TextField_DireccioCliente.getText().equals("")) {
            Label_DireccionCliente.setForeground(fieldEmpty);
        } else {
            Label_DireccionCliente.setText("Dirección");
            Label_DireccionCliente.setForeground(fieldOk);
        }
    }//GEN-LAST:event_TextField_DireccioClienteKeyReleased

    private void TextField_TelefonoClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_TelefonoClienteKeyReleased
        if (TextField_TelefonoCliente.getText().equals("")) {
            Label_TelefonoCliente.setForeground(fieldEmpty);
        } else {
            Label_TelefonoCliente.setText("Telefono");
            Label_TelefonoCliente.setForeground(fieldOk);
        }
    }//GEN-LAST:event_TextField_TelefonoClienteKeyReleased

    private void TextField_TelefonoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_TelefonoClienteKeyTyped
        evento.numberKeyPress(evt);
    }//GEN-LAST:event_TextField_TelefonoClienteKeyTyped

    private void txtPagosClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagosClienteKeyReleased
        if (Table_ReportesCLT.getRowCount() == 0) {
            lblPagoCliente.setText("Seleccione el cliente");
            lblPagoCliente.setForeground(fieldWrong);
        } else {
            if (!txtPagosCliente.getText().equals("")) {
                lblPagoCliente.setText("Pagos de deudas");
                lblPagoCliente.setForeground(fieldOk);
                String deuda1 = (String) tablaModelReporteCLT.getValueAt(0, 3);
                double deuda2, deuda3, deudaTotal;
                pattern = Pattern.compile("[$]");
                matcher = pattern.matcher(deuda1);
                deuda1 = matcher.replaceAll("");
                deuda2 = formato.reconstruir(deuda1);
                deuda3 = Double.parseDouble(txtPagosCliente.getText());
                pago = formato.decimal(deuda3);
                deudaTotal = deuda2 - deuda3;
                deudaActual = formato.decimal(deudaTotal);
            }
        }
    }//GEN-LAST:event_txtPagosClienteKeyReleased

    private void txtPagosClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagosClienteKeyTyped
        evento.numberDecimalKeyPress(evt, txtPagosCliente);
    }//GEN-LAST:event_txtPagosClienteKeyTyped

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
        if (jrbIngresarCliente.isSelected()) {
            guardarCliente();
        }else{
            guardarReporte();
        }
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void Button_PrimeroCLTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PrimeroCLTActionPerformed
        numPagina = 0;
        Label_PaginasClientes.setText("Paginas 1/ " + String.valueOf(pageCount));
        cliente.searchCliente(Table_Clientes, "", numPagina, pageSize);
    }//GEN-LAST:event_Button_PrimeroCLTActionPerformed

    private void Button_AnteriorCLTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AnteriorCLTActionPerformed
        if (pageCount != 1) {
            if (numPagina > 0) {
                if (pageCount == numPagina) {
                    numPagina -= 1;
                }
                Label_PaginasClientes.setText("Paginas " + String.valueOf(numPagina) + "/ " + String.valueOf(pageCount));
                numPagina -= 1;
                numRegistro = pageSize * numPagina;
                cliente.searchCliente(Table_Clientes, "", numRegistro, pageSize);
            }
        }
    }//GEN-LAST:event_Button_AnteriorCLTActionPerformed

    private void Button_SiguienteCLTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SiguienteCLTActionPerformed
        if (pageCount != 1) {
            if (numPagina < pageCount) {
                if (numPagina == 0) {
                    numPagina += 1;
                }
                numRegistro = pageSize * numPagina;
                cliente.searchCliente(Table_Clientes, "", numRegistro, pageSize);
                numPagina += 1;
                Label_PaginasClientes.setText("Paginas " + String.valueOf(numPagina) + "/ " + String.valueOf(pageCount));
            }
        }
    }//GEN-LAST:event_Button_SiguienteCLTActionPerformed

    private void Button_UltimoCLTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_UltimoCLTActionPerformed
        numPagina = pageCount;
        numPagina--;
        numRegistro = pageSize * numPagina;
        Label_PaginasClientes.setText("Paginas " + String.valueOf(pageCount) + "/ " + String.valueOf(pageCount));
        cliente.searchCliente(Table_Clientes, "", numRegistro, pageSize);
        numPagina = pageCount;
    }//GEN-LAST:event_Button_UltimoCLTActionPerformed

    private void Button_CancelarCLTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CancelarCLTActionPerformed
        reestablecerCliente();
    }//GEN-LAST:event_Button_CancelarCLTActionPerformed

    private void Table_ClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Table_ClientesKeyReleased
        if (Table_Clientes.getSelectedRows().length > 0) {
            datosCliente();
        }
    }//GEN-LAST:event_Table_ClientesKeyReleased

    private void Table_ClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_ClientesMouseClicked
        if (Table_Clientes.getSelectedRows().length > 0) {
            datosCliente();
        }
    }//GEN-LAST:event_Table_ClientesMouseClicked

    private void Button_EliminarCLTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_EliminarCLTActionPerformed
        if (idCliente == 0) {
            JOptionPane.showMessageDialog(null, "Selecciones un cliente para eliminar");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Desea eliminar los registros", "Eliminar registros", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                cliente.deleteCliente(idCliente, idRegistro);
                reestablecerCliente();
            }
        }
    }//GEN-LAST:event_Button_EliminarCLTActionPerformed

    private void btnFacturaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaClienteActionPerformed
        cliente.imprimirRecibo(panReciboCliente);
    }//GEN-LAST:event_btnFacturaClienteActionPerformed

    private void txtBuscarClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarClienteKeyReleased
        cliente.searchCliente(Table_Clientes, txtBuscarCliente.getText(), numPagina, pageSize);
    }//GEN-LAST:event_txtBuscarClienteKeyReleased

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void datosCliente() {
        accion = "update";
        tablaModeloCLT = cliente.getModelo();
        int filas = Table_Clientes.getSelectedRow();
        idCliente = Integer.valueOf((String) tablaModeloCLT.getValueAt(filas, 0));
        txtIdCliente.setText((String) tablaModeloCLT.getValueAt(filas, 1));
        TextField_NombreCliente.setText((String) tablaModeloCLT.getValueAt(filas, 2));
        TextField_ApellidioCliente.setText((String) tablaModeloCLT.getValueAt(filas, 3));
        TextField_DireccioCliente.setText((String) tablaModeloCLT.getValueAt(filas, 4));
        TextField_TelefonoCliente.setText((String) tablaModeloCLT.getValueAt(filas, 5));

        tablaModelReporteCLT = cliente.reportesCliente(Table_ReportesCLT, idCliente);
        idRegistro = Integer.valueOf((String) tablaModelReporteCLT.getValueAt(0, 0));
        lblNombreCLT.setText((String) tablaModelReporteCLT.getValueAt(0, 1));
        lblApellidoCLT.setText((String) tablaModelReporteCLT.getValueAt(0, 2));
        lblDeudaActualCLT.setText((String) tablaModelReporteCLT.getValueAt(0, 3));
        lblUltimoPagoCLT.setText((String) tablaModelReporteCLT.getValueAt(0, 5));
        lblFechaPagoCLT.setText((String) tablaModelReporteCLT.getValueAt(0, 6));
    }

    private void reestablecerCliente() {
        accion = "insert";
        idCliente = 0;
        idRegistro = 0;
        numRegistro = 0;
        numPagina = 0;
        txtIdCliente.setText("");
        TextField_NombreCliente.setText("");
        TextField_ApellidioCliente.setText("");
        TextField_DireccioCliente.setText("");
        TextField_TelefonoCliente.setText("");
        txtPagosCliente.setText("");
        txtIdCliente.setEnabled(true);
        TextField_NombreCliente.setEnabled(true);
        TextField_ApellidioCliente.setEnabled(true);
        TextField_DireccioCliente.setEnabled(true);
        TextField_TelefonoCliente.setEnabled(true);
        txtPagosCliente.setEnabled(false);
        lblIdCliente.setForeground(fieldEmpty);
        lblIdCliente.setText("ID");
        Label_NombreCliente.setForeground(fieldEmpty);
        Label_NombreCliente.setText("Nombre completo");
        Label_ApellidoCliente.setForeground(fieldEmpty);
        Label_ApellidoCliente.setText("Apellido");
        Label_DireccionCliente.setForeground(fieldEmpty);
        Label_DireccionCliente.setText("Dirección");
        Label_TelefonoCliente.setForeground(fieldEmpty);
        Label_TelefonoCliente.setText("Telefono");
        lblPagoCliente.setForeground(fieldEmpty);
        lblPagoCliente.setText("Pagos de deudas");
        jrbIngresarCliente.setSelected(true);
        jrbPagosCliente.setSelected(false);
        jrbIngresarCliente.setForeground(fieldOk);
        jrbPagosCliente.setForeground(Color.BLACK);
        cargarDatos();
        cliente.reportesCliente(Table_ReportesCLT, idCliente);
        lblNombreCLT.setText("Nombre");
        lblApellidoCLT.setText("Apellido");
        lblDeudaActualCLT.setText("$0.00");
        lblUltimoPagoCLT.setText("$0.00");
        lblFechaPagoCLT.setText("Fecha");
    }

    private void guardarCliente() {
        if (txtIdCliente.getText().equals("")) {
            lblIdCliente.setText("Ingrese el ID");
            lblIdCliente.setForeground(fieldWrong);
            txtIdCliente.requestFocus();
        } else if (TextField_NombreCliente.getText().equals("")) {
            Label_NombreCliente.setText("Ingrese el nombre completo");
            Label_NombreCliente.setForeground(fieldWrong);
            TextField_NombreCliente.requestFocus();
        } else if (TextField_ApellidioCliente.getText().equals("")) {
            Label_ApellidoCliente.setText("Ingrese el apellido");
            Label_ApellidoCliente.setForeground(fieldWrong);
            TextField_ApellidioCliente.requestFocus();
        } else if (TextField_DireccioCliente.getText().equals("")) {
            Label_DireccionCliente.setText("Ingrese la dirección");
            Label_DireccionCliente.setForeground(fieldWrong);
            TextField_DireccioCliente.requestFocus();
        } else if (TextField_TelefonoCliente.getText().equals("")) {
            Label_TelefonoCliente.setText("Ingrese el telefono");
            Label_TelefonoCliente.setForeground(fieldWrong);
            TextField_TelefonoCliente.requestFocus();
        } else {
            String id = txtIdCliente.getText();
            String nombre = TextField_NombreCliente.getText();
            String apellido = TextField_ApellidioCliente.getText();
            String direccion = TextField_DireccioCliente.getText();
            String telefono = TextField_TelefonoCliente.getText();
            switch (accion) {
                case "insert":
                    cliente.insertCliente(id, nombre, apellido, direccion, telefono);
                    break;
                case "update":
                    cliente.updateCliente(id, nombre, apellido, direccion, telefono, idCliente);
                    break;
            }
            reestablecerCliente();
        }
    }
    
    private void guardarReporte(){
        if (txtPagosCliente.getText().equals("")) {
            lblPagoCliente.setText("Pagos de deudas");
            lblPagoCliente.setForeground(fieldWrong);
            txtPagosCliente.requestFocus();
        }else{
            cliente.updateReportes(deudaActual, fecha, pago, idCliente);
            reestablecerCliente();
        }
    }
    //</editor-fold>

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    //<editor-fold defaultstate="collapsed" desc="CONTROLS">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_AnteriorCLT;
    private javax.swing.JButton Button_AnteriorCLT1;
    private javax.swing.JButton Button_AnteriorCLT2;
    private javax.swing.JButton Button_AnteriorCP;
    private javax.swing.JButton Button_AnteriorPDT;
    private javax.swing.JButton Button_CancelarCLT;
    private javax.swing.JButton Button_CancelarCLT1;
    private javax.swing.JButton Button_CancelarCLT2;
    private javax.swing.JButton Button_CancelarCatDpt;
    private javax.swing.JButton Button_CancelarCompras;
    private javax.swing.JButton Button_CancelarPDT;
    private javax.swing.JButton Button_Cat_Dpt;
    private javax.swing.JButton Button_Cliente;
    private javax.swing.JButton Button_Compras;
    private javax.swing.JButton Button_EliminarCLT;
    private javax.swing.JButton Button_EliminarCLT1;
    private javax.swing.JButton Button_EliminarCLT2;
    private javax.swing.JButton Button_EliminarCLT3;
    private javax.swing.JButton Button_EliminarCatDpt;
    private javax.swing.JButton Button_Factura1;
    private javax.swing.JButton Button_Factura2;
    private javax.swing.JButton Button_GuardarCatDpt;
    private javax.swing.JButton Button_GuardarCliente1;
    private javax.swing.JButton Button_GuardarCliente2;
    private javax.swing.JButton Button_GuardarPDT;
    private javax.swing.JButton Button_Poductos;
    private javax.swing.JButton Button_PrimeroCLT;
    private javax.swing.JButton Button_PrimeroCLT1;
    private javax.swing.JButton Button_PrimeroCLT2;
    private javax.swing.JButton Button_PrimeroCP;
    private javax.swing.JButton Button_PrimeroPDT;
    private javax.swing.JButton Button_SiguienteCLT;
    private javax.swing.JButton Button_SiguienteCLT1;
    private javax.swing.JButton Button_SiguienteCLT2;
    private javax.swing.JButton Button_SiguienteCP;
    private javax.swing.JButton Button_SiguientePDT;
    private javax.swing.JButton Button_UltimoCLT;
    private javax.swing.JButton Button_UltimoCLT1;
    private javax.swing.JButton Button_UltimoCLT2;
    private javax.swing.JButton Button_UltimoCP;
    private javax.swing.JButton Button_UltimoPDT;
    private javax.swing.JButton Button_Ventas;
    private javax.swing.JComboBox ComboBox_Categoria;
    private javax.swing.JComboBox ComboBox_Departamento;
    private javax.swing.JLabel Label;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label_ApellidoCliente;
    private javax.swing.JLabel Label_ApellidoCliente1;
    private javax.swing.JLabel Label_ApellidoCliente2;
    private javax.swing.JLabel Label_CantidadCP;
    private javax.swing.JLabel Label_Cat;
    private javax.swing.JLabel Label_CategoriaPDT;
    private javax.swing.JLabel Label_CodigoPDT;
    private javax.swing.JLabel Label_DepartamentoPDT;
    private javax.swing.JLabel Label_DescripcionCP;
    private javax.swing.JLabel Label_DescripcionPDT;
    private javax.swing.JLabel Label_DireccionCliente;
    private javax.swing.JLabel Label_DireccionCliente1;
    private javax.swing.JLabel Label_DireccionCliente2;
    private javax.swing.JLabel Label_Dpt;
    private javax.swing.JLabel Label_IdCliente1;
    private javax.swing.JLabel Label_ImporteCP;
    private javax.swing.JLabel Label_MayoreoPDT;
    private javax.swing.JLabel Label_NombreCliente;
    private javax.swing.JLabel Label_NombreCliente1;
    private javax.swing.JLabel Label_NombreCliente2;
    private javax.swing.JLabel Label_NombreCliente3;
    private javax.swing.JLabel Label_Paginas1;
    private javax.swing.JLabel Label_Paginas2;
    private javax.swing.JLabel Label_Paginas3;
    private javax.swing.JLabel Label_PaginasClientes;
    private javax.swing.JLabel Label_PaginasClientes1;
    private javax.swing.JLabel Label_Pago1;
    private javax.swing.JLabel Label_Pago2;
    private javax.swing.JLabel Label_PrecioCP;
    private javax.swing.JLabel Label_TelefonoCliente;
    private javax.swing.JLabel Label_TelefonoCliente1;
    private javax.swing.JLabel Label_TelefonoCliente2;
    private javax.swing.JLabel Label_TelefonoCliente3;
    private javax.swing.JLabel Label_UnidadPDT;
    private javax.swing.JPanel PanelBanner;
    private javax.swing.JRadioButton RadioButton_Cat;
    private javax.swing.JRadioButton RadioButton_Dpt;
    private javax.swing.JRadioButton RadioButton_Mayoreo;
    private javax.swing.JRadioButton RadioButton_Unidad;
    private javax.swing.JTable Table_BodegaPDT;
    private javax.swing.JTable Table_Cat;
    private javax.swing.JTable Table_Clientes;
    private javax.swing.JTable Table_Clientes1;
    private javax.swing.JTable Table_Compras;
    private javax.swing.JTable Table_ComprasPDT;
    private javax.swing.JTable Table_Dpt;
    private javax.swing.JTable Table_ReportesCLT;
    private javax.swing.JTable Table_ReportesCLT1;
    private javax.swing.JTextField TextField_ApellidioCliente;
    private javax.swing.JTextField TextField_ApellidioCliente1;
    private javax.swing.JTextField TextField_BuscarCliente1;
    private javax.swing.JTextField TextField_BuscarCliente2;
    private javax.swing.JTextField TextField_BuscarCliente3;
    private javax.swing.JTextField TextField_BuscarCompras;
    private javax.swing.JTextField TextField_BuscarDpt;
    private javax.swing.JTextField TextField_BuscarPDT;
    private javax.swing.JTextField TextField_CantidadCP;
    private javax.swing.JTextField TextField_Categoria;
    private javax.swing.JTextField TextField_CodigoPDT;
    private javax.swing.JTextField TextField_Departamento;
    private javax.swing.JTextField TextField_DescripcionCP;
    private javax.swing.JTextField TextField_DescripcionPDT;
    private javax.swing.JTextField TextField_DireccioCliente;
    private javax.swing.JTextField TextField_DireccioCliente1;
    private javax.swing.JTextField TextField_ImporteCP;
    private javax.swing.JTextField TextField_NombreCliente;
    private javax.swing.JTextField TextField_NombreCliente1;
    private javax.swing.JTextField TextField_NombreCliente2;
    private javax.swing.JTextField TextField_PrecioCP;
    private javax.swing.JTextField TextField_PrecioMayoreoPDT;
    private javax.swing.JTextField TextField_PrecioUnidadPDT;
    private javax.swing.JTextField TextField_TelefonoCliente;
    private javax.swing.JTextField TextField_TelefonoCliente1;
    private javax.swing.JButton btnFacturaCliente;
    private javax.swing.JButton btnFacturaCliente1;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnGuardarCliente1;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton jrbIngresarCliente;
    private javax.swing.JRadioButton jrbIngresarCliente1;
    private javax.swing.JRadioButton jrbPagosCliente;
    private javax.swing.JRadioButton jrbPagosCliente1;
    private javax.swing.JLabel lblApellidoCLT;
    private javax.swing.JLabel lblApellidoCLT1;
    private javax.swing.JLabel lblDeudaActualCLT;
    private javax.swing.JLabel lblDeudaActualCLT1;
    private javax.swing.JLabel lblFechaPagoCLT;
    private javax.swing.JLabel lblFechaPagoCLT1;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblNombreCLT;
    private javax.swing.JLabel lblNombreCLT1;
    private javax.swing.JLabel lblPagoCliente;
    private javax.swing.JLabel lblPagoCliente1;
    private javax.swing.JLabel lblUltimoPagoCLT;
    private javax.swing.JLabel lblUltimoPagoCLT1;
    private javax.swing.JPanel panReciboCliente;
    private javax.swing.JPanel panReciboCliente1;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTable tblReportesPV;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdCliente1;
    private javax.swing.JTextField txtPagosCliente;
    private javax.swing.JTextField txtPagosCliente1;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
