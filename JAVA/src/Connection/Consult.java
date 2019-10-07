package Connection;

import Models.Clientes;
import Models.RegistrosClientes;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

public class Consult extends Conexion {
    
    private QueryRunner QR = new QueryRunner();
    private List<Clientes> cliente;
    private List<RegistrosClientes> registrosClientes;
    
    public List<Clientes> clientes(){
        try {
            cliente = (List<Clientes>) QR.query(getConn(), "SELECT * FROM clientes", new BeanListHandler(Clientes.class));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        return cliente;
    }
    
    public void insert(String query, Object[] data){
        final QueryRunner qr = new QueryRunner(true);
        try {
            qr.insert(getConn(), query, new ColumnListHandler(), data);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }
    
    public void update(String query, Object[] data){
        final QueryRunner qr = new QueryRunner(true);
        try {
            qr.update(getConn(), query, data);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }
    
    public void delete(String query, int id){
        final QueryRunner qr = new QueryRunner(true);
        try {
            qr.update(getConn(), query, "%"+ id + "%");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }
    
    public List<RegistrosClientes> registrosClientes(int idCliente){
        String condicion = " c.id_cliente = rc.id_cliente ";
        String campos = " c.id_cliente, c.id, c.nombre, c.apellido,"
                + " rc.id_registro, rc.saldo_actual, rc.fecha_actual, rc.ultimo_pago, rc.fecha_pago ";
        
        try {
            registrosClientes = (List<RegistrosClientes>) QR.query(getConn(), "SELECT " + campos + " FROM reportes_clientes rc INNER JOIN clientes c ON " + condicion + " WHERE rc.id_cliente = " + idCliente, new BeanListHandler(RegistrosClientes.class));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        return registrosClientes;
    }
}
