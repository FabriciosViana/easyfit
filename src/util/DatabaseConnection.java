package util;

import java.sql.*;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/easy_fit"; //altere para o seu banco
    private static final String USER = "root";
    private static final String PASSWORD = "159753";// Coloque a senha do seu banco

    private static Connection conn;
    /* Resumindo o código o getConnection vai fazer a conexão, o metodo testConnection
     vai usar o getConnection para testar se a conexão está ativa,
     e o closeConnection vai fechar a conexão */

    public static Connection getConnection(){
        //Establishing the connection with the database
        try{
            if(conn == null || conn.isClosed()){
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
            }
            return conn;
        } catch (SQLException e) {
           throw new RuntimeException("Erro ao conectar com o banco de dados", e);
        }
    }

    //Method that check if the connection is actived
    public static boolean testConnection(){
        try(Connection conn = getConnection()){
            Statement stmt = conn.createStatement();
            stmt.executeQuery("SELECT 1");
            System.out.println("Conexão com o banco de dados está funcionando corretamente.");
            return true;

        } catch (SQLException e) {
            System.err.println("Falha ao testar a conexão com o banco de dados: " + e.getMessage());
            return false;
        }
    }

    //Method for close the connection with database
    public static void closeConnection(){
        if (conn != null){
            try {
                conn.close();
                System.out.println("Conexão com o banco de dados fechada com sucesso.");

            } catch (SQLException e) {
                System.err.println("Erro ao fechar a conexão " + e.getMessage());
            }
        }

        }
        public static void executeQuery() {
            String sql = "SELECT * FROM usuario";  // Altere "sua_tabela" para o nome correto

            try (Connection conn = getConnection();
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {

                while (rs.next()) {
                    // Suponha que a tabela tenha colunas id e nome
                    int id = rs.getInt("id");
                    String nome = rs.getString("nome");
                    String email = rs.getString("email");
                    System.out.println("ID: " + id + ", Nome: " + nome + " Email: " + email);
                }

            } catch (SQLException e) {
                System.out.println("Erro ao executar consulta: " + e.getMessage());
            }
    }
}
