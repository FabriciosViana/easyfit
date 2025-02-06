package crud;

import util.DatabaseConnection;
import java.sql.*;

public class DeleteUsuario {
    public boolean deletar(int id) {
        String sql = "DELETE FROM usuarios WHERE id = ?";

        try (
                Connection connection = DatabaseConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setInt(1, id);
            int affectedRows = statement.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.err.println("Erro ao excluir usuário: " + e.getMessage());
            return false;
        }
    }
}