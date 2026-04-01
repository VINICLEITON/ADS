package CodigosDeAulas.Exemplos;
import java.util.Scanner;


	public class ExemploPraticoScanner {
	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Digite seu nome completo: ");
	        String nome = entrada.nextLine();

	        System.out.print("Digite sua idade: ");
	        int idade = entrada.nextInt();

	        System.out.print("Digite sua altura: ");
	        double altura = entrada.nextDouble();

	        System.out.print("Você é estudante? (true/false): ");
	        boolean estudante = entrada.nextBoolean();

	        System.out.println("\n--- Dados informados ---");
	        System.out.println("Nome: " + nome);
	        System.out.println("Idade: " + idade);
	        System.out.println("Altura: " + altura);
	        System.out.println("Estudante: " + estudante);

	        entrada.close();
	    }	
}
