import entity.Usuario;
import model.AtualizaUsuario;
import model.CadastroUsuario;
import model.DeletaUsuario;

public class App {
    public static void main(String[] args) {
        //Check connection with database
//        DatabaseConnection.getConnection();
//        DatabaseConnection.testConnection();
        Usuario usuario = new Usuario();
        usuario.setEmail("daniel@gmail.com");
        usuario.setNome("Daniel");
        //Deleting user
        DeletaUsuario deletaUsuario = new DeletaUsuario();
        deletaUsuario.deleteUser(usuario);
//        usuario.setNome("Guilherme");
//        usuario.setPeso(85.0);
//        usuario.setAltura(1.75);
//        usuario.setIdade(16.0);
//        usuario.setEmail("guilherme@gmail.com");
//        usuario.setSexo('M');

        System.out.println("Executando consulta no banco...");
//        CadastroUsuario cadastroUsuario = new CadastroUsuario();
//        cadastroUsuario.insertUser(usuario);
//        AtualizaUsuario atualizaUsuario = new AtualizaUsuario();
//        atualizaUsuario.updateUser(usuario);

//        DatabaseConnection.executeQuery();
//        DatabaseConnection.closeConnection();

    }
}
