import java.sql.*;
public class sqlConnect {
    public static void connect(){
        Connection con = null;;
        //String login = System.getenv("login");
        //String passwd = System.getenv("passwd");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/BMS","root","1502");
            System.out.println("database connected");
        } catch (SQLException e) {
            System.out.println("JDBC driver not found");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
    }
}
