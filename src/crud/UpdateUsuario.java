package crud;

import entity.Usuario;
import util.DatabaseConnection;
import java.sql.*;

public class UpdateUsuario {
    public boolean atualizar(Usuario usuario) {
        String sql = "UPDATE usuarios SET nome = ?, peso = ?, altura = ?, idade = ?, sexo = ?, email = ? WHERE id = ?";

        try (
                Connection connection = DatabaseConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setString(1, usuario.getNome());
            statement.setDouble(2, usuario.getPeso());
            statement.setDouble(3, usuario.getAltura());
            statement.setDouble(4, usuario.getIdade());
            statement.setString(5, String.valueOf(usuario.getSexo()));
            statement.setString(6, usuario.getEmail());
            statement.setInt(7, usuario.getId());

            int affectedRows = statement.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar usuário: " + e.getMessage());
            return false;
        }
    }
}