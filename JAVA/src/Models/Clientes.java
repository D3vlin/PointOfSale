package Models;

public class Clientes {
    
    private int id_cliente;
    private String  id;
    private String  nombre;
    private String  apellido;
    private String  direccion;
    private String  telefono;

    public Clientes() {
    }

//    public Clientes(int id_cliente, String id, String nombre, String apellido, String direccion, String telefono) {
//        this.id_cliente = id_cliente;
//        this.id = id;
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.direccion = direccion;
//        this.telefono = telefono;
//    }

    public int getId_Cliente() {
        return id_cliente;
    }

    public void setId_Cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
