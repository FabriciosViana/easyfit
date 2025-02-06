package entity;

public class Usuario {
    private int id;
    private String nome;
    private double peso;   // Em kg
    private double altura; // Em metros
    private double idade;  // Em anos (pode ser decimal para precisão)
    private char sexo;     // 'M' para masculino, 'F' para feminino, 'O' para outros
    private String email;

    // Construtor completo
    public Usuario(int id, String nome, double peso, double altura, double idade, char sexo, String email) {
        this.id = id;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
    }

    // Getters
    public int getId() { return id; }
    public String getNome() { return nome; }
    public double getPeso() { return peso; }
    public double getAltura() { return altura; }
    public double getIdade() { return idade; }
    public char getSexo() { return sexo; }
    public String getEmail() { return email; }

    // Setters (opcionais)
    public void setId(int id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setPeso(double peso) { this.peso = peso; }
    public void setAltura(double altura) { this.altura = altura; }
    public void setIdade(double idade) { this.idade = idade; }
    public void setSexo(char sexo) { this.sexo = sexo; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return String.format(
                "Usuario [ID: %d | Nome: %s | Peso: %.2f kg | Altura: %.2f m | Idade: %.1f anos | Sexo: %c | Email: %s]",
                id, nome, peso, altura, idade, sexo, email
        );
    }
}