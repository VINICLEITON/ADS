package CodigosDeAulas.EntradaEx;
import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = leitor.nextLine();

        System.out.print("Peso: ");
        int peso = leitor.nextInt();

        System.out.print("Altura: ");
        double altura = leitor.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("IMC de " + nome + ": " + imc);
    }
}
