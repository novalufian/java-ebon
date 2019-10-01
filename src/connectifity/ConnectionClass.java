package connectifity;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {

    public Connection connection;

    public Connection getConnection(){

        String uname = "root";
        String pass = "";
        String host = "localhost/coba";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://"+ host ,uname, pass);
        }catch (Exception e){
            e.printStackTrace();
        }

        return connection;
    }
}
