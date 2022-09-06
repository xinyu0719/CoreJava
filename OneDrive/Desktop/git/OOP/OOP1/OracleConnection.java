package OOP1;

import java.sql.Connection;

public class OracleConnection implements DatabaseConnection{
    Connection connection;
    public OracleConnection(Connection connection){
        this.connection = connection;
    }
    @Override
    public Connection getConnection(){
        return connection;
    }
}
