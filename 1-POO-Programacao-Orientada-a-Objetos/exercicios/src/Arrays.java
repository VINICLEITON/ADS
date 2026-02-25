// ============================================================
//  Arrays em Java
//  Conceito: um array é uma estrutura que armazena VÁRIOS valores
//  do MESMO TIPO em posições sequenciais de memória.
//  O tamanho é fixo: definido na criação e não pode ser alterado.
//  O índice começa em 0 (primeiro elemento = posição 0).
// ============================================================

public class Arrays {

    public static void main(String[] args) {

        // ===================================================
        //  ARRAY UNIDIMENSIONAL (vetor)
        // ===================================================

        // --- Declaração e inicialização separadas ---
        // Cria um array de 5 inteiros; todos iniciam com 0
        int[] notas = new int[5];

        // Atribuindo valores por índice
        notas[0] = 85;  // primeira posição
        notas[1] = 92;
        notas[2] = 78;
        notas[3] = 88;
        notas[4] = 95;  // última posição (tamanho 5 → índices 0 a 4)

        System.out.println("=== Array de notas ===");

        // .length retorna o tamanho do array (número de posições)
        System.out.println("Tamanho do array: " + notas.length);

        // Percorrendo com for tradicional (temos acesso ao índice)
        for (int i = 0; i < notas.length; i++) {
            System.out.println("notas[" + i + "] = " + notas[i]);
        }

        // --- Declaração com inicialização direta ---
        // Os valores são fornecidos entre chaves; o tamanho é inferido
        String[] frutas = {"Maçã", "Banana", "Laranja", "Uva"};

        System.out.println("\n=== Array de frutas (for-each) ===");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // ----- Calculando a média de um array -----
        int soma = 0;
        for (int nota : notas) {
            soma += nota; // acumula a soma de todos os elementos
        }
        double media = (double) soma / notas.length;
        System.out.println("\nMédia das notas: " + media);

        // ===================================================
        //  ARRAY BIDIMENSIONAL (matriz)
        //  É um "array de arrays": pense como linhas e colunas.
        //  Acesso: matriz[linha][coluna]
        // ===================================================
        System.out.println("\n=== Matriz 3x3 ===");

        // Cria uma matriz com 3 linhas e 3 colunas
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Loop aninhado para percorrer linhas e colunas
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                // Imprime o valor sem quebrar linha (\t é tabulação para alinhar)
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println(); // quebra de linha ao final de cada linha da matriz
        }

        // ===================================================
        //  ORDENAÇÃO COM Arrays.sort()
        //  A classe java.util.Arrays fornece utilitários prontos para arrays.
        // ===================================================
        int[] valores = {42, 7, 19, 3, 55, 28};

        System.out.println("\n=== Antes da ordenação ===");
        for (int v : valores) {
            System.out.print(v + " ");
        }

        java.util.Arrays.sort(valores); // ordena o array em ordem crescente

        System.out.println("\n=== Depois de Arrays.sort() ===");
        for (int v : valores) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
