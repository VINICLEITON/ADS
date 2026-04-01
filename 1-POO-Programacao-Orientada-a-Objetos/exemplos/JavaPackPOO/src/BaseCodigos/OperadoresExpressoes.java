package BaseCodigos;

public class OperadoresExpressoes {

    public static void main(String[] args) {

        int primeiroNumero = 10;
        int segundoNumero = 3;

        System.out.println("=== Operadores Aritméticos ===");
        System.out.println("primeiroNumero = " + primeiroNumero + ", segundoNumero = " + segundoNumero);
        System.out.println("Adição        primeiroNumero + segundoNumero = " + (primeiroNumero + segundoNumero));
        System.out.println("Subtração     primeiroNumero - segundoNumero = " + (primeiroNumero - segundoNumero));
        System.out.println("Multiplicação primeiroNumero * segundoNumero = " + (primeiroNumero * segundoNumero));
        System.out.println("Divisão       primeiroNumero / segundoNumero = " + (primeiroNumero / segundoNumero));
        System.out.println("Módulo (resto) primeiroNumero % segundoNumero = " + (primeiroNumero % segundoNumero));

        double divisaoReal = (double) primeiroNumero / segundoNumero;
        System.out.println("Divisão real (double) = " + divisaoReal);

        int contador = 5;
        contador++;
        System.out.println("\n=== Incremento / Decremento ===");
        System.out.println("contador++ → " + contador);
        contador--;
        System.out.println("contador-- → " + contador);

        int valorX = 10;
        System.out.println("Pré-incremento  ++valorX: " + (++valorX));
        int valorY = 10;
        System.out.println("Pós-incremento  valorY++: " + (valorY++));
        System.out.println("Valor de valorY após valorY++: " + valorY);

        int numero = 20;
        numero += 5;
        numero -= 3;
        numero *= 2;
        numero /= 4;
        numero %= 3;
        System.out.println("\n=== Atribuição Composta (resultado final) ===");
        System.out.println("numero após +=5, -=3, *=2, /=4, %=3: " + numero);

        int valor1 = 10, valor2 = 20;
        System.out.println("\n=== Operadores Relacionais ===");
        System.out.println("valor1 = " + valor1 + ", valor2 = " + valor2);
        System.out.println("valor1 == valor2  (igual): " + (valor1 == valor2));
        System.out.println("valor1 != valor2  (diferente): " + (valor1 != valor2));
        System.out.println("valor1 > valor2   (maior): " + (valor1 > valor2));
        System.out.println("valor1 < valor2   (menor): " + (valor1 < valor2));
        System.out.println("valor1 >= valor2  (maior ou igual): " + (valor1 >= valor2));
        System.out.println("valor1 <= valor2  (menor ou igual): " + (valor1 <= valor2));

        boolean chovendo = true;
        boolean fimDeSemana = false;

        System.out.println("\n=== Operadores Lógicos ===");
        System.out.println("chovendo && fimDeSemana: " + (chovendo && fimDeSemana));
        System.out.println("chovendo || fimDeSemana: " + (chovendo || fimDeSemana));
        System.out.println("!chovendo: " + (!chovendo));

        int nota = 75;
        String resultado = (nota >= 60) ? "Aprovado" : "Reprovado";
        System.out.println("\n=== Operador Ternário ===");
        System.out.println("Nota " + nota + " → " + resultado);
    }
}
