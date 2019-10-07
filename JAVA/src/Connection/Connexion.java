package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Connexion {
    
    private String db = "system_ventas";
    private String user = "root";
    private String password = "MySQL";
    private String urlMysql = "jdbc:mysql://localhost:3306/" + db;
    private String urlSqlServer = "jdbc:sqlserver://localhost:1433;databaseName=" + db + ";integratedSecurity=true;";
    private Connection conn = null;
    
    String[] servers = {"MySQL", "SQLServer"};
    String response;
    
    public Connexion() {
        
        try {
            response = (String) JOptionPane.showInputDialog(null, "Seleccione un servidor", "Servidores", JOptionPane.DEFAULT_OPTION, null, servers, servers[0]);
            
            switch (response){
                case "MySQL":
                    //Obtenemos el driver
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    //Obtenemos la conexion
                    conn = DriverManager.getConnection(urlMysql, user, password);
                    break;
                    
                case "SQLServer":
                    //En la configuracion de SQLServer se debe habilitar el protocolo TCP/IP
                    //En propiedades habilitar IP1 - configurar puerto TCP en IPAII a 1433
                    //Reiniciar servicio SQLServer
                    //Obtenemos el driver
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    //Obtenemos la conexion
                    conn = DriverManager.getConnection(urlSqlServer);
                    break;
            }     
            
            if (conn != null) {
                System.out.println("Conectado a: " + response + " = " + db);
            }
        } catch (Exception ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Connection getConn() {
        return conn;
    } 
}
