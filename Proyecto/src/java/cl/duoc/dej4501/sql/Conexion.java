package cl.duoc.dej4501.sql;
import java.sql.Connection;
import java.sql.DriverManager;
public class Conexion {   
        public static Connection getConexion() {

        Connection connection = null;
        try {
           String driverClassName = "com.mysql.jdbc.Driver";
           String driverUrl="jdbc:mysql://localhost/proyecto";
           Class.forName(driverClassName);
           connection = DriverManager.getConnection(driverUrl, "root","");
        }catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    
}
