import entity.Usuario;
import model.AtualizaUsuario;
import model.CadastroUsuario;

public class App {
    public static void main(String[] args) {
        //Check connection with database
//        DatabaseConnection.getConnection();
//        DatabaseConnection.testConnection();
        Usuario usuario = new Usuario();
        usuario.setNome("Daniel");
        usuario.setPeso(96.0);
        usuario.setAltura(1.8);
        usuario.setIdade(26.0);
        usuario.setSexo('H');
//        CadastroUsuario cadastroUsuario = new CadastroUsuario();
//        cadastroUsuario.insertUser(usuario);
        AtualizaUsuario atualizaUsuario = new AtualizaUsuario();
        atualizaUsuario.updateUser(usuario);

        System.out.println("Executando consulta no banco...");
//        DatabaseConnection.executeQuery();
//        DatabaseConnection.closeConnection();

    }
}
