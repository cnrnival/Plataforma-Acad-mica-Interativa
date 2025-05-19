import java.util.Random;

/**
 * Classe que implementa AtividadeAcademica para simular um trabalho.
 * Gera uma nota aleatória para avaliação.
 */
public class Trabalho implements AtividadeAcademica {
    private double nota;

    // Construtor padrão
    public Trabalho() {
        nota = 0.0;
    }

    @Override
    public void realizarAtividade() {
        System.out.println("Realizando trabalho...");
        System.out.println("Trabalho entregue com sucesso!");
    }

    @Override
    public void avaliarAtividade() {
        System.out.println("Avaliando trabalho...");
        Random rand = new Random();
        nota = Math.round(rand.nextDouble() * 10 * 10) / 10.0;
        System.out.println("Nota atribuída: " + nota);
    }
}
