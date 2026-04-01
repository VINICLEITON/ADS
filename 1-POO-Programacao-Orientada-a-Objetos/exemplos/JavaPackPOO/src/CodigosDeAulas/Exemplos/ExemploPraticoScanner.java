package CodigosDeAulas.Exemplos;
import java.util.Scanner;

/**
 *
 * @author VINICIUS.BORGES
 */
public class ExemploPraticoScanner {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = leitor.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = leitor.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = leitor.nextDouble();

        System.out.print("Você é estudante? (true/false): ");
        boolean estudante = leitor.nextBoolean();

        System.out.println("\n--- Dados informados ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Estudante: " + estudante);

        leitor.close();
    }
}
