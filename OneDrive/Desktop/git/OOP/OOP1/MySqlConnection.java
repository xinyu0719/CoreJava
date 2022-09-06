package OOP1;

import java.sql.Connection;

public class MySqlConnection implements DatabaseConnection {
    Connection connection;
    public MySqlConnection(Connection connection){
        this.connection = connection;
    }
    @Override
    public Connection getConnection(){
        return connection;
    }
}
