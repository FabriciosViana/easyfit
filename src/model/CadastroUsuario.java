package model;

import entity.Usuario;
import controller.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastroUsuario {
    private final String INSERT_SQL = "INSERT INTO usuarios (nome, peso, altura, idade, sexo, email) VALUES (?,?,?,?,?,?)";
//    private final String SELECT_SQL = "SELECT * FROM usuario";
//    Usuario usuario = new Usuario();

    public void insertUser(Usuario usuario) {
        try(Connection conn  = DatabaseConnection.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(INSERT_SQL);
            stmt.setString(1, usuario.getNome());
            stmt.setDouble(2, usuario.getPeso());
            stmt.setDouble(3, usuario.getAltura());
            stmt.setDouble(4, usuario.getIdade());
            stmt.setString(5, String.valueOf(usuario.getSexo()));
            stmt.setString(6, usuario.getEmail());
            stmt.executeUpdate();
            System.out.println("Usuário cadastrado com sucesso !");
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar usuário " + e.getMessage());
        }
    }
}
