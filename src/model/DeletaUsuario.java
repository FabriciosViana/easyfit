package model;

import controller.DatabaseConnection;
import entity.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletaUsuario {
    private final String DELETE_SQL = "DELETE FROM usuarios WHERE LOWER(nome) =? AND LOWER(email)=?";
    public void deleteUser (Usuario usuario){
        try(Connection conn = DatabaseConnection.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(DELETE_SQL);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Não foi possível deletar o usuário " + e.getMessage());;
        }
    }
}
