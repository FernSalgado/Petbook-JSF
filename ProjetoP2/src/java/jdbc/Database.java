package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.hsqldb.jdbc.JDBCPool;

public class Database {
    
    private DataSource dataSource;
    Database(){
        JDBCPool pool = new JDBCPool();
        pool.setURL("jdbc:hsqldb:hsql://localhost/petbook");
        pool.setUser("SA");
        pool.setPassword("");
        this.dataSource = pool;
    }
    Connection getConnection() throws SQLException{
        //Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/petbook", "SA","");
        Connection connection = dataSource.getConnection();
        return connection;
    }
}
