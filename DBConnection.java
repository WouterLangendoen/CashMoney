import java.sql.*;

public class DBConnection {
    static final String DB_URL = "jdbc:mysql://145.24.222.63:3306/CashMoney";
    static final String USER = "sarah";
    static final String PASS = "0000";
    private String query;

    public DBConnection(String _query){
        query = _query;
    }

    public DBConnection(){
        query = "SELECT ClientID FROM Client";
        connect();
    }

    public void connect() {
        Connection conn = null;
        Statement stmt = null;
        try {
            //STEP 2: Register JDBC driver
        Class.forName("com.mysql.jdbc.Driver").newInstance();

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT ClientID FROM Client";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("ClientID");

                //Display values
                System.out.print("ID: " + id);
            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
            System.out.println("Connection failed");
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }

}
