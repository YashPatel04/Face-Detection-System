import java.sql.*;
public class sqlConnect {
    public static void connect(){
        Connection con = null;
        Statement st;
        int res;
        //String login = System.getenv("login");
        //String passwd = System.getenv("passwd")
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/BMS","root","1502");
            st = con.createStatement();
            res = st.executeUpdate("CREATE TABLE IF NOT EXISTS img_data (id VARCHAR(20) PRIMARY KEY,data VARCHAR(20))");
            res = st.executeUpdate("CREATE TABLE IF NOT EXISTS Human_data (id VARCHAR(20) PRIMARY KEY,name VARCHAR(20),email VARCHAR(20), phone INT, curr_location VARCHAR(20))");
            /*
                execute the given command first time you run the code 
                res = st.executeUpdate("ALTER TABLE Human_data ADD CONSTRAINT fk_id FOREIGN KEY (id) REFERENCES img_data(id)");
             */
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
