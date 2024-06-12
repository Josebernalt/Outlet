package config;
/*@author Jose Eliud Bernal*/
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexión {
    Connection con;
    
    public Conexión (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/outlet", "root", "1120386491");
        } catch (Exception e) {
            System.err.println("No fue posible conectar a la base de datos. Error: "+e);
        }
    }
    public Connection getConnection(){
        return con;
    }
}
