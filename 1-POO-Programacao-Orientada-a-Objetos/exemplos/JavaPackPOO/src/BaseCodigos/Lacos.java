// Autor: VINICIUS.BORGES
package BaseCodigos;

public class Lacos {

    public static void main(String[] args) {

        System.out.println("=== for ===");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Volta " + i);
        }

        System.out.println("\nContagem regressiva:");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i + "...");
        }
        System.out.println("Fim!");

        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("\nFor-each percorrendo array:");
        for (int numero : numeros) {
            System.out.println("Elemento: " + numero);
        }

        System.out.println("\n=== while ===");

        int saldo = 100;

        while (saldo > 0) {
            System.out.println("Saldo atual: R$" + saldo);
            saldo -= 30;
        }
        System.out.println("Saldo esgotado. Valor final: R$" + saldo);

        System.out.println("\n=== do-while ===");

        int tentativas = 0;

        do {
            tentativas++;
            System.out.println("Tentativa número " + tentativas);
        } while (tentativas < 3);

        System.out.println("\n=== break ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Encontrou 6 → interrompendo o loop.");
                break;
            }
            System.out.println("i = " + i);
        }

        System.out.println("\n=== continue (pular números pares) ===");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Ímpar: " + i);
        }
    }
}
