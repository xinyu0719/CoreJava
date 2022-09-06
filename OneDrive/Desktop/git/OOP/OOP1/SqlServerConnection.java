package OOP1;

import java.sql.Connection;

public class SqlServerConnection implements DatabaseConnection{
    Connection connection;
    public SqlServerConnection(Connection connection){
        this.connection = connection;
    }
    @Override
    public Connection getConnection() {
        return connection;
    }
}
