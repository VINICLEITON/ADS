/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.aprendizado.operadores;

/**
 *
 * @author VINICIUS.BORGES
 */
public class IncrementoDecremento {

    public static void main(String[] args) {

        /*
         * QUESTÃO A: Como esse programa funciona no prefixado (passo a passo)
         * 1. A variável x1 é inicializada com o valor 5.
         * 2. Na operação y1 = ++x1, o operador ++ está ANTES da variável.
         * O programa primeiro incrementa x1 (5 + 1 = 6) e, logo em seguida,
         * atribui esse novo valor à variável y1.
         * 3. Na operação z1 = --x1, o operador -- também está ANTES.
         * O programa pega o valor atual de x1 (que passou a ser 6),
         * decrementa 1 (6 - 1 = 5) e atribui esse novo valor à variável z1.
         */

        // Exemplo 1: Prefixado
        int x1 = 5, y1, z1;

        y1 = ++x1; // x1 é incrementado antes de ser usado (x1 vira 6, y1 recebe 6)
        z1 = --x1; // x1 é decrementado antes de ser usado (x1 vira 5, z1 recebe 5)

        System.out.println("=== Exemplo Prefixado ===");
        System.out.println("x1 = " + x1); // Imprime 5
        System.out.println("y1 = " + y1); // Imprime 6
        System.out.println("z1 = " + z1); // Imprime 5

        /*
         * QUESTÃO B: O resultado do prefixado nas variáveis x1, y1 e z1
         * x1 = 5 (Pois foi incrementado para 6 e depois decrementado para 5)
         * y1 = 6 (Recebeu o valor de x1 já incrementado)
         * z1 = 5 (Recebeu o valor de x1 já decrementado)
         */

        System.out.println(); // Pula uma linha no console

        /*
         * QUESTÃO C: Como esse programa funciona no posfixado
         * 1. A variável x2 é inicializada com o valor 5.
         * 2. Na operação y2 = x2++, o operador ++ está DEPOIS da variável.
         * O programa primeiro atribui o valor atual de x2 (5) para a variável y2.
         * Somente DEPOIS dessa atribuição é que o valor de x2 é incrementado para 6.
         * 3. Na operação z2 = x2--, o operador -- está DEPOIS.
         * O programa atribui o valor atual de x2 (que agora é 6) para a variável z2.
         * Após essa atribuição, o valor de x2 é decrementado, voltando a ser 5.
         */

        // Exemplo 2: Posfixado
        int x2 = 5, y2, z2;

        y2 = x2++; // x2 é usado primeiro (y2 recebe 5) e depois incrementado (x2 vira 6)
        z2 = x2--; // x2 é usado primeiro (z2 recebe 6) e depois decrementado (x2 vira 5)

        System.out.println("=== Exemplo Posfixado ===");
        System.out.println("x2 = " + x2); // Imprime 5
        System.out.println("y2 = " + y2); // Imprime 5
        System.out.println("z2 = " + z2); // Imprime 6

        /*
         * QUESTÃO D: E o resultado das variáveis x2, y2, z2
         * x2 = 5 (Termina valendo 5 após sofrer o incremento e, em seguida, o decremento)
         * y2 = 5 (Recebeu o valor de x2 ANTES do incremento acontecer)
         * z2 = 6 (Recebeu o valor de x2 ANTES do decremento acontecer)
         */
    }
}
