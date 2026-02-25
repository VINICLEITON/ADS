// ============================================================
//  Métodos em Java
//  Conceito: um método é um bloco de código REUTILIZÁVEL que
//  executa uma tarefa específica. Permite organizar o programa
//  em partes menores e evitar repetição de código (DRY).
//
//  Sintaxe:
//  modificador tipodeRetorno nomeDoMetodo(parâmetros) {
//      // corpo do método
//      return valor; // obrigatório se o tipo de retorno NÃO for void
//  }
// ============================================================

public class Metodos {

    // ===================================================
    //  MÉTODO SEM RETORNO (void) E SEM PARÂMETROS
    //  'void' significa que o método NÃO devolve nenhum valor.
    //  'static' permite chamar o método sem criar um objeto.
    // ===================================================
    static void exibirBoasVindas() {
        System.out.println("Bem-vindo ao estudo de métodos em Java!");
    }

    // ===================================================
    //  MÉTODO COM PARÂMETROS E SEM RETORNO
    //  Parâmetros são variáveis que recebem valores ao chamar o método.
    // ===================================================
    static void saudar(String nome, int idade) {
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
    }

    // ===================================================
    //  MÉTODO COM RETORNO
    //  O tipo antes do nome indica o que o método devolve.
    //  'return' encerra o método e devolve o valor ao chamador.
    // ===================================================
    static int somar(int a, int b) {
        int resultado = a + b;
        return resultado; // devolve o resultado para quem chamou o método
    }

    static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0; // 'return' direto com a expressão
    }

    // ===================================================
    //  SOBRECARGA DE MÉTODOS (Overloading)
    //  Java permite ter vários métodos com o MESMO NOME,
    //  desde que os parâmetros sejam diferentes (tipo ou quantidade).
    //  O compilador escolhe qual versão chamar com base nos argumentos.
    // ===================================================
    static double multiplicar(double a, double b) {
        return a * b;
    }

    static double multiplicar(double a, double b, double c) {
        // Mesmo nome, mas agora aceita TRÊS parâmetros
        return a * b * c;
    }

    // ===================================================
    //  MÉTODO RECURSIVO
    //  Um método que chama a SI MESMO para resolver um
    //  problema dividido em partes menores.
    //  SEMPRE precisa de uma condição de parada (caso base)
    //  para não entrar em loop infinito.
    // ===================================================
    static int fatorial(int n) {
        // Caso base: fatorial de 0 ou 1 é 1
        if (n <= 1) {
            return 1;
        }
        // Chamada recursiva: n! = n * (n-1)!
        return n * fatorial(n - 1);
    }

    // ===================================================
    //  MÉTODO MAIN — ponto de entrada do programa
    // ===================================================
    public static void main(String[] args) {

        // Chamando método sem parâmetros
        exibirBoasVindas();

        // Chamando método com parâmetros
        saudar("Ana", 22);
        saudar("Bruno", 19);

        // Chamando método com retorno
        int soma = somar(8, 5);
        System.out.println("\n8 + 5 = " + soma);

        double media = calcularMedia(7.5, 8.0, 9.5);
        System.out.println("Média: " + media);

        // Sobrecarga: Java escolhe a versão correta pelo número de argumentos
        System.out.println("\nSobrecarga de multiplicar:");
        System.out.println("2 * 3       = " + multiplicar(2, 3));
        System.out.println("2 * 3 * 4   = " + multiplicar(2, 3, 4));

        // Recursão: calculando fatorial
        System.out.println("\nFatorial recursivo:");
        for (int i = 0; i <= 6; i++) {
            System.out.println(i + "! = " + fatorial(i));
        }
    }
}
