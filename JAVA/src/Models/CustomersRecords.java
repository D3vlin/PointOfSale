package Models;

public class CustomersRecords extends Customers{
    
    private int id_Registro;
    private int idCliente;
    private String  id;
    private String  saldo_actual;
    private String  fecha_actual;
    private String  ultimo_pago;
    private String  fecha_pago;

    public int getId_Registro() {
        return id_Registro;
    }

    public void setId_Registro(int idRegistro) {
        this.id_Registro = idRegistro;
    }

    @Override
    public int getId_Cliente() {
        return idCliente;
    }

    @Override
    public void setId_Cliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String get_Id() {
        return id;
    }

    public void set_Id(String id) {
        this.id = id;
    }

    public String getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(String saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    public String getFecha_actual() {
        return fecha_actual;
    }

    public void setFecha_actual(String fecha_actual) {
        this.fecha_actual = fecha_actual;
    }

    public String getUltimo_pago() {
        return ultimo_pago;
    }

    public void setUltimo_pago(String ultimo_pago) {
        this.ultimo_pago = ultimo_pago;
    }

    public String getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }
    
    
}
