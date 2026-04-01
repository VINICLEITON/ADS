// Autor: VINICIUS.BORGES
package CodigosDeAulas.RepeticaoEx;

import java.util.Scanner;

public class AlturaSexo_For {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int TOTAL_PESSOAS = 50;

        double maiorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;
        double somaAlturasMulheres = 0.0;
        int numeroMulheres = 0;
        int numeroHomens = 0;

        for (int i = 0; i < TOTAL_PESSOAS; i++) {
            System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
            double altura = leitor.nextDouble();

            System.out.print("Digite o sexo da pessoa " + (i + 1) + " (M/F): ");
            char sexo = leitor.next().charAt(0);

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }

            if (sexo == 'F') {
                somaAlturasMulheres += altura;
                numeroMulheres++;
            } else if (sexo == 'M') {
                numeroHomens++;
            }
        }

        double mediaAlturaMulheres = (numeroMulheres > 0) ? somaAlturasMulheres / numeroMulheres : 0;

        System.out.println("Maior altura do grupo: " + maiorAltura);
        System.out.println("Menor altura do grupo: " + menorAltura);
        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres);
        System.out.println("Número de homens: " + numeroHomens);

        leitor.close();
    }
}
