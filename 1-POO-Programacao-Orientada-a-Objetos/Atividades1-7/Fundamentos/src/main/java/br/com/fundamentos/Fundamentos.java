package br.com.fundamentos;

import java.util.Scanner;
import java.util.Locale;

public class Fundamentos {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        int opcao;

        do {
            System.out.println("=======================================");
            System.out.println("        MENU DE FUNDAMENTOS            ");
            System.out.println("=======================================");
            System.out.println("1 - Fahrenheit para Celsius");
            System.out.println("2 - Celsius para Fahrenheit");
            System.out.println("3 - Calcular IMC");
            System.out.println("4 - Calcular Quadrado e Cubo");
            System.out.println("5 - Calcular Área do Triângulo");
            System.out.println("6 - Resolver Bhaskara (Exemplo Fixo)");
            System.out.println("0 - Sair do Programa");
            System.out.println("=======================================");
            System.out.print("Escolha uma opção: ");

            opcao = leitor.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.println("--- 1. Fahrenheit para Celsius ---");
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    double fahrenheit = leitor.nextDouble();
                    double fParaCelsius = (fahrenheit - 32) * 5 / 9;
                    System.out.printf("Resultado: %.2f °C\n\n", fParaCelsius);
                    break;

                case 2:
                    System.out.println("--- 2. Celsius para Fahrenheit ---");
                    System.out.print("Digite a temperatura em Celsius: ");
                    double celsius = leitor.nextDouble();
                    double cParaFahrenheit = (celsius * 9 / 5) + 32;
                    System.out.printf("Resultado: %.2f °F\n\n", cParaFahrenheit);
                    break;

                case 3:
                    System.out.println("--- 3. Calculadora de IMC ---");
                    System.out.print("Digite o seu peso (kg): ");
                    double peso = leitor.nextDouble();
                    System.out.print("Digite a sua altura (m): ");
                    double altura = leitor.nextDouble();
                    double imc = peso / Math.pow(altura, 2);
                    System.out.printf("Seu IMC é: %.2f\n\n", imc);
                    break;

                case 4:
                    System.out.println("--- 4. Quadrado e Cubo ---");
                    System.out.print("Digite um valor numérico: ");
                    double valor = leitor.nextDouble();
                    System.out.printf("Ao quadrado: %.2f | Ao cubo: %.2f\n\n", Math.pow(valor, 2), Math.pow(valor, 3));
                    break;

                case 5:
                    System.out.println("--- 5. Área do Triângulo ---");
                    System.out.print("Digite o valor da base: ");
                    double base = leitor.nextDouble();
                    System.out.print("Digite o valor da altura: ");
                    double alturaTriangulo = leitor.nextDouble();
                    double area = (base * alturaTriangulo) / 2;
                    System.out.printf("A área do triângulo é: %.2f\n\n", area);
                    break;

                case 6:
                    System.out.println("--- 6. Equação do Segundo Grau (Bhaskara) ---");
                    double a = 1, b = 12, c = -13;
                    System.out.printf("Equação: %.0fx² + %.0fx + %.0f = 0\n", a, b, c);

                    double delta = Math.pow(b, 2) - (4 * a * c);
                    System.out.printf("O valor de Delta é: %.2f\n", delta);

                    if (delta < 0) {
                        System.out.println("Delta negativo. A equação não possui raízes reais.\n");
                    } else {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        System.out.printf("Raiz x1: %.2f\n", x1);
                        System.out.printf("Raiz x2: %.2f\n\n", x2);
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Por favor, tente novamente.\n");
                    break;
            }

        } while (opcao != 0);

        leitor.close();
    }
}