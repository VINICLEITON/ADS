// ============================================================
//  Variáveis e Tipos de Dados em Java
//  Conceito: Java é uma linguagem FORTEMENTE TIPADA, ou seja,
//  toda variável precisa ter um tipo definido antes de ser usada.
// ============================================================

public class Variaveis {

    public static void main(String[] args) {

        // ----- TIPOS PRIMITIVOS -----
        // byte: número inteiro pequeno (-128 a 127), ocupa 1 byte de memória
        byte idade = 20;

        // short: número inteiro médio (-32768 a 32767), ocupa 2 bytes
        short ano = 2025;

        // int: número inteiro padrão (mais usado), ocupa 4 bytes
        int populacao = 215000000;

        // long: número inteiro grande, ocupa 8 bytes
        // O 'L' no final indica que é um literal do tipo long
        long distanciaEmMetros = 9_460_730_472_580_800L;

        // float: número decimal de precisão simples, ocupa 4 bytes
        // O 'f' no final indica que é um literal do tipo float
        float altura = 1.75f;

        // double: número decimal de precisão dupla (mais usado), ocupa 8 bytes
        double pi = 3.141592653589793;

        // char: um único caractere (letra, dígito ou símbolo), ocupa 2 bytes
        // Deve ser declarado com aspas simples
        char inicial = 'J';

        // boolean: verdadeiro ou falso (true/false), ocupa 1 bit
        boolean estudando = true;

        // ----- TIPO REFERÊNCIA -----
        // String: cadeia de caracteres (texto)
        // String NÃO é primitivo; é uma classe da biblioteca padrão Java
        // Deve ser declarado com aspas duplas
        String curso = "Análise e Desenvolvimento de Sistemas";

        // ----- EXIBINDO OS VALORES -----
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

        // ----- CONVERSÃO DE TIPOS (Casting) -----
        // Casting implícito: de tipo menor para maior (automático)
        int numero = 42;
        double numeroDecimal = numero; // int → double, sem perda de dados

        // Casting explícito: de tipo maior para menor (pode perder dados)
        double preco = 9.99;
        int precoInteiro = (int) preco; // double → int, a parte decimal é DESCARTADA

        System.out.println("\n=== Conversão de Tipos (Casting) ===");
        System.out.println("int → double: " + numero + " vira " + numeroDecimal);
        System.out.println("double → int: " + preco + " vira " + precoInteiro);

        // ----- CONSTANTES -----
        // 'final' torna a variável uma constante: seu valor não pode ser alterado
        final double TAXA_JUROS = 0.05;
        System.out.println("\nConstante TAXA_JUROS: " + TAXA_JUROS);
    }
}
