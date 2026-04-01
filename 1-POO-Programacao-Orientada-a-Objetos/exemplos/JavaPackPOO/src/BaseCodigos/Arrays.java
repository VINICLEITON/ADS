// Autor: VINICIUS.BORGES
package BaseCodigos;

public class Arrays {

    public static void main(String[] args) {

        int[] notas = new int[5];

        notas[0] = 85;
        notas[1] = 92;
        notas[2] = 78;
        notas[3] = 88;
        notas[4] = 95;

        System.out.println("=== Array de notas ===");
        System.out.println("Tamanho do array: " + notas.length);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("notas[" + i + "] = " + notas[i]);
        }

        String[] frutas = {"Maçã", "Banana", "Laranja", "Uva"};

        System.out.println("\n=== Array de frutas (for-each) ===");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        double media = (double) soma / notas.length;
        System.out.println("\nMédia das notas: " + media);

        System.out.println("\n=== Matriz 3x3 ===");

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }

        int[] valores = {42, 7, 19, 3, 55, 28};

        System.out.println("\n=== Antes da ordenação ===");
        for (int valor : valores) {
            System.out.print(valor + " ");
        }

        java.util.Arrays.sort(valores);

        System.out.println("\n=== Depois de Arrays.sort() ===");
        for (int valor : valores) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
