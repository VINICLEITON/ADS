package BaseCodigos;

public class Variaveis {

    public static void main(String[] args) {

        byte idade = 20;
        short ano = 2025;
        int populacao = 215000000;
        long distanciaEmMetros = 9_460_730_472_580_800L;
        float altura = 1.75f;
        double pi = 3.141592653589793;
        char inicial = 'J';
        boolean estudando = true;
        String curso = "Análise e Desenvolvimento de Sistemas";

        System.out.println("=== Tipos Primitivos ===");
        System.out.println("byte  - idade: " + idade);
        System.out.println("short - ano: " + ano);
        System.out.println("int   - populacao: " + populacao);
        System.out.println("long  - distancia (m): " + distanciaEmMetros);
        System.out.println("float - altura: " + altura);
        System.out.println("double- pi: " + pi);
        System.out.println("char  - inicial: " + inicial);
        System.out.println("boolean - estudando: " + estudando);
        System.out.println("String  - curso: " + curso);

        int numero = 42;
        double numeroDecimal = numero;

        double preco = 9.99;
        int precoInteiro = (int) preco;

        System.out.println("\n=== Conversão de Tipos (Casting) ===");
        System.out.println("int → double: " + numero + " vira " + numeroDecimal);
        System.out.println("double → int: " + preco + " vira " + precoInteiro);

        final double TAXA_JUROS = 0.05;
        System.out.println("\nConstante TAXA_JUROS: " + TAXA_JUROS);
    }
}
