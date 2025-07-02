import java.sql.*;

public class TestDB {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        System.out.println("Driver Loaded.");

        Connection conn = DriverManager.
                getConnection("jdbc:h2:file:/Users/administrator/Desktop/h2", "sa", "");
        System.out.println("Established Connection.");

//        TODO: Insert a new book
//        Statement statement = conn.createStatement();
//        String sql = "insert into books(name, price) values('OCPJP by Kathy', 4200)";
//        int res = statement.executeUpdate(sql);
//        System.out.println(res + " rows inserted.");

//        TODO: Update a book
//        Statement statement = conn.createStatement();
//        String sql = "update books set  name = 'OCPJP by Kathy Sierra', price = 4800";
//        int res = statement.executeUpdate(sql);
//        System.out.println(res + " rows updated.");

//        TODO: Delete a book
//        Statement statement = conn.createStatement();
//        String sql = "delete from books where id = 1";
//        int res = statement.executeUpdate(sql);
//        System.out.println(res + " rows deleted.");

//        TODO: View all books
//        Statement statement = conn.createStatement();
//        String sql = "select * from books";
//        ResultSet resultSet = statement.executeQuery(sql);
//
//        while (resultSet.next()) {
//            System.out.println("=====Printing Book Row=====");
//            System.out.println("Id=" + resultSet.getInt(1));
//            System.out.println("Name=" + resultSet.getString(2));
//            System.out.println("Price=" + resultSet.getFloat(3));
//        }
        conn.close();
    }
}
