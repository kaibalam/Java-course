import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaCrearConexionJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_curso";
        String username = "root";
        String password = "sasa";

        try {
            Connection conn = DriverManager.getConnection(url,username,password);
            if (!conn.isClosed()){
                System.out.println("Se ha conectado a la base de datos!");
            } else {
                System.out.println("No se ha podido hacer la conexión!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }
}
