/**
 * Classe abstrata que representa uma pessoa.
 * Contém atributos comuns como nome, data de nascimento e e-mail.
 */
public abstract class Pessoa {
    protected String nome;
    protected String dataNascimento;
    protected String email;

    // Construtor sem parâmetros
    public Pessoa() {}

    /**
     * Construtor que inicializa os atributos da pessoa.
     */
    public Pessoa(String nome, String dataNascimento, String email) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    /**
     * Método abstrato para exibir as informações da pessoa.
     */
    public abstract void mostrarInformacoes();
}
