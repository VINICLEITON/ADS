package CodigosDeAulas.RepeticaoEx;

import java.util.Scanner;

/**
 *
 * @author VINICIUS.BORGES
 */
public class ExemploFlag {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int contador = 0, idade = 0, soma = 0;
        double media = 0.0;

        System.out.println("Informe a Idade (para ENCERRAR, digite -1):");

        while (idade != -1) {
            idade = leitor.nextInt();

            if (idade == -1) {
                break;
            }

            soma += idade;
            contador++;
        }

        if (contador > 0) {
            media = (double) soma / contador;
            System.out.println("O total de idades digitadas foi: " + contador);
            System.out.println("A média das idades é: " + media);
        } else {
            System.out.println("Nenhuma idade válida foi informada.");
        }

        leitor.close();
    }
}
