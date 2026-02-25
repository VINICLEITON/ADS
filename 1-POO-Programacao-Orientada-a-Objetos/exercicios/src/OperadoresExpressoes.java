// ============================================================
//  Operadores e Expressões em Java
//  Conceito: operadores são símbolos que realizam operações
//  sobre valores (operandos) e produzem um resultado.
// ============================================================

public class OperadoresExpressoes {

    public static void main(String[] args) {

        // ----- OPERADORES ARITMÉTICOS -----
        // Realizam cálculos matemáticos básicos
        int a = 10;
        int b = 3;

        System.out.println("=== Operadores Aritméticos ===");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Adição       a + b = " + (a + b));   // 13
        System.out.println("Subtração    a - b = " + (a - b));   // 7
        System.out.println("Multiplicação a * b = " + (a * b));  // 30
        System.out.println("Divisão      a / b = " + (a / b));   // 3  (divisão inteira descarta o resto)
        System.out.println("Módulo (resto) a % b = " + (a % b)); // 1

        // Para obter divisão com casas decimais, ao menos um operando deve ser double
        double divisaoReal = (double) a / b;
        System.out.println("Divisão real (double) a / b = " + divisaoReal); // 3.333...

        // ----- OPERADORES DE INCREMENTO E DECREMENTO -----
        // ++ adiciona 1; -- subtrai 1
        int contador = 5;
        contador++;          // equivale a: contador = contador + 1
        System.out.println("\n=== Incremento / Decremento ===");
        System.out.println("contador++ → " + contador); // 6
        contador--;          // equivale a: contador = contador - 1
        System.out.println("contador-- → " + contador); // 5

        // Pré-incremento (++x): incrementa ANTES de usar o valor
        int x = 10;
        System.out.println("Pré-incremento  ++x: " + (++x)); // 11
        // Pós-incremento (x++): usa o valor ANTES de incrementar
        int y = 10;
        System.out.println("Pós-incremento  y++: " + (y++)); // 10 (y passa a ser 11 depois)
        System.out.println("Valor de y após y++: " + y);      // 11

        // ----- OPERADORES DE ATRIBUIÇÃO COMPOSTOS -----
        // Atalhos que combinam operação aritmética com atribuição
        int n = 20;
        n += 5;  // n = n + 5  → 25
        n -= 3;  // n = n - 3  → 22
        n *= 2;  // n = n * 2  → 44
        n /= 4;  // n = n / 4  → 11
        n %= 3;  // n = n % 3  → 2
        System.out.println("\n=== Atribuição Composta (resultado final) ===");
        System.out.println("n após +=5, -=3, *=2, /=4, %=3: " + n); // 2

        // ----- OPERADORES RELACIONAIS -----
        // Comparam dois valores e retornam boolean (true ou false)
        int p = 10, q = 20;
        System.out.println("\n=== Operadores Relacionais ===");
        System.out.println("p = " + p + ", q = " + q);
        System.out.println("p == q  (igual): " + (p == q));           // false
        System.out.println("p != q  (diferente): " + (p != q));       // true
        System.out.println("p > q   (maior): " + (p > q));            // false
        System.out.println("p < q   (menor): " + (p < q));            // true
        System.out.println("p >= q  (maior ou igual): " + (p >= q));  // false
        System.out.println("p <= q  (menor ou igual): " + (p <= q));  // true

        // ----- OPERADORES LÓGICOS -----
        // Combinam expressões booleanas
        boolean chovendo = true;
        boolean fimDeSemana = false;

        System.out.println("\n=== Operadores Lógicos ===");
        // && (AND/E): true somente se AMBAS as condições forem true
        System.out.println("chovendo && fimDeSemana: " + (chovendo && fimDeSemana)); // false
        // || (OR/OU): true se PELO MENOS UMA condição for true
        System.out.println("chovendo || fimDeSemana: " + (chovendo || fimDeSemana)); // true
        // !  (NOT/NÃO): inverte o valor booleano
        System.out.println("!chovendo: " + (!chovendo));                              // false

        // ----- OPERADOR TERNÁRIO -----
        // Atalho para if/else em uma única linha
        // Sintaxe: (condição) ? valorSeVerdadeiro : valorSeFalso
        int nota = 75;
        String resultado = (nota >= 60) ? "Aprovado" : "Reprovado";
        System.out.println("\n=== Operador Ternário ===");
        System.out.println("Nota " + nota + " → " + resultado); // Aprovado
    }
}
