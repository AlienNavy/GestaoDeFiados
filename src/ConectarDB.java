import java.sql.Connection;
import java.sql.DriverManager;

public class ConectarDB {

    private static final String USUARIO = "root";
    private static final String SENHA = "root";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/MySQL?useSSL=false";
    private static final String DRIVER = "com.mysql.jdbc.Driver";

    // Conectar ao banco
    public static Connection abrir() throws Exception {
        // Registrar o driver
        Class.forName(DRIVER);
        // Capturar a conex�o
        Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
        System.out.println("Database conectada.");
        // Retorna a conexao aberta
        return conn;


    }

}