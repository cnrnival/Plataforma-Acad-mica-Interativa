/**
 * Classe que representa um estudante.
 * Herda de Pessoa e adiciona curso e matrícula.
 */
public class Estudante extends Pessoa {
    private String curso;
    private String matricula;

    // Construtor sem parâmetros
    public Estudante() {
        super();
    }

    /**
     * Construtor que inicializa os atributos do estudante.
     */
    public Estudante(String nome, String dataNascimento, String email, String curso, String matricula) {
        super(nome, dataNascimento, email);
        this.curso = curso;
        this.matricula = matricula;
    }

    /**
     * Exibe as informações do estudante.
     */
    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Curso: " + curso);
        System.out.println("Matrícula: " + matricula);
    }
}
