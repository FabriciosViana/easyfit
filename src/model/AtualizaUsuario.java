package model;

import entity.Usuario;
import util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AtualizaUsuario {
    int userID = 1;
    private final String UPDATE_SQL = "UPDATE usuarios SET nome = ?,peso = ?,altura = ?,idade = ? WHERE id = ?";
    public void updateUser(Usuario usuario){
        try (Connection conn = DatabaseConnection.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(UPDATE_SQL);
            stmt.setString(1, usuario.getNome());
            stmt.setDouble(2, usuario.getPeso());
            stmt.setDouble(3, usuario.getAltura());
            stmt.setDouble(4, usuario.getIdade());
            stmt.setInt(5,userID);
            stmt.executeUpdate();


        } catch (SQLException e) {
            System.err.println("Não foi possível atualizar o usuário  "+e.getMessage());
        }
    }
}
