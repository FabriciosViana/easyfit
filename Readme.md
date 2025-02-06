# CRUD Java com MySQL

Aplicação Java para operações CRUD (Create, Read, Update, Delete) em banco de dados MySQL, focada no gerenciamento de usuários com atributos detalhados.

---

## **Estrutura do Projeto**

- **`entity/Usuario`**: Modelo de entidade com `id`, `nome`, `peso`, `altura`, `idade`, `sexo` e `email`.
- **`crud/`**: Classes separadas para cada operação:
  - `CreateUsuario`: Inserção de novos usuários.
  - `ReadUsuario`: Consulta por ID ou listagem completa.
  - `UpdateUsuario`: Atualização de dados existentes.
  - `DeleteUsuario`: Exclusão de registros.
- **`util/DatabaseConnection`**: Configuração centralizada da conexão com o banco.

---

## **Pré-requisitos**

- Java JDK 8 ou superior.
- MySQL Server instalado e configurado.
- Driver JDBC do MySQL (`mysql-connector-java`).
- IDE de sua preferência (Eclipse, IntelliJ, VSCode, etc.).

---

## **Configuração**

1. **Banco de Dados**  
   Crie o banco `easy_fit` e a tabela `usuarios` no MySQL.  
   Certifique-se de que a tabela inclui as colunas: `id`, `nome`, `peso`, `altura`, `idade`, `sexo` e `email`.

2. **Conexão com o MySQL**  
   Atualize as credenciais no arquivo `DatabaseConnection.java`:
   - URL do banco (`jdbc:mysql://localhost:3306/easy_fit`).
   - Usuário e senha do MySQL.

3. **Driver JDBC**  
   Adicione o arquivo do driver JDBC ao classpath do projeto em sua IDE.

---

## **Funcionalidades**

- **Criação de Usuários**:  
  Insere novos registros com validação de tipos de dados.

- **Consulta Flexível**:  
  Busca por ID único ou listagem completa de usuários.

- **Atualizações Seguras**:  
  Modificação de dados existentes usando `PreparedStatement` para evitar SQL injection.

- **Exclusão por ID**:  
  Remove usuários de forma precisa sem afetar outros registros.

---

## **Como Executar**

1. **Clone o Repositório**:  
   ```bash
   git clone git@github.com:FabriciosViana/easyfit.git
Importe o Projeto:
Abra a pasta na sua IDE e configure o classpath com o driver JDBC.

Execute a Classe Main:
Teste as operações CRUD diretamente no método main ou crie uma interface personalizada.

Licença
Distribuído sob a licença MIT. Consulte LICENSE para mais detalhes.
