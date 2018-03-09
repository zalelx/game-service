package my.buffalocow.listener;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.sql.DataSource;
import java.sql.*;

@WebListener
public class DatabaseConnectionListener implements ServletContextListener {
    private Connection connection;

    public void contextInitialized(ServletContextEvent sce) {
//            Class.forName("org.sqlite.JDBC");

        Connection conn = null;
        try {
            Context initCtx = new InitialContext();
            Context envCtx = (Context) initCtx.lookup("java:comp/env");
            DataSource ds = (DataSource) envCtx.lookup("jdbc/sqlite");
            conn = ds.getConnection();
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS 'users' " +
                    "('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'name' TEXT, 'password' TEXT);");

            sce.getServletContext().setAttribute("statement", statement);

        } catch (SQLException | NamingException e) {
            e.printStackTrace();
        }
    }

    public void contextDestroyed(ServletContextEvent sce) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
