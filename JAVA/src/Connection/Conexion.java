package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    private String db = "system_ventas";
    private String user = "root";
    private String password = "mySql";
    private String urlMysql = "jdbc:mysql://localhost:3306/" + db;
    private String urlSqlServer = "jdbc:sqlserver://localhost:1433;databaseName=" + db + ";integratedSecurity=true;";
    private Connection conn = null;

    public Conexion() {
        
        try {
            //Conexion a MySQL
            //Obtenemos el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Obtenemos la conexion
            conn = DriverManager.getConnection(urlMysql, user, password);
            
//            //Conexion a SQL Server
//            //Obtenemos el driver
//            //En la configuracion de SQLServer se debe habilitar el protocolo TCP/IP
//            //En propiedades habilitar IP1 - configurar puerto TCP en IPAII a 1433
//            //Reiniciar servicio SQLServer
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            conn = DriverManager.getConnection(urlSqlServer);
            
            if (conn != null) {
                System.out.println("Conectado a: " + db);
            }
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Connection getConn() {
        return conn;
    } 
}
