import java.util.Random;

/**
 * Classe que implementa AtividadeAcademica para simular uma prova.
 * Gera uma nota aleatória para avaliação.
 */
public class Prova implements AtividadeAcademica {
    private double nota;

    // Construtor padrão
    public Prova() {
        nota = 0.0;
    }

    @Override
    public void realizarAtividade() {
        System.out.println("Realizando prova...");
        System.out.println("Prova realizada com sucesso!");
    }

    @Override
    public void avaliarAtividade() {
        System.out.println("Avaliando prova...");
        Random rand = new Random();
        nota = Math.round(rand.nextDouble() * 10 * 10) / 10.0;
        System.out.println("Nota atribuída: " + nota);
    }
}
