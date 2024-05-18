import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static String host = "localhost";
    private static String port = "5432";
    private static String db = "20241_fatec_ipi_poo_pessoas";
    private static String user = "postgres";
    private static String password = "123456";

    public static Connection getConnection() throws Exception{
        var s = String.format(
            "jdbc:postgresql://%s:%s/%s", host, port, db
        );

        Connection conexao = DriverManager.getConnection(s, user, password);
        return conexao;
    }
}