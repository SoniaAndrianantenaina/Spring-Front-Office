package springapp.dba;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBAConnection {

    public static Connection connect() throws Exception {
        Class.forName("org.postgresql.Driver");
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://mahmud.db.elephantsql.com/auuqrlnq", "auuqrlnq","MWszlqgM69PJvMPH_3WeQUqb9yH_3kWj");
                    // System.out.println("connecte");
        } catch (Exception e) {
            throw e;
        }
        return connection;
    }
}
