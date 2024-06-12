
import java.sql.*;
import javax.swing.JOptionPane;


/* @author Jose Eliud Bernal*/
public class Cone {

    private Connection con;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            setCon(DriverManager.getConnection("jdbc:mysql://localhost:3306/outlet", "root", "1120386491"));
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No fue posible conectar a la base de datos. Error: "+e, "Conexión", JOptionPane.ERROR_MESSAGE);
        }
        return getCon();
    }
    public Connection getConnection(){
        return getCon();
    }

    /**
     * @return the con
     */
    public Connection getCon() {
        return con;
    }

    /**
     * @param con the con to set
     */
    public void setCon(Connection con) {
        this.con = con;
    }

    
}
