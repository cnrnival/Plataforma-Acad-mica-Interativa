import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe principal que executa a plataforma educacional interativa.
 * Permite cadastrar estudantes e professores, e simular atividades (prova ou trabalho)
 * via entrada de dados com Scanner.
 */
public class PlataformaEducacional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Cadastro de usuários
        ArrayList<Pessoa> usuarios = new ArrayList<>();
        System.out.print("Quantos usuários deseja cadastrar? ");
        int numUsuarios = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        
        for (int i = 0; i < numUsuarios; i++) {
            System.out.println("\nCadastro do usuário " + (i + 1) + ":");
            System.out.print("Digite 1 para Estudante ou 2 para Professor: ");
            int tipo = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha
            
            if (tipo == 1) {
                // Cadastro do Estudante
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Data de Nascimento (dd/mm/aaaa): ");
                String dataNascimento = scanner.nextLine();
                System.out.print("E-mail: ");
                String email = scanner.nextLine();
                System.out.print("Curso: ");
                String curso = scanner.nextLine();
                System.out.print("Matrícula: ");
                String matricula = scanner.nextLine();
                usuarios.add(new Estudante(nome, dataNascimento, email, curso, matricula));
            } else if (tipo == 2) {
                // Cadastro do Professor
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Data de Nascimento (dd/mm/aaaa): ");
                String dataNascimento = scanner.nextLine();
                System.out.print("E-mail: ");
                String email = scanner.nextLine();
                System.out.print("Especialidade: ");
                String especialidade = scanner.nextLine();
                System.out.print("Departamento: ");
                String departamento = scanner.nextLine();
                usuarios.add(new Professor(nome, dataNascimento, email, especialidade, departamento));
            } else {
                System.out.println("Opção inválida. Usuário não cadastrado.");
            }
        }
        
        // Exibe as informações dos usuários cadastrados
        System.out.println("\n--- Informações dos Usuários ---");
        for (Pessoa p : usuarios) {
            p.mostrarInformacoes();
            System.out.println();
        }
        
        // Cadastro de atividades acadêmicas
        ArrayList<AtividadeAcademica> atividades = new ArrayList<>();
        System.out.print("Quantas atividades acadêmicas deseja simular? ");
        int numAtividades = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha
        
        for (int i = 0; i < numAtividades; i++) {
            System.out.println("\nSimulação da atividade " + (i + 1) + ":");
            System.out.print("Digite 1 para Prova ou 2 para Trabalho: ");
            int opAtividade = scanner.nextInt();
            scanner.nextLine();
            if (opAtividade == 1) {
                atividades.add(new Prova());
            } else if (opAtividade == 2) {
                atividades.add(new Trabalho());
            } else {
                System.out.println("Opção inválida, atividade não cadastrada.");
            }
        }
        
        // Executa as atividades simuladas
        System.out.println("\n--- Execução das Atividades ---");
        for (AtividadeAcademica atividade : atividades) {
            atividade.realizarAtividade();
            atividade.avaliarAtividade();
            System.out.println();
        }
        
        scanner.close();
        System.out.println("Simulação finalizada!");
    }
}
