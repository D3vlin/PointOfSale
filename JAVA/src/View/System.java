package View;

//<editor-fold defaultstate="collapsed" desc="IMPORT">
import ModelClass.Customer;
import ModelClass.FormatDecimal;
import ModelClass.BannerImage;
import ModelClass.TextFieldEvent;
import Models.Customers;
import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
//</editor-fold>

public class System extends javax.swing.JFrame {
    //<editor-fold defaultstate="collapsed" desc="VARIABLES">
    private String action = "insert", date, day, month, year, payment, currentDebt;
    private int pageSize = 6, maxReg, pageCount;
    private int numRecord = 0, numPage = 0, idCustomer, idRecord;
    private JPanel sales, customers, suppliers, products, catDpt, shopping;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="ARRAYS">
    private JButton navigateButtons[];
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="OBJECTS">
    BannerImage banner = new BannerImage();
    TextFieldEvent event = new TextFieldEvent();
    Customer customer = new Customer();
    FormatDecimal format = new FormatDecimal();
    Color fieldEmpty = new Color(102, 102, 102);
    Color fieldOk = new Color(0, 153, 51);
    Color fieldWrong = Color.RED;
    DefaultTableModel customersModelTable, customerReportsModelTable;
    Pattern pattern;
    Matcher matcher;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="LIST">
    List<Customers> numCustomer;
    //</editor-fold>


    public System() {
        initComponents();
        
        //Assign image to jPanel
        panBanner.add(banner);  
        
        //Prepare navigation menu
        navigateButtons = new JButton[] {this.btnSales, this.btnCustomers, this.btnSuppliers, this.btnProducts, this.btnCatDpt, this.btnShopping};
        saveTabs();
        removeTabs();  
        
        //Take current date
        Calendar c = new GregorianCalendar();
        day = Integer.toString(c.get(Calendar.DAY_OF_MONTH));
        month = Integer.toString(c.get(Calendar.MONTH));
        year = Integer.toString(c.get(Calendar.YEAR));
        date = day + "/" + month + "/" + year;
        
        setJTextFieldChanged(txtIdCustomer);
        setJTextFieldChanged(txtCustomerName);
        setJTextFieldChanged(txtCustomerSurname);
        setJTextFieldChanged(txtCustomerDirection);
        setJTextFieldChanged(txtCustomerTelephone);
        setJTextFieldChanged(txtCustomerPayment);
    }
    
    //<editor-fold defaultstate="collapsed" desc="PROCEDURES">
    private void selectNavigateButton(JButton button){           
        for (JButton btn : navigateButtons){
            if (button == btn){
                btn.setEnabled(false);
            }else{
                btn.setEnabled(true);
            }            
        }        
    }
    
    private void saveTabs(){
        sales = (JPanel) tpnMenu.getComponentAt(0);
        customers = (JPanel) tpnMenu.getComponentAt(1);
        suppliers = (JPanel) tpnMenu.getComponentAt(2);
        products = (JPanel) tpnMenu.getComponentAt(3);
        catDpt = (JPanel) tpnMenu.getComponentAt(4);
        shopping = (JPanel) tpnMenu.getComponentAt(5);
    }
    
    private void removeTabs(){
        while (tpnMenu.getComponentCount() != 0) {
            tpnMenu.removeTabAt(0);             
        }  
    }
    
    private void changeCustomerControlsState(boolean state){
        txtIdCustomer.setEnabled(state);
        txtCustomerName.setEnabled(state);
        txtCustomerSurname.setEnabled(state);
        txtCustomerDirection.setEnabled(state);
        txtCustomerTelephone.setEnabled(state);
        txtCustomerPayment.setEnabled(!state);
    }
    //</editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panBanner = new javax.swing.JPanel();
        btnSales = new javax.swing.JButton();
        btnCustomers = new javax.swing.JButton();
        btnSuppliers = new javax.swing.JButton();
        btnProducts = new javax.swing.JButton();
        btnCatDpt = new javax.swing.JButton();
        btnShopping = new javax.swing.JButton();
        btnSettings = new javax.swing.JButton();
        tpnMenu = new javax.swing.JTabbedPane();
        panSales = new javax.swing.JPanel();
        panSaleSearch = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSearchProduct = new javax.swing.JTextField();
        btnProductSearch = new javax.swing.JButton();
        panTransaction = new javax.swing.JPanel();
        scpTransaction = new javax.swing.JScrollPane();
        tblTransaction =   tblCustomers2 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        lblPages1 = new javax.swing.JLabel();
        btnPageFirst1 = new javax.swing.JButton();
        btnPageBefore1 = new javax.swing.JButton();
        btnPageAfter1 = new javax.swing.JButton();
        btnPageLast1 = new javax.swing.JButton();
        btnPrintBill1 = new javax.swing.JButton();
        panSaleInfo = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        cbxCredit = new javax.swing.JCheckBox();
        lblCash = new javax.swing.JLabel();
        txtCash = new javax.swing.JTextField();
        lblBill = new javax.swing.JLabel();
        lblBillAmount = new javax.swing.JLabel();
        lblMoneyBack = new javax.swing.JLabel();
        lblMoneyBackAmount = new javax.swing.JLabel();
        lblDebt1 = new javax.swing.JLabel();
        lblDebtTotal = new javax.swing.JLabel();
        btnCharge = new javax.swing.JButton();
        btnCancel1 = new javax.swing.JButton();
        panCustomerSearch1 = new javax.swing.JPanel();
        scpCustomers1 = new javax.swing.JScrollPane();
        tblCustomers1 = tblReports = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        jLabel25 = new javax.swing.JLabel();
        txtSearchCustomer1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        panBill1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblCustomer = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblDebt2 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lblPreviousDebt = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lblCurrentDebt1 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lblLastPayment1 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblDate1 = new javax.swing.JLabel();
        panCustomers = new javax.swing.JPanel();
        panCustomerSearch2 = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSearchCustomer2 = new javax.swing.JTextField();
        panCustomerInformation = new javax.swing.JPanel();
        jLabel222 = new javax.swing.JLabel();
        jrbEnterCustomer = new javax.swing.JRadioButton();
        jrbCustomerPayments = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        lblIdCustomer = new javax.swing.JLabel();
        txtIdCustomer = new javax.swing.JTextField();
        lblCustomerName1 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        lblCustomerSurname1 = new javax.swing.JLabel();
        txtCustomerSurname = new javax.swing.JTextField();
        lblCustomerDirection = new javax.swing.JLabel();
        txtCustomerDirection = new javax.swing.JTextField();
        lblCustomerTelephone = new javax.swing.JLabel();
        txtCustomerTelephone = new javax.swing.JTextField();
        lblCustomerPayment = new javax.swing.JLabel();
        txtCustomerPayment = new javax.swing.JTextField();
        btnInsertCustomer = new javax.swing.JButton();
        btnDeleteCustomer = new javax.swing.JButton();
        btnCancel2 = new javax.swing.JButton();
        panTableCustomers = new javax.swing.JPanel();
        scpCustomers2 = new javax.swing.JScrollPane();
        tblCustomers2 =   tblCustomers2 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        lblPages2 = new javax.swing.JLabel();
        btnPageFirst2 = new javax.swing.JButton();
        btnPageBefore2 = new javax.swing.JButton();
        btnPageAfter2 = new javax.swing.JButton();
        btnPageLast2 = new javax.swing.JButton();
        btnPrintBill2 = new javax.swing.JButton();
        panTableReports = new javax.swing.JPanel();
        scpReports = new javax.swing.JScrollPane();
        tblReports = tblReports = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panBill2 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        lblCustomerName2 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        lblCustomerSurname2 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        lblCurrentDebt2 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        lblLastPayment2 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        lblDate2 = new javax.swing.JLabel();
        panSuppliers = new javax.swing.JPanel();
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
        panProducts = new javax.swing.JPanel();
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
        panCatDpt = new javax.swing.JPanel();
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
        panShopping = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema punto de ventas");

        panBanner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panBanner.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout panBannerLayout = new javax.swing.GroupLayout(panBanner);
        panBanner.setLayout(panBannerLayout);
        panBannerLayout.setHorizontalGroup(
            panBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panBannerLayout.setVerticalGroup(
            panBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        btnSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sales.png"))); // NOI18N
        btnSales.setText("Ventas");
        btnSales.setToolTipText("");
        btnSales.setBorder(null);
        btnSales.setBorderPainted(false);
        btnSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesActionPerformed(evt);
            }
        });

        btnCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/customers.png"))); // NOI18N
        btnCustomers.setText("Clientes");
        btnCustomers.setToolTipText("");
        btnCustomers.setBorder(null);
        btnCustomers.setBorderPainted(false);
        btnCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomersActionPerformed(evt);
            }
        });

        btnSuppliers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconDiagram.png"))); // NOI18N
        btnSuppliers.setText("Proveedores");
        btnSuppliers.setToolTipText("");
        btnSuppliers.setBorder(null);
        btnSuppliers.setBorderPainted(false);
        btnSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuppliersActionPerformed(evt);
            }
        });

        btnProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ordering.png"))); // NOI18N
        btnProducts.setText("Productos");
        btnProducts.setToolTipText("");
        btnProducts.setBorder(null);
        btnProducts.setBorderPainted(false);
        btnProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductsActionPerformed(evt);
            }
        });

        btnCatDpt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/label.png"))); // NOI18N
        btnCatDpt.setText("Cat Dpt.");
        btnCatDpt.setToolTipText("");
        btnCatDpt.setBorder(null);
        btnCatDpt.setBorderPainted(false);
        btnCatDpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatDptActionPerformed(evt);
            }
        });

        btnShopping.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shoppingCar.png"))); // NOI18N
        btnShopping.setText(" Compras");
        btnShopping.setToolTipText("");
        btnShopping.setBorder(null);
        btnShopping.setBorderPainted(false);
        btnShopping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShoppingActionPerformed(evt);
            }
        });

        btnSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gear.png"))); // NOI18N
        btnSettings.setText(" Config");
        btnSettings.setToolTipText("");
        btnSettings.setBorder(null);
        btnSettings.setBorderPainted(false);

        tpnMenu.setBackground(new java.awt.Color(255, 255, 255));
        tpnMenu.setName(""); // NOI18N

        panSales.setBackground(new java.awt.Color(255, 255, 255));
        panSales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panSaleSearch.setBackground(new java.awt.Color(255, 255, 255));
        panSaleSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("Ventas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Buscar");

        btnProductSearch.setText("Buscar");

        javax.swing.GroupLayout panSaleSearchLayout = new javax.swing.GroupLayout(panSaleSearch);
        panSaleSearch.setLayout(panSaleSearchLayout);
        panSaleSearchLayout.setHorizontalGroup(
            panSaleSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSaleSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(205, 205, 205)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProductSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panSaleSearchLayout.setVerticalGroup(
            panSaleSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSaleSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panSaleSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductSearch))
                .addContainerGap())
        );

        panTransaction.setBackground(new java.awt.Color(255, 255, 255));
        panTransaction.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblTransaction.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblTransaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblTransaction.setRowHeight(20);
        tblTransaction.setSelectionBackground(new java.awt.Color(102, 204, 255));
        scpTransaction.setViewportView(tblTransaction);

        lblPages1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPages1.setForeground(new java.awt.Color(0, 153, 204));
        lblPages1.setText("Page");

        btnPageFirst1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrowFirst.png"))); // NOI18N
        btnPageFirst1.setText("Primero");

        btnPageBefore1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrowBefore.png"))); // NOI18N
        btnPageBefore1.setText("Anterior ");

        btnPageAfter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrowAfter.png"))); // NOI18N
        btnPageAfter1.setText("Siguiente");

        btnPageLast1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrowLast.png"))); // NOI18N
        btnPageLast1.setText("Ultimo");

        btnPrintBill1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/print.png"))); // NOI18N
        btnPrintBill1.setText("Factura");

        javax.swing.GroupLayout panTransactionLayout = new javax.swing.GroupLayout(panTransaction);
        panTransaction.setLayout(panTransactionLayout);
        panTransactionLayout.setHorizontalGroup(
            panTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTransactionLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(scpTransaction)
                .addGap(10, 10, 10))
            .addGroup(panTransactionLayout.createSequentialGroup()
                .addGroup(panTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panTransactionLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnPageFirst1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPageBefore1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPageAfter1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPageLast1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrintBill1))
                    .addGroup(panTransactionLayout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(lblPages1)))
                .addGap(28, 28, 28))
        );
        panTransactionLayout.setVerticalGroup(
            panTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTransactionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scpTransaction, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPages1)
                .addGap(4, 4, 4)
                .addGroup(panTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPageLast1)
                        .addComponent(btnPrintBill1))
                    .addComponent(btnPageAfter1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPageBefore1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPageFirst1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        panSaleInfo.setBackground(new java.awt.Color(255, 255, 255));
        panSaleInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 204));
        jLabel16.setText("Configuración de venta");
        jLabel16.setToolTipText("");

        cbxCredit.setText("Credito");

        lblCash.setForeground(new java.awt.Color(0, 153, 153));
        lblCash.setText("Efectivo");
        lblCash.setToolTipText("");

        lblBill.setForeground(new java.awt.Color(0, 153, 153));
        lblBill.setText("Monto a pagar");

        lblBillAmount.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblBillAmount.setForeground(new java.awt.Color(0, 102, 153));
        lblBillAmount.setText("$0.00");
        lblBillAmount.setToolTipText("");

        lblMoneyBack.setForeground(new java.awt.Color(0, 153, 153));
        lblMoneyBack.setText("Su cambio");

        lblMoneyBackAmount.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblMoneyBackAmount.setForeground(new java.awt.Color(0, 102, 153));
        lblMoneyBackAmount.setText("$0.00");

        lblDebt1.setForeground(new java.awt.Color(0, 153, 153));
        lblDebt1.setText("Deudada total");

        lblDebtTotal.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblDebtTotal.setForeground(new java.awt.Color(0, 102, 153));
        lblDebtTotal.setText("$0.00");

        btnCharge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        btnCharge.setText("Cobrar");
        btnCharge.setBorder(null);

        btnCancel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        btnCancel1.setText("Cancelar");
        btnCancel1.setBorder(null);

        javax.swing.GroupLayout panSaleInfoLayout = new javax.swing.GroupLayout(panSaleInfo);
        panSaleInfo.setLayout(panSaleInfoLayout);
        panSaleInfoLayout.setHorizontalGroup(
            panSaleInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSaleInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panSaleInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panSaleInfoLayout.createSequentialGroup()
                        .addGroup(panSaleInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panSaleInfoLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbxCredit)
                            .addComponent(lblMoneyBack, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panSaleInfoLayout.createSequentialGroup()
                        .addGroup(panSaleInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBillAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panSaleInfoLayout.createSequentialGroup()
                                .addGroup(panSaleInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCash, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCash, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBill, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 82, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(panSaleInfoLayout.createSequentialGroup()
                .addGroup(panSaleInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMoneyBackAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDebtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDebt1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panSaleInfoLayout.setVerticalGroup(
            panSaleInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSaleInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxCredit)
                .addGap(18, 18, 18)
                .addComponent(lblCash)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBillAmount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMoneyBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMoneyBackAmount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDebt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDebtTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panSaleInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panCustomerSearch1.setBackground(new java.awt.Color(255, 255, 255));
        panCustomerSearch1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblCustomers1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblCustomers1.setRowHeight(20);
        tblCustomers1.setSelectionBackground(new java.awt.Color(102, 204, 255));
        scpCustomers1.setViewportView(tblCustomers1);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 153, 204));
        jLabel25.setText("Buscar");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 204));
        jLabel20.setText("Cliente");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/customers.png"))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("©D3vlin");

        javax.swing.GroupLayout panCustomerSearch1Layout = new javax.swing.GroupLayout(panCustomerSearch1);
        panCustomerSearch1.setLayout(panCustomerSearch1Layout);
        panCustomerSearch1Layout.setHorizontalGroup(
            panCustomerSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCustomerSearch1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCustomerSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scpCustomers1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panCustomerSearch1Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearchCustomer1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panCustomerSearch1Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panCustomerSearch1Layout.setVerticalGroup(
            panCustomerSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCustomerSearch1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCustomerSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panCustomerSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(txtSearchCustomer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scpCustomers1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addGap(5, 5, 5))
        );

        panBill1.setBackground(new java.awt.Color(255, 255, 255));
        panBill1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel17.setText("Abarrotes punto de venta");

        jLabel26.setText("Nombre:");

        lblCustomer.setText("Nombre");

        jLabel27.setText("Deuda:");

        lblDebt2.setText("$0.00");

        jLabel28.setText("Deuda anterior:");

        lblPreviousDebt.setText("$0.00");

        jLabel29.setText("Deuda actual:");

        lblCurrentDebt1.setText("$0.00");

        jLabel30.setText("Ultimo pago:");

        lblLastPayment1.setText("$0.00");

        jLabel31.setText("Fecha:");

        lblDate1.setText("Fecha");

        javax.swing.GroupLayout panBill1Layout = new javax.swing.GroupLayout(panBill1);
        panBill1.setLayout(panBill1Layout);
        panBill1Layout.setHorizontalGroup(
            panBill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBill1Layout.createSequentialGroup()
                .addGroup(panBill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBill1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel17))
                    .addGroup(panBill1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panBill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panBill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDate1)
                            .addComponent(lblLastPayment1)
                            .addComponent(lblCurrentDebt1)
                            .addComponent(lblDebt2)
                            .addComponent(lblCustomer)
                            .addComponent(lblPreviousDebt))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panBill1Layout.setVerticalGroup(
            panBill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBill1Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panBill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(lblCustomer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panBill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(lblDebt2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panBill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(lblPreviousDebt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panBill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(lblCurrentDebt1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panBill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(lblLastPayment1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(panBill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(lblDate1)))
        );

        javax.swing.GroupLayout panSalesLayout = new javax.swing.GroupLayout(panSales);
        panSales.setLayout(panSalesLayout);
        panSalesLayout.setHorizontalGroup(
            panSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panSaleSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panSalesLayout.createSequentialGroup()
                        .addComponent(panSaleInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panTransaction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panSalesLayout.createSequentialGroup()
                                .addComponent(panCustomerSearch1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panBill1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panSalesLayout.setVerticalGroup(
            panSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panSaleSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panSalesLayout.createSequentialGroup()
                        .addComponent(panTransaction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panBill1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panCustomerSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, Short.MAX_VALUE)))
                    .addComponent(panSaleInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tpnMenu.addTab("Ventas", panSales);

        panCustomers.setBackground(new java.awt.Color(255, 255, 255));
        panCustomers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panCustomerSearch2.setBackground(new java.awt.Color(255, 255, 255));
        panCustomerSearch2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel111.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(0, 153, 153));
        jLabel111.setText("Clientes");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Buscar");

        txtSearchCustomer2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchCustomer2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panCustomerSearch2Layout = new javax.swing.GroupLayout(panCustomerSearch2);
        panCustomerSearch2.setLayout(panCustomerSearch2Layout);
        panCustomerSearch2Layout.setHorizontalGroup(
            panCustomerSearch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCustomerSearch2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel111)
                .addGap(204, 204, 204)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtSearchCustomer2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panCustomerSearch2Layout.setVerticalGroup(
            panCustomerSearch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCustomerSearch2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panCustomerSearch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111)
                    .addComponent(jLabel5)
                    .addComponent(txtSearchCustomer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panCustomerInformation.setBackground(new java.awt.Color(255, 255, 255));
        panCustomerInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));

        jLabel222.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel222.setForeground(new java.awt.Color(0, 153, 153));
        jLabel222.setText("Configuració del cliente");
        jLabel222.setToolTipText("");

        jrbEnterCustomer.setForeground(new java.awt.Color(0, 153, 51));
        jrbEnterCustomer.setText("Ingresar cliente");
        jrbEnterCustomer.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jrbEnterCustomerStateChanged(evt);
            }
        });

        jrbCustomerPayments.setText("Pagos de cliente");
        jrbCustomerPayments.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jrbCustomerPaymentsStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Llene la infomacón del nuevo cliente");
        jLabel3.setToolTipText("");

        lblIdCustomer.setForeground(new java.awt.Color(102, 102, 102));
        lblIdCustomer.setText("ID");
        lblIdCustomer.setToolTipText("");

        txtIdCustomer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdCustomerKeyTyped(evt);
            }
        });

        lblCustomerName1.setForeground(new java.awt.Color(102, 102, 102));
        lblCustomerName1.setText("Nombre completo");
        lblCustomerName1.setToolTipText("");

        txtCustomerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCustomerNameKeyTyped(evt);
            }
        });

        lblCustomerSurname1.setForeground(new java.awt.Color(102, 102, 102));
        lblCustomerSurname1.setText("Apellido");

        txtCustomerSurname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCustomerSurnameKeyTyped(evt);
            }
        });

        lblCustomerDirection.setForeground(new java.awt.Color(102, 102, 102));
        lblCustomerDirection.setText("Dirección");
        lblCustomerDirection.setToolTipText("");

        lblCustomerTelephone.setForeground(new java.awt.Color(102, 102, 102));
        lblCustomerTelephone.setText("Telefono");

        txtCustomerTelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCustomerTelephoneKeyTyped(evt);
            }
        });

        lblCustomerPayment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCustomerPayment.setForeground(new java.awt.Color(102, 102, 102));
        lblCustomerPayment.setText("Pagos de deudas");

        txtCustomerPayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCustomerPaymentKeyTyped(evt);
            }
        });

        btnInsertCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        btnInsertCustomer.setText("Guardar");
        btnInsertCustomer.setBorder(null);
        btnInsertCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertCustomerActionPerformed(evt);
            }
        });

        btnDeleteCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        btnDeleteCustomer.setText("Eliminar");
        btnDeleteCustomer.setBorder(null);
        btnDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustomerActionPerformed(evt);
            }
        });

        btnCancel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        btnCancel2.setText("Cancelar");
        btnCancel2.setBorder(null);
        btnCancel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panCustomerInformationLayout = new javax.swing.GroupLayout(panCustomerInformation);
        panCustomerInformation.setLayout(panCustomerInformationLayout);
        panCustomerInformationLayout.setHorizontalGroup(
            panCustomerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCustomerInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCustomerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCustomerInformationLayout.createSequentialGroup()
                        .addGroup(panCustomerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panCustomerInformationLayout.createSequentialGroup()
                                .addComponent(jrbEnterCustomer)
                                .addGap(18, 18, 18)
                                .addComponent(jrbCustomerPayments))
                            .addComponent(jLabel222)
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panCustomerInformationLayout.createSequentialGroup()
                        .addGroup(panCustomerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panCustomerInformationLayout.createSequentialGroup()
                                .addComponent(btnInsertCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeleteCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCustomerName1)
                            .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCustomerSurname1)
                            .addComponent(txtCustomerSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCustomerDirection)
                            .addComponent(txtCustomerDirection, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCustomerTelephone)
                            .addComponent(txtCustomerTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCustomerPayment)
                            .addComponent(txtCustomerPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdCustomer)
                            .addComponent(txtIdCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panCustomerInformationLayout.setVerticalGroup(
            panCustomerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCustomerInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel222)
                .addGap(18, 18, 18)
                .addGroup(panCustomerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbEnterCustomer)
                    .addComponent(jrbCustomerPayments))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(lblIdCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCustomerName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCustomerSurname1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCustomerSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lblCustomerDirection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCustomerDirection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCustomerTelephone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCustomerTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCustomerPayment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCustomerPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panCustomerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        panTableCustomers.setBackground(new java.awt.Color(255, 255, 255));
        panTableCustomers.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblCustomers2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblCustomers2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblCustomers2.setRowHeight(20);
        tblCustomers2.setSelectionBackground(new java.awt.Color(102, 204, 255));
        tblCustomers2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomers2MouseClicked(evt);
            }
        });
        tblCustomers2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblCustomers2KeyReleased(evt);
            }
        });
        scpCustomers2.setViewportView(tblCustomers2);

        lblPages2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPages2.setForeground(new java.awt.Color(0, 153, 153));
        lblPages2.setText("Page");

        btnPageFirst2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrowFirst.png"))); // NOI18N
        btnPageFirst2.setText("Primero");
        btnPageFirst2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPageFirst2ActionPerformed(evt);
            }
        });

        btnPageBefore2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrowBefore.png"))); // NOI18N
        btnPageBefore2.setText("Anterior ");
        btnPageBefore2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPageBefore2ActionPerformed(evt);
            }
        });

        btnPageAfter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrowAfter.png"))); // NOI18N
        btnPageAfter2.setText("Siguiente");
        btnPageAfter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPageAfter2ActionPerformed(evt);
            }
        });

        btnPageLast2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrowLast.png"))); // NOI18N
        btnPageLast2.setText("Ultimo");
        btnPageLast2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPageLast2ActionPerformed(evt);
            }
        });

        btnPrintBill2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/print.png"))); // NOI18N
        btnPrintBill2.setText("Factura");
        btnPrintBill2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintBill2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panTableCustomersLayout = new javax.swing.GroupLayout(panTableCustomers);
        panTableCustomers.setLayout(panTableCustomersLayout);
        panTableCustomersLayout.setHorizontalGroup(
            panTableCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTableCustomersLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(scpCustomers2)
                .addGap(10, 10, 10))
            .addGroup(panTableCustomersLayout.createSequentialGroup()
                .addGroup(panTableCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panTableCustomersLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnPageFirst2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPageBefore2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPageAfter2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPageLast2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrintBill2))
                    .addGroup(panTableCustomersLayout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(lblPages2)))
                .addGap(28, 28, 28))
        );
        panTableCustomersLayout.setVerticalGroup(
            panTableCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTableCustomersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scpCustomers2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPages2)
                .addGap(4, 4, 4)
                .addGroup(panTableCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTableCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPageLast2)
                        .addComponent(btnPrintBill2))
                    .addComponent(btnPageAfter2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPageBefore2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPageFirst2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        panTableReports.setBackground(new java.awt.Color(255, 255, 255));
        panTableReports.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblReports.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblReports.setRowHeight(20);
        tblReports.setSelectionBackground(new java.awt.Color(102, 204, 255));
        scpReports.setViewportView(tblReports);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Reportes");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/customers.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("©D3vlin");

        javax.swing.GroupLayout panTableReportsLayout = new javax.swing.GroupLayout(panTableReports);
        panTableReports.setLayout(panTableReportsLayout);
        panTableReportsLayout.setHorizontalGroup(
            panTableReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTableReportsLayout.createSequentialGroup()
                .addGroup(panTableReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panTableReportsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scpReports))
                    .addGroup(panTableReportsLayout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panTableReportsLayout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panTableReportsLayout.setVerticalGroup(
            panTableReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTableReportsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTableReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scpReports, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(5, 5, 5))
        );

        panBill2.setBackground(new java.awt.Color(255, 255, 255));
        panBill2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel77.setText("Recibo");

        jLabel78.setText("Nombre:");

        lblCustomerName2.setText("Nombre");

        jLabel79.setText("Apellido:");

        lblCustomerSurname2.setText("Apellido");

        jLabel80.setText("Deuda actual:");

        lblCurrentDebt2.setText("$0.00");

        jLabel81.setText("Ultimo pago:");

        lblLastPayment2.setText("$0.00");

        jLabel83.setText("Fecha:");

        lblDate2.setText("Fecha");

        javax.swing.GroupLayout panBill2Layout = new javax.swing.GroupLayout(panBill2);
        panBill2.setLayout(panBill2Layout);
        panBill2Layout.setHorizontalGroup(
            panBill2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBill2Layout.createSequentialGroup()
                .addGroup(panBill2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBill2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panBill2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel78)
                            .addComponent(jLabel79)
                            .addComponent(jLabel80)
                            .addComponent(jLabel81)
                            .addComponent(jLabel83))
                        .addGap(16, 16, 16)
                        .addGroup(panBill2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCustomerName2)
                            .addComponent(lblCurrentDebt2)
                            .addGroup(panBill2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblLastPayment2)
                                .addComponent(lblDate2))
                            .addComponent(lblCustomerSurname2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panBill2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel77)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panBill2Layout.setVerticalGroup(
            panBill2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBill2Layout.createSequentialGroup()
                .addComponent(jLabel77)
                .addGap(18, 18, 18)
                .addGroup(panBill2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(lblCustomerName2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panBill2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(lblCustomerSurname2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(panBill2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(lblCurrentDebt2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panBill2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(lblLastPayment2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panBill2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(lblDate2)))
        );

        javax.swing.GroupLayout panCustomersLayout = new javax.swing.GroupLayout(panCustomers);
        panCustomers.setLayout(panCustomersLayout);
        panCustomersLayout.setHorizontalGroup(
            panCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCustomersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panCustomerInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panCustomerSearch2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panTableCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panCustomersLayout.createSequentialGroup()
                        .addComponent(panTableReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panBill2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panCustomersLayout.setVerticalGroup(
            panCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCustomersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panCustomerInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panCustomersLayout.createSequentialGroup()
                        .addComponent(panCustomerSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panTableCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panBill2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panTableReports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        tpnMenu.addTab("Clientes", panCustomers);

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

        btnGuardarCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        btnGuardarCliente1.setText("Guardar");
        btnGuardarCliente1.setBorder(null);

        Button_EliminarCLT3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        Button_EliminarCLT3.setText("Eliminar");
        Button_EliminarCLT3.setBorder(null);

        Button_CancelarCLT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
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

        Button_AnteriorCLT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrowBefore.png"))); // NOI18N
        Button_AnteriorCLT2.setText("Anterior ");

        Button_SiguienteCLT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrowAfter.png"))); // NOI18N
        Button_SiguienteCLT2.setText("Siguiente");

        Button_PrimeroCLT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrowFirst.png"))); // NOI18N
        Button_PrimeroCLT2.setText("Primero");

        Button_UltimoCLT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrowLast.png"))); // NOI18N
        Button_UltimoCLT2.setText("Ultimo");

        Label_PaginasClientes1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_PaginasClientes1.setForeground(new java.awt.Color(0, 153, 153));
        Label_PaginasClientes1.setText("Page");

        btnFacturaCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/print.png"))); // NOI18N
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

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/customers.png"))); // NOI18N

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

        javax.swing.GroupLayout panSuppliersLayout = new javax.swing.GroupLayout(panSuppliers);
        panSuppliers.setLayout(panSuppliersLayout);
        panSuppliersLayout.setHorizontalGroup(
            panSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSuppliersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panSuppliersLayout.createSequentialGroup()
                        .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panReciboCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panSuppliersLayout.setVerticalGroup(
            panSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSuppliersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panSuppliersLayout.createSequentialGroup()
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panReciboCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tpnMenu.addTab("Proveedores", panSuppliers);

        panProducts.setBackground(new java.awt.Color(255, 255, 255));
        panProducts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        Button_GuardarPDT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        Button_GuardarPDT.setText("Guardar");
        Button_GuardarPDT.setBorder(null);

        Button_EliminarCLT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        Button_EliminarCLT1.setText("Eliminar");
        Button_EliminarCLT1.setBorder(null);

        Button_CancelarPDT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
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
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
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

        Button_PrimeroPDT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrowFirst.png"))); // NOI18N
        Button_PrimeroPDT.setText("Primero");

        Button_AnteriorPDT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrowBefore.png"))); // NOI18N
        Button_AnteriorPDT.setText("Anterior ");

        Button_SiguientePDT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrowAfter.png"))); // NOI18N
        Button_SiguientePDT.setText("Siguiente");

        Button_UltimoPDT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrowLast.png"))); // NOI18N
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
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField_BuscarPDT, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Label)
                        .addGap(0, 375, Short.MAX_VALUE)))
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

        javax.swing.GroupLayout panProductsLayout = new javax.swing.GroupLayout(panProducts);
        panProducts.setLayout(panProductsLayout);
        panProductsLayout.setHorizontalGroup(
            panProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panProductsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panProductsLayout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panProductsLayout.setVerticalGroup(
            panProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panProductsLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panProductsLayout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE))
                .addContainerGap())
        );

        tpnMenu.addTab("Productos", panProducts);

        panCatDpt.setBackground(new java.awt.Color(255, 255, 255));
        panCatDpt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 204));
        jLabel13.setText("Configuració del cliente");
        jLabel13.setToolTipText("");

        RadioButton_Dpt.setForeground(new java.awt.Color(0, 153, 51));
        RadioButton_Dpt.setText("Dpt.");

        RadioButton_Cat.setText("Cat.");

        Button_GuardarCatDpt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        Button_GuardarCatDpt.setText("Guardar");
        Button_GuardarCatDpt.setBorder(null);

        Button_EliminarCatDpt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        Button_EliminarCatDpt.setText("Eliminar");
        Button_EliminarCatDpt.setBorder(null);

        Button_CancelarCatDpt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
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
                .addContainerGap(504, Short.MAX_VALUE))
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

        javax.swing.GroupLayout panCatDptLayout = new javax.swing.GroupLayout(panCatDpt);
        panCatDpt.setLayout(panCatDptLayout);
        panCatDptLayout.setHorizontalGroup(
            panCatDptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCatDptLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCatDptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panCatDptLayout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panCatDptLayout.setVerticalGroup(
            panCatDptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCatDptLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panCatDptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCatDptLayout.createSequentialGroup()
                        .addGroup(panCatDptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCatDptLayout.createSequentialGroup()
                        .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        tpnMenu.addTab("Categorias y Departamentos", panCatDpt);

        panShopping.setBackground(new java.awt.Color(255, 255, 255));
        panShopping.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        Button_GuardarCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        Button_GuardarCliente1.setText("Guardar");
        Button_GuardarCliente1.setBorder(null);

        Button_EliminarCLT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        Button_EliminarCLT2.setText("Eliminar");
        Button_EliminarCLT2.setBorder(null);

        Button_CancelarCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
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

        Button_AnteriorCP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrowBefore.png"))); // NOI18N
        Button_AnteriorCP.setText("Anterior ");

        Button_SiguienteCP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrowAfter.png"))); // NOI18N
        Button_SiguienteCP.setText("Siguiente");

        Button_PrimeroCP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrowFirst.png"))); // NOI18N
        Button_PrimeroCP.setText("Primero");

        Button_UltimoCP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrowLast.png"))); // NOI18N
        Button_UltimoCP.setText("Ultimo");

        Label_Paginas2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_Paginas2.setForeground(java.awt.SystemColor.activeCaption);
        Label_Paginas2.setText("Page");

        Button_Factura1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/print.png"))); // NOI18N
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
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
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

        javax.swing.GroupLayout panShoppingLayout = new javax.swing.GroupLayout(panShopping);
        panShopping.setLayout(panShoppingLayout);
        panShoppingLayout.setHorizontalGroup(
            panShoppingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panShoppingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panShoppingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panShoppingLayout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panShoppingLayout.setVerticalGroup(
            panShoppingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panShoppingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panShoppingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tpnMenu.addTab("Compras", panShopping);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCatDpt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnShopping, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tpnMenu))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShopping, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCatDpt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="PAGINATION CODE">    
        //<editor-fold defaultstate="collapsed" desc="PAGE CUSTOMERS">
    private void loadCustomersData() {
        numCustomer = customer.getCustomers();
        customer.searchCustomer(tblCustomers2, "", numRecord, pageSize);
        maxReg = numCustomer.size();
        pageCount = (maxReg / pageSize);
        //Ajuste el numero de la pagina si la ultima pagina contiene una parte de la pagina
        if ((maxReg % pageSize) > 0) {
            pageCount += 1;
        }
        lblPages2.setText("Paginas " + "1" + "/ " + String.valueOf(pageCount));
    }
        //</editor-fold>
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CODIGO CLIENTE">
    private void btnCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomersActionPerformed
        removeTabs();
        tpnMenu.addTab("Clientes", customers);
        selectNavigateButton(this.btnCustomers);
        action = "insert";
        jrbEnterCustomer.setSelected(true);        
        customer.customerRecords(tblReports, idCustomer);
        resetCustomer();
        loadCustomersData();
    }//GEN-LAST:event_btnCustomersActionPerformed

    private void txtIdCustomerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdCustomerKeyTyped
        event.numberKeyPress(evt);
    }//GEN-LAST:event_txtIdCustomerKeyTyped

    private void txtCustomerNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerNameKeyTyped
        event.textKeyPress(evt);
    }//GEN-LAST:event_txtCustomerNameKeyTyped

    private void txtCustomerSurnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerSurnameKeyTyped
        event.textKeyPress(evt);
    }//GEN-LAST:event_txtCustomerSurnameKeyTyped

    private void txtCustomerTelephoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerTelephoneKeyTyped
        event.numberKeyPress(evt);
    }//GEN-LAST:event_txtCustomerTelephoneKeyTyped

    private void txtCustomerPaymentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerPaymentKeyTyped
        event.numberDecimalKeyPress(evt, txtCustomerPayment);
    }//GEN-LAST:event_txtCustomerPaymentKeyTyped

    private void btnInsertCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertCustomerActionPerformed
        if (jrbEnterCustomer.isSelected()) {
            guardarCliente();
        }else{
            guardarReporte();
        }
    }//GEN-LAST:event_btnInsertCustomerActionPerformed

    private void btnPageFirst2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPageFirst2ActionPerformed
        numPage = 0;
        lblPages2.setText("Paginas 1/ " + String.valueOf(pageCount));
        customer.searchCustomer(tblCustomers2, "", numPage, pageSize);
    }//GEN-LAST:event_btnPageFirst2ActionPerformed

    private void btnPageBefore2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPageBefore2ActionPerformed
        if (pageCount != 1) {
            if (numPage > 0) {
                if (pageCount == numPage) {
                    numPage -= 1;
                }
                lblPages2.setText("Paginas " + String.valueOf(numPage) + "/ " + String.valueOf(pageCount));
                numPage -= 1;
                numRecord = pageSize * numPage;
                customer.searchCustomer(tblCustomers2, "", numRecord, pageSize);
            }
        }
    }//GEN-LAST:event_btnPageBefore2ActionPerformed

    private void btnPageAfter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPageAfter2ActionPerformed
        if (pageCount != 1) {
            if (numPage < pageCount) {
                if (numPage == 0) {
                    numPage += 1;
                }
                numRecord = pageSize * numPage;
                customer.searchCustomer(tblCustomers2, "", numRecord, pageSize);
                numPage += 1;
                lblPages2.setText("Paginas " + String.valueOf(numPage) + "/ " + String.valueOf(pageCount));
            }
        }
    }//GEN-LAST:event_btnPageAfter2ActionPerformed

    private void btnPageLast2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPageLast2ActionPerformed
        numPage = pageCount;
        numPage--;
        numRecord = pageSize * numPage;
        lblPages2.setText("Paginas " + String.valueOf(pageCount) + "/ " + String.valueOf(pageCount));
        customer.searchCustomer(tblCustomers2, "", numRecord, pageSize);
        numPage = pageCount;
    }//GEN-LAST:event_btnPageLast2ActionPerformed

    private void btnCancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel2ActionPerformed
        resetCustomer();
    }//GEN-LAST:event_btnCancel2ActionPerformed

    private void tblCustomers2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCustomers2KeyReleased
        if (tblCustomers2.getSelectedRows().length > 0) {
            datosCliente();
        }
    }//GEN-LAST:event_tblCustomers2KeyReleased

    private void tblCustomers2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomers2MouseClicked
        if (tblCustomers2.getSelectedRows().length > 0) {
            datosCliente();
        }
    }//GEN-LAST:event_tblCustomers2MouseClicked

    private void btnDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCustomerActionPerformed
        if (idCustomer == 0) {
            JOptionPane.showMessageDialog(null, "Selecciones un cliente para eliminar");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Desea eliminar los registros", "Eliminar registros", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                customer.deleteCustomer(idCustomer, idRecord);
                resetCustomer();
            }
        }
    }//GEN-LAST:event_btnDeleteCustomerActionPerformed

    private void btnPrintBill2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintBill2ActionPerformed
        customer.receiptPrint(panBill2);
    }//GEN-LAST:event_btnPrintBill2ActionPerformed

    private void txtSearchCustomer2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchCustomer2KeyReleased
        customer.searchCustomer(tblCustomers2, txtSearchCustomer2.getText(), numPage, pageSize);
    }//GEN-LAST:event_txtSearchCustomer2KeyReleased

    private void btnSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppliersActionPerformed
        removeTabs();
        tpnMenu.addTab("Proveedores", suppliers);
        selectNavigateButton(this.btnSuppliers);
    }//GEN-LAST:event_btnSuppliersActionPerformed

    private void btnSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesActionPerformed
        removeTabs();
        tpnMenu.addTab("Ventas", sales);
        selectNavigateButton(this.btnSales);
    }//GEN-LAST:event_btnSalesActionPerformed

    private void btnProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductsActionPerformed
        removeTabs();
        tpnMenu.addTab("Productos", products);
        selectNavigateButton(this.btnProducts);
    }//GEN-LAST:event_btnProductsActionPerformed

    private void btnCatDptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatDptActionPerformed
        removeTabs();
        tpnMenu.addTab("Categorias y Departamentos", catDpt);
        selectNavigateButton(this.btnCatDpt);
    }//GEN-LAST:event_btnCatDptActionPerformed

    private void btnShoppingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShoppingActionPerformed
        removeTabs();
        tpnMenu.addTab("Compras", shopping);
        selectNavigateButton(this.btnShopping);
    }//GEN-LAST:event_btnShoppingActionPerformed
    
    private void jrbEnterCustomerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jrbEnterCustomerStateChanged
        if (jrbEnterCustomer.isSelected()) {
            jrbEnterCustomer.setForeground(fieldOk);
            jrbCustomerPayments.setSelected(false);   
            jrbCustomerPayments.setForeground(fieldEmpty);         
            changeCustomerControlsState(true);
        }
    }//GEN-LAST:event_jrbEnterCustomerStateChanged

    private void jrbCustomerPaymentsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jrbCustomerPaymentsStateChanged
        if (jrbCustomerPayments.isSelected()) {
            jrbCustomerPayments.setForeground(fieldOk);
            jrbEnterCustomer.setForeground(Color.black);
            jrbEnterCustomer.setSelected(false);        
            changeCustomerControlsState(false);            
        }
    }//GEN-LAST:event_jrbCustomerPaymentsStateChanged

    private void datosCliente() {
        action = "update";
        customersModelTable = customer.getModel();
        int filas = tblCustomers2.getSelectedRow();
        idCustomer = Integer.valueOf((String) customersModelTable.getValueAt(filas, 0));
        txtIdCustomer.setText((String) customersModelTable.getValueAt(filas, 1));
        txtCustomerName.setText((String) customersModelTable.getValueAt(filas, 2));
        txtCustomerSurname.setText((String) customersModelTable.getValueAt(filas, 3));
        txtCustomerDirection.setText((String) customersModelTable.getValueAt(filas, 4));
        txtCustomerTelephone.setText((String) customersModelTable.getValueAt(filas, 5));

        customerReportsModelTable = customer.customerRecords(tblReports, idCustomer);
        idRecord = Integer.valueOf((String) customerReportsModelTable.getValueAt(0, 0));
        lblCustomerName2.setText((String) customerReportsModelTable.getValueAt(0, 1));
        lblCustomerSurname2.setText((String) customerReportsModelTable.getValueAt(0, 2));
        lblCurrentDebt2.setText((String) customerReportsModelTable.getValueAt(0, 3));
        lblLastPayment2.setText((String) customerReportsModelTable.getValueAt(0, 5));
        lblDate2.setText((String) customerReportsModelTable.getValueAt(0, 6));
    }

    private void resetCustomer() {
        action = "insert";
        idCustomer = 0;
        idRecord = 0;
        numRecord = 0;
        numPage = 0;
                
        jrbEnterCustomer.setSelected(true);
        
        txtIdCustomer.setText("");        
        txtCustomerName.setText("");
        txtCustomerSurname.setText("");
        txtCustomerDirection.setText("");
        txtCustomerTelephone.setText("");
        txtCustomerPayment.setText("");
        
        lblCustomerName2.setText("Nombre");
        lblCustomerSurname2.setText("Apellido");
        lblCurrentDebt2.setText("$0.00");
        lblLastPayment2.setText("$0.00");
        lblDate2.setText("Fecha");        
        
        loadCustomersData();
        customer.customerRecords(tblReports, idCustomer);
    }

    private void guardarCliente() {
        if (txtIdCustomer.getText().equals("")) {
            lblIdCustomer.setText("Ingrese el ID");
            lblIdCustomer.setForeground(fieldWrong);
            txtIdCustomer.requestFocus();
        } else if (txtCustomerName.getText().equals("")) {
            lblCustomerName1.setText("Ingrese el nombre completo");
            lblCustomerName1.setForeground(fieldWrong);
            txtCustomerName.requestFocus();
        } else if (txtCustomerSurname.getText().equals("")) {
            lblCustomerSurname1.setText("Ingrese el apellido");
            lblCustomerSurname1.setForeground(fieldWrong);
            txtCustomerSurname.requestFocus();
        } else if (txtCustomerDirection.getText().equals("")) {
            lblCustomerDirection.setText("Ingrese la dirección");
            lblCustomerDirection.setForeground(fieldWrong);
            txtCustomerDirection.requestFocus();
        } else if (txtCustomerTelephone.getText().equals("")) {
            lblCustomerTelephone.setText("Ingrese el telefono");
            lblCustomerTelephone.setForeground(fieldWrong);
            txtCustomerTelephone.requestFocus();
        } else {
            String id = txtIdCustomer.getText();
            String nombre = txtCustomerName.getText();
            String apellido = txtCustomerSurname.getText();
            String direccion = txtCustomerDirection.getText();
            String telefono = txtCustomerTelephone.getText();
            switch (action) {
                case "insert":
                    customer.insertCustomer(id, nombre, apellido, direccion, telefono);
                    break;
                case "update":
                    customer.updateCustomer(id, nombre, apellido, direccion, telefono, idCustomer);
                    break;
            }
            resetCustomer();
        }
    }
    
    private void guardarReporte(){
        if (txtCustomerPayment.getText().equals("")) {
            lblCustomerPayment.setText("Pagos de deudas");
            lblCustomerPayment.setForeground(fieldWrong);
            txtCustomerPayment.requestFocus();
        }else{
            customer.updateReports(currentDebt, date, payment, idCustomer);
            resetCustomer();
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
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new System().setVisible(true);
            }
        });
    }
    
    //<editor-fold defaultstate="collapsed" desc="TEXT FIELD CHANGE">
    private void setJTextFieldChanged(JTextField txt){
        DocumentListener documentListener = new DocumentListener(){

            @Override
            public void insertUpdate(DocumentEvent documentEvent) {
                printIt(txt, documentEvent);
            }

            @Override
            public void removeUpdate(DocumentEvent documentEvent) {
                printIt(txt, documentEvent);
            }

            @Override
            public void changedUpdate(DocumentEvent documentEvent) {
                printIt(txt, documentEvent);
            }            
        };
        txt.getDocument().addDocumentListener(documentListener);
    }
        
    private void printIt(JTextField txt, DocumentEvent documentEvent) {
        DocumentEvent.EventType type = documentEvent.getType();

        if (type.equals(DocumentEvent.EventType.CHANGE))
        {
            TextFieldChanged(txt);
        }
        else if (type.equals(DocumentEvent.EventType.INSERT))
        {
            TextFieldChanged(txt);
        }
        else if (type.equals(DocumentEvent.EventType.REMOVE))
        {
            TextFieldChanged(txt);
        }
    }
    
    private void TextFieldChanged(JTextField txt){
        if (customers == (JPanel) tpnMenu.getComponentAt(0)){
            if (txt == txtIdCustomer){
                txtIdCustomerChanged();
            }
            else if (txt == txtCustomerName){
                txtCustomerNameChanged();
            }
            else if (txt == txtCustomerSurname){
                txtCustomerSurnameChanged();
            }
            else if (txt == txtCustomerDirection){
                txtCustomerDirectionChanged();
            }
            else if (txt == txtCustomerTelephone){
                txtCustomerTelephoneChanged();
            }
            else if (txt == txtCustomerPayment){
                txtCustomerPaymentChanged();
            }
        }         
    }
    
    //<editor-fold defaultstate="collapsed" desc="CUSTOMERS TAB">
    private void txtIdCustomerChanged(){
        if (txtIdCustomer.getText().equals("")) {
            lblIdCustomer.setForeground(fieldEmpty);
        } else {
            lblIdCustomer.setText("ID");
            lblIdCustomer.setForeground(fieldOk);
        }
    }
    
    private void txtCustomerNameChanged(){
        if (txtCustomerName.getText().equals("")) {
            lblCustomerName1.setForeground(fieldEmpty);
        } else {
            lblCustomerName1.setText("Nombre completo");
            lblCustomerName1.setForeground(fieldOk);
        }
    }
    
    private void txtCustomerSurnameChanged(){
        if (txtCustomerSurname.getText().equals("")) {
            lblCustomerSurname1.setForeground(fieldEmpty);
        } else {
            lblCustomerSurname1.setText("Apellido");
            lblCustomerSurname1.setForeground(fieldOk);
        }
    }
    
    private void txtCustomerDirectionChanged(){
        if (txtCustomerDirection.getText().equals("")) {
            lblCustomerDirection.setForeground(fieldEmpty);
        } else {
            lblCustomerDirection.setText("Dirección");
            lblCustomerDirection.setForeground(fieldOk);
        }
    }
    
    private void txtCustomerTelephoneChanged(){
        if (txtCustomerTelephone.getText().equals("")) {
            lblCustomerTelephone.setForeground(fieldEmpty);
        } else {
            lblCustomerTelephone.setText("Telefono");
            lblCustomerTelephone.setForeground(fieldOk);
        }
    }
    
    // TODO: Plantear bien este metodo
    private void txtCustomerPaymentChanged(){ 
        if (tblReports.getRowCount() == 0 || txtIdCustomer.getText().equals("")) {
            lblCustomerPayment.setText("Seleccione el cliente");
            lblCustomerPayment.setForeground(fieldWrong);
        } else {
            if (!txtCustomerPayment.getText().equals("")) {
                String deuda1 = (String) customerReportsModelTable.getValueAt(0, 3);
                pattern = Pattern.compile("[$]");
                matcher = pattern.matcher(deuda1);
                deuda1 = matcher.replaceAll("");
                
                double deuda2, deuda3, deudaTotal;
                deuda2 = format.rebuild(deuda1);
                deuda3 = Double.parseDouble(txtCustomerPayment.getText());
                payment = format.decimal(deuda3);
                deudaTotal = deuda2 - deuda3;
                currentDebt = format.decimal(deudaTotal);
                
                lblCustomerPayment.setText("Pagos de deudas");
                lblCustomerPayment.setForeground(fieldOk);
            }
        }
    }
    //</editor-fold>
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="CONTROLS">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_AnteriorCLT2;
    private javax.swing.JButton Button_AnteriorCP;
    private javax.swing.JButton Button_AnteriorPDT;
    private javax.swing.JButton Button_CancelarCLT2;
    private javax.swing.JButton Button_CancelarCatDpt;
    private javax.swing.JButton Button_CancelarCompras;
    private javax.swing.JButton Button_CancelarPDT;
    private javax.swing.JButton Button_EliminarCLT1;
    private javax.swing.JButton Button_EliminarCLT2;
    private javax.swing.JButton Button_EliminarCLT3;
    private javax.swing.JButton Button_EliminarCatDpt;
    private javax.swing.JButton Button_Factura1;
    private javax.swing.JButton Button_GuardarCatDpt;
    private javax.swing.JButton Button_GuardarCliente1;
    private javax.swing.JButton Button_GuardarPDT;
    private javax.swing.JButton Button_PrimeroCLT2;
    private javax.swing.JButton Button_PrimeroCP;
    private javax.swing.JButton Button_PrimeroPDT;
    private javax.swing.JButton Button_SiguienteCLT2;
    private javax.swing.JButton Button_SiguienteCP;
    private javax.swing.JButton Button_SiguientePDT;
    private javax.swing.JButton Button_UltimoCLT2;
    private javax.swing.JButton Button_UltimoCP;
    private javax.swing.JButton Button_UltimoPDT;
    private javax.swing.JComboBox ComboBox_Categoria;
    private javax.swing.JComboBox ComboBox_Departamento;
    private javax.swing.JLabel Label;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label_ApellidoCliente2;
    private javax.swing.JLabel Label_CantidadCP;
    private javax.swing.JLabel Label_Cat;
    private javax.swing.JLabel Label_CategoriaPDT;
    private javax.swing.JLabel Label_CodigoPDT;
    private javax.swing.JLabel Label_DepartamentoPDT;
    private javax.swing.JLabel Label_DescripcionCP;
    private javax.swing.JLabel Label_DescripcionPDT;
    private javax.swing.JLabel Label_DireccionCliente2;
    private javax.swing.JLabel Label_Dpt;
    private javax.swing.JLabel Label_IdCliente1;
    private javax.swing.JLabel Label_ImporteCP;
    private javax.swing.JLabel Label_MayoreoPDT;
    private javax.swing.JLabel Label_NombreCliente2;
    private javax.swing.JLabel Label_NombreCliente3;
    private javax.swing.JLabel Label_Paginas1;
    private javax.swing.JLabel Label_Paginas2;
    private javax.swing.JLabel Label_PaginasClientes1;
    private javax.swing.JLabel Label_PrecioCP;
    private javax.swing.JLabel Label_TelefonoCliente3;
    private javax.swing.JLabel Label_UnidadPDT;
    private javax.swing.JRadioButton RadioButton_Cat;
    private javax.swing.JRadioButton RadioButton_Dpt;
    private javax.swing.JRadioButton RadioButton_Mayoreo;
    private javax.swing.JRadioButton RadioButton_Unidad;
    private javax.swing.JTable Table_BodegaPDT;
    private javax.swing.JTable Table_Cat;
    private javax.swing.JTable Table_Compras;
    private javax.swing.JTable Table_ComprasPDT;
    private javax.swing.JTable Table_Dpt;
    private javax.swing.JTextField TextField_ApellidioCliente1;
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
    private javax.swing.JTextField TextField_DireccioCliente1;
    private javax.swing.JTextField TextField_ImporteCP;
    private javax.swing.JTextField TextField_NombreCliente2;
    private javax.swing.JTextField TextField_PrecioCP;
    private javax.swing.JTextField TextField_PrecioMayoreoPDT;
    private javax.swing.JTextField TextField_PrecioUnidadPDT;
    private javax.swing.JTextField TextField_TelefonoCliente1;
    private javax.swing.JButton btnCancel1;
    private javax.swing.JButton btnCancel2;
    private javax.swing.JButton btnCatDpt;
    private javax.swing.JButton btnCharge;
    private javax.swing.JButton btnCustomers;
    private javax.swing.JButton btnDeleteCustomer;
    private javax.swing.JButton btnFacturaCliente1;
    private javax.swing.JButton btnGuardarCliente1;
    private javax.swing.JButton btnInsertCustomer;
    private javax.swing.JButton btnPageAfter1;
    private javax.swing.JButton btnPageAfter2;
    private javax.swing.JButton btnPageBefore1;
    private javax.swing.JButton btnPageBefore2;
    private javax.swing.JButton btnPageFirst1;
    private javax.swing.JButton btnPageFirst2;
    private javax.swing.JButton btnPageLast1;
    private javax.swing.JButton btnPageLast2;
    private javax.swing.JButton btnPrintBill1;
    private javax.swing.JButton btnPrintBill2;
    private javax.swing.JButton btnProductSearch;
    private javax.swing.JButton btnProducts;
    private javax.swing.JButton btnSales;
    private javax.swing.JButton btnSettings;
    private javax.swing.JButton btnShopping;
    private javax.swing.JButton btnSuppliers;
    private javax.swing.JCheckBox cbxCredit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel222;
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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JRadioButton jrbCustomerPayments;
    private javax.swing.JRadioButton jrbEnterCustomer;
    private javax.swing.JRadioButton jrbIngresarCliente1;
    private javax.swing.JRadioButton jrbPagosCliente1;
    private javax.swing.JLabel lblApellidoCLT1;
    private javax.swing.JLabel lblBill;
    private javax.swing.JLabel lblBillAmount;
    private javax.swing.JLabel lblCash;
    private javax.swing.JLabel lblCurrentDebt1;
    private javax.swing.JLabel lblCurrentDebt2;
    private javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel lblCustomerDirection;
    private javax.swing.JLabel lblCustomerName1;
    private javax.swing.JLabel lblCustomerName2;
    private javax.swing.JLabel lblCustomerPayment;
    private javax.swing.JLabel lblCustomerSurname1;
    private javax.swing.JLabel lblCustomerSurname2;
    private javax.swing.JLabel lblCustomerTelephone;
    private javax.swing.JLabel lblDate1;
    private javax.swing.JLabel lblDate2;
    private javax.swing.JLabel lblDebt1;
    private javax.swing.JLabel lblDebt2;
    private javax.swing.JLabel lblDebtTotal;
    private javax.swing.JLabel lblDeudaActualCLT1;
    private javax.swing.JLabel lblFechaPagoCLT1;
    private javax.swing.JLabel lblIdCustomer;
    private javax.swing.JLabel lblLastPayment1;
    private javax.swing.JLabel lblLastPayment2;
    private javax.swing.JLabel lblMoneyBack;
    private javax.swing.JLabel lblMoneyBackAmount;
    private javax.swing.JLabel lblNombreCLT1;
    private javax.swing.JLabel lblPages1;
    private javax.swing.JLabel lblPages2;
    private javax.swing.JLabel lblPagoCliente1;
    private javax.swing.JLabel lblPreviousDebt;
    private javax.swing.JLabel lblUltimoPagoCLT1;
    private javax.swing.JPanel panBanner;
    private javax.swing.JPanel panBill1;
    private javax.swing.JPanel panBill2;
    private javax.swing.JPanel panCatDpt;
    private javax.swing.JPanel panCustomerInformation;
    private javax.swing.JPanel panCustomerSearch1;
    private javax.swing.JPanel panCustomerSearch2;
    private javax.swing.JPanel panCustomers;
    private javax.swing.JPanel panProducts;
    private javax.swing.JPanel panReciboCliente1;
    private javax.swing.JPanel panSaleInfo;
    private javax.swing.JPanel panSaleSearch;
    private javax.swing.JPanel panSales;
    private javax.swing.JPanel panShopping;
    private javax.swing.JPanel panSuppliers;
    private javax.swing.JPanel panTableCustomers;
    private javax.swing.JPanel panTableReports;
    private javax.swing.JPanel panTransaction;
    private javax.swing.JScrollPane scpCustomers1;
    private javax.swing.JScrollPane scpCustomers2;
    private javax.swing.JScrollPane scpReports;
    private javax.swing.JScrollPane scpTransaction;
    private javax.swing.JTable tblCustomers1;
    private javax.swing.JTable tblCustomers2;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTable tblReportesPV;
    private javax.swing.JTable tblReports;
    private javax.swing.JTable tblTransaction;
    private javax.swing.JTabbedPane tpnMenu;
    private javax.swing.JTextField txtCash;
    private javax.swing.JTextField txtCustomerDirection;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtCustomerPayment;
    private javax.swing.JTextField txtCustomerSurname;
    private javax.swing.JTextField txtCustomerTelephone;
    private javax.swing.JTextField txtIdCliente1;
    private javax.swing.JTextField txtIdCustomer;
    private javax.swing.JTextField txtPagosCliente1;
    private javax.swing.JTextField txtSearchCustomer1;
    private javax.swing.JTextField txtSearchCustomer2;
    private javax.swing.JTextField txtSearchProduct;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
