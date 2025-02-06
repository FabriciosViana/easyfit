import entity.Usuario;
import crud.*;

public class App {
    public static void main(String[] args) {
        // Criar usuário
        CreateUsuario create = new CreateUsuario();
        int novoId = create.criar(new Usuario(
                0, // ID será gerado automaticamente
                "Ana Clara",
                62.5,
                1.70,
                28.0,
                'F',
                "ana@email.com"
        ));
        System.out.println("Novo ID: " + novoId);

        // Buscar usuário
        ReadUsuario read = new ReadUsuario();
        Usuario usuario = read.buscarPorId(novoId);
        System.out.println("Usuário encontrado: " + usuario);

        // Atualizar usuário
        usuario.setPeso(63.0);
        UpdateUsuario update = new UpdateUsuario();
        if (update.atualizar(usuario)) {
            System.out.println("Usuário atualizado!");
        }

        // Deletar usuário
        DeleteUsuario delete = new DeleteUsuario();
        if (delete.deletar(novoId)) {
            System.out.println("Usuário excluído!");
        }
    }
}