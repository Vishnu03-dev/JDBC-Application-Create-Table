import java.sql.*;

public class CreateTableMain {

    // JDBC driver name and database URL
    public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost/emp";
    // Database credentials
    static final String USER = "root";
    static final String PASS = "root";
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Statement stmt = null;
        Class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        System.out.println("Deleting database...");
        stmt = conn.createStatement();

        conn = DriverManager.getConnection(DB_URL, USER, PASS);

        stmt = conn.createStatement();

        String sql = "CREATE TABLE Person2"
                + "(id INTEGER not NULL, "
                + " firstName VARCHAR(50), "
                + " lastName VARCHAR(50), "
                + " age INTEGER, "
                + " PRIMARY KEY ( id ))";

        stmt.executeUpdate(sql);
        System.out.println("Created table in given database...");
        stmt.close();
        conn.close();
    }
}