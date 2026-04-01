package CodigosDeAulas.RepeticaoEx;

import java.util.Scanner;

/**
 *
 * @author VINICIUS.BORGES
 */
public class Ex1_for {

    public static void main(String args[]) {
        float soma, numero, media;
        int contador;
        Scanner leitor = new Scanner(System.in);
        soma = 0;

        for (contador = 1; contador <= 8; contador++) {
            numero = leitor.nextFloat();
            soma += numero;
        }

        media = soma / contador;

        System.out.println("Média =" + media);
    }
}
