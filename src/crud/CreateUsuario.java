package crud;

import entity.Usuario;
import util.DatabaseConnection;
import java.sql.*;

public class CreateUsuario {
    public int criar(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nome, peso, altura, idade, sexo, email) VALUES (?, ?, ?, ?, ?, ?)";

        try (
                Connection connection = DatabaseConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ) {
            statement.setString(1, usuario.getNome());
            statement.setDouble(2, usuario.getPeso());
            statement.setDouble(3, usuario.getAltura());
            statement.setDouble(4, usuario.getIdade());
            statement.setString(5, String.valueOf(usuario.getSexo()));
            statement.setString(6, usuario.getEmail());

            int affectedRows = statement.executeUpdate();

            if (affectedRows > 0) {
                try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        return generatedKeys.getInt(1); // Retorna o ID gerado
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao criar usuário: " + e.getMessage());
        }
        return -1; // Indica falha
    }
}