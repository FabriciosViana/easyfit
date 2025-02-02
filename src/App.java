import util.DatabaseConnection;

import java.sql.Connection;

public class App {
    public static void main(String[] args) {
        //Check connection with database
        DatabaseConnection.testConnection();
        System.out.println("Executando consulta no banco...");


    }
}
