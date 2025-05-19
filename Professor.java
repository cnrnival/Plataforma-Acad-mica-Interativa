/**
 * Classe que representa um professor.
 * Herda de Pessoa e adiciona especialidade e departamento.
 */
public class Professor extends Pessoa {
    private String especialidade;
    private String departamento;

    // Construtor sem parâmetros
    public Professor() {
        super();
    }

    /**
     * Construtor que inicializa os atributos do professor.
     */
    public Professor(String nome, String dataNascimento, String email, String especialidade, String departamento) {
        super(nome, dataNascimento, email);
        this.especialidade = especialidade;
        this.departamento = departamento;
    }

    /**
     * Exibe as informações do professor.
     */
    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Departamento: " + departamento);
        System.out.println("Especialidade: " + especialidade);
    }
}
