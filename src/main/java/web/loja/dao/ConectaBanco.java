package web.loja.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectaBanco {

    private static String driverJDBC = "org.postgresql.Driver";
    private static String url = "jdbc:postgresql://localhost:5432/postgres";
    private static String user = "postgres";
    private static String senha = "root";
    private static Connection conexao;
    
    public void carregaDriver() {
        try {
            System.out.println("Carregando o driver JDBC...");
            Class.forName(driverJDBC);
            System.out.println("Driver carregado com sucesso!");
        } catch (Exception e) {
            System.out.println("Falha no carregamento");
        }
    }

    public Connection connection() {
        carregaDriver();
        try {
            System.out.println("Conectando ao banco...");
            conexao = DriverManager.getConnection(url, user, senha);
            
        } catch (Exception e) {
            System.out.println("Erro de conexão!");
        }

        return conexao;
    }
}
