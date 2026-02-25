// ============================================================
//  Laços de Repetição (Loops) em Java
//  Conceito: permitem executar um bloco de código VÁRIAS VEZES
//  enquanto uma condição for verdadeira.
//  Java oferece três tipos: for, while e do-while.
// ============================================================

public class Lacos {

    public static void main(String[] args) {

        // ===================================================
        //  FOR
        //  Ideal quando sabemos QUANTAS vezes o bloco deve
        //  se repetir.
        //  Sintaxe: for (inicialização; condição; atualização) { ... }
        // ===================================================
        System.out.println("=== for ===");

        // i começa em 1; repete enquanto i <= 5; incrementa i a cada volta
        for (int i = 1; i <= 5; i++) {
            System.out.println("Volta " + i);
        }

        // For contando de trás para frente
        System.out.println("\nContagem regressiva:");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i + "...");
        }
        System.out.println("Fim!");

        // ----- FOR APRIMORADO (for-each) -----
        // Percorre cada elemento de um array ou coleção diretamente,
        // sem precisar de índice.
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("\nFor-each percorrendo array:");
        for (int num : numeros) {
            // 'num' recebe automaticamente cada elemento do array
            System.out.println("Elemento: " + num);
        }

        // ===================================================
        //  WHILE
        //  Ideal quando NÃO sabemos exatamente quantas repetições
        //  serão necessárias; a condição é verificada ANTES de
        //  cada execução do bloco.
        //  Sintaxe: while (condição) { ... }
        // ===================================================
        System.out.println("\n=== while ===");

        int saldo = 100;

        // O loop continua enquanto o saldo for positivo
        while (saldo > 0) {
            System.out.println("Saldo atual: R$" + saldo);
            saldo -= 30; // desconta 30 a cada iteração
        }
        System.out.println("Saldo esgotado. Valor final: R$" + saldo);

        // ===================================================
        //  DO-WHILE
        //  Semelhante ao while, mas o bloco é executado PELO MENOS
        //  UMA VEZ antes de a condição ser verificada.
        //  Sintaxe: do { ... } while (condição);
        // ===================================================
        System.out.println("\n=== do-while ===");

        int tentativas = 0;

        do {
            tentativas++;
            System.out.println("Tentativa número " + tentativas);
            // Mesmo que a condição fosse false desde o início,
            // o bloco executaria ao menos uma vez.
        } while (tentativas < 3);

        // ===================================================
        //  BREAK E CONTINUE
        //  break   → interrompe o loop imediatamente
        //  continue → pula para a próxima iteração (ignora o restante
        //              do bloco naquela volta)
        // ===================================================
        System.out.println("\n=== break ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Encontrou 6 → interrompendo o loop.");
                break; // sai do for quando i == 6
            }
            System.out.println("i = " + i);
        }

        System.out.println("\n=== continue (pular números pares) ===");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // pula a impressão quando i for par
            }
            System.out.println("Ímpar: " + i);
        }
    }
}
