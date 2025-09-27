import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConection {
    private static final String URL = "sqlite-jdbc-3.50.3.0.jar";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            return null;

        }
    }

}
// classe para fazer a conexão com o banco de dados SQLite