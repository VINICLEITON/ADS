package atividades;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VINICIUS.BORGES
 */
public class At7 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escolha qual questão deseja executar:");
        System.out.println("1 - Fahrenheit para Celsius");
        System.out.println("2 - Celsius para Fahrenheit");
        System.out.println("3 - Cálculo do IMC");
        System.out.println("4 - Quadrado e Cubo");
        System.out.println("5 - Área do Triângulo");
        System.out.println("6 - Bhaskara (2º grau)");
        System.out.print("Digite a opção (1 a 6): ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                executarQuestao1(leitor);
                break;
            case 2:
                executarQuestao2(leitor);
                break;
            case 3:
                executarQuestao3(leitor);
                break;
            case 4:
                executarQuestao4(leitor);
                break;
            case 5:
                executarQuestao5(leitor);
                break;
            case 6:
                executarQuestao6();
                break;
            default:
                System.out.println("Opção inválida. Escolha um número de 1 a 6.");
        }

        leitor.close();
    }

    private static void executarQuestao1(Scanner leitor) {
        System.out.print("Q1 - Digite a temperatura em Fahrenheit: ");
        double fahrenheit = leitor.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("Q1 - Temperatura em Celsius: %.2f°C%n", celsius);
    }

    private static void executarQuestao2(Scanner leitor) {
        System.out.print("Q2 - Digite a temperatura em Celsius: ");
        double celsius = leitor.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("Q2 - Temperatura em Fahrenheit: %.2f°F%n", fahrenheit);
    }

    private static void executarQuestao3(Scanner leitor) {
        System.out.print("Q3 - Digite seu peso (kg): ");
        double peso = leitor.nextDouble();
        System.out.print("Q3 - Digite sua altura (m): ");
        double altura = leitor.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("Q3 - Seu IMC é: %.2f%n", imc);
    }

    private static void executarQuestao4(Scanner leitor) {
        System.out.print("Q4 - Digite um valor: ");
        double valor = leitor.nextDouble();
        double quadrado = valor * valor;
        double cubo = valor * valor * valor;
        System.out.printf("Q4 - Valor ao quadrado: %.2f%n", quadrado);
        System.out.printf("Q4 - Valor ao cubo: %.2f%n", cubo);
    }

    private static void executarQuestao5(Scanner leitor) {
        System.out.print("Q5 - Digite a base do triângulo: ");
        double base = leitor.nextDouble();
        System.out.print("Q5 - Digite a altura do triângulo: ");
        double altura = leitor.nextDouble();
        double area = (base * altura) / 2;
        System.out.printf("Q5 - Área do triângulo: %.2f%n", area);
    }

    private static void executarQuestao6() {
        double a = 1;
        double b = 12;
        double c = -13;
        double delta = (b * b) - (4 * a * c);

        System.out.printf("Q6 - Equação: %.0fx² + %.0fx + %.0f = 0%n", a, b, c);
        System.out.printf("Q6 - Delta: %.2f%n", delta);

        if (delta >= 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Q6 - Raiz x1: %.2f%n", x1);
            System.out.printf("Q6 - Raiz x2: %.2f%n", x2);
        } else {
            System.out.println("Q6 - Delta negativo. Não existem raízes reais.");
        }
    }
}
