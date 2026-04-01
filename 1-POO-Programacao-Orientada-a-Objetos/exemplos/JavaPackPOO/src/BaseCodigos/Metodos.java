package BaseCodigos;

/**
 *
 * @author VINICIUS.BORGES
 */
public class Metodos {

    static void exibirBoasVindas() {
        System.out.println("Bem-vindo ao estudo de métodos em Java!");
    }

    static void saudar(String nome, int idade) {
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
    }

    static int somar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0;
    }

    static double multiplicar(double a, double b) {
        return a * b;
    }

    static double multiplicar(double a, double b, double c) {
        return a * b * c;
    }

    static int fatorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {

        exibirBoasVindas();

        saudar("Ana", 22);
        saudar("Bruno", 19);

        int soma = somar(8, 5);
        System.out.println("\n8 + 5 = " + soma);

        double media = calcularMedia(7.5, 8.0, 9.5);
        System.out.println("Média: " + media);

        System.out.println("\nSobrecarga de multiplicar:");
        System.out.println("2 * 3       = " + multiplicar(2, 3));
        System.out.println("2 * 3 * 4   = " + multiplicar(2, 3, 4));

        System.out.println("\nFatorial recursivo:");
        for (int i = 0; i <= 6; i++) {
            System.out.println(i + "! = " + fatorial(i));
        }
    }
}
