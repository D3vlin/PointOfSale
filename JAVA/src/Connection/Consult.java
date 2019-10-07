package Connection;

import Models.Customers;
import Models.CustomersRecords;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

public class Consult extends Connexion {
    
    private QueryRunner QR = new QueryRunner();
    private List<Customers> customer;
    private List<CustomersRecords> customersRecords;
    
    public List<Customers> customers(){
        try {
            customer = (List<Customers>) QR.query(getConn(), "SELECT * FROM clientes", new BeanListHandler(Customers.class));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        return customer;
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
    
    public List<CustomersRecords> customersRecords(int idCliente){
        String condition = " c.id_cliente = rc.id_cliente ";
        String fields = " c.id_cliente, c.id, c.nombre, c.apellido,"
                + " rc.id_registro, rc.saldo_actual, rc.fecha_actual, rc.ultimo_pago, rc.fecha_pago ";
        
        try {
            customersRecords = (List<CustomersRecords>) QR.query(getConn(), "SELECT " + fields + " FROM reportes_clientes rc INNER JOIN clientes c ON " + condition + " WHERE rc.id_cliente = " + idCliente, new BeanListHandler(CustomersRecords.class));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        return customersRecords;
    }
}
