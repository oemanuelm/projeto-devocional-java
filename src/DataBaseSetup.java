import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class DataBaseSetup {

    public static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS devocionais (\n"
                + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + " conteudo TEXT NOT NULL\n"
                + ");";

        try (Connection conn = DataBaseConection.getConnection();
                Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela 'devocionais' criada ou já existe.");
        } catch (SQLException e) {
            System.out.println("Erro ao criar a tabela: " + e.getMessage());
        }
    }
}
// criamos a classe onde criamos a tabela no banco de dados, caso ela não exista

