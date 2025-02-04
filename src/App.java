import entity.Usuario;
import model.UsuarioDAO;

public class App {
    public static void main(String[] args) {
        //Check connection with database
//        DatabaseConnection.getConnection();
//        DatabaseConnection.testConnection();
        Usuario usuario = new Usuario();
        usuario.setNome("Fabricio");
        usuario.setPeso(89.0);
        usuario.setAltura(1.70);
        usuario.setIdade(26.0);
        usuario.setSexo('H');
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.insertUser(usuario);


        System.out.println("Executando consulta no banco...");
//        DatabaseConnection.executeQuery();
//        DatabaseConnection.closeConnection();

    }
}
