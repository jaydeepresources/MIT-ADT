import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDB {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        System.out.println("Driver Loaded.");

        Connection conn = DriverManager.
                getConnection("jdbc:h2:file:/Users/administrator/Desktop/h2","sa","");
        System.out.println("Established Connection.");
    }
}