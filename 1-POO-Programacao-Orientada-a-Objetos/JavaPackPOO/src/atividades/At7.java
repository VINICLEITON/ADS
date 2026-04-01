package atividades;

import java.util.Locale;
import java.util.Scanner;

public class At7 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escolha qual questão deseja executar:");
		System.out.println("1 - Fahrenheit para Celsius");
		System.out.println("2 - Celsius para Fahrenheit");
		System.out.println("3 - Cálculo do IMC");
		System.out.println("4 - Quadrado e Cubo");
		System.out.println("5 - Área do Triângulo");
		System.out.println("6 - Bhaskara (2º grau)");
		System.out.print("Digite a opção (1 a 6): ");
		int opcao = scanner.nextInt();

		switch (opcao) {
			case 1:
				executarQuestao1(scanner);
				break;
			case 2:
				executarQuestao2(scanner);
				break;
			case 3:
				executarQuestao3(scanner);
				break;
			case 4:
				executarQuestao4(scanner);
				break;
			case 5:
				executarQuestao5(scanner);
				break;
			case 6:
				executarQuestao6();
				break;
			default:
				System.out.println("Opção inválida. Escolha um número de 1 a 6.");
		}

		scanner.close();
	}

	// Questão 1: Fahrenheit para Celsius
	private static void executarQuestao1(Scanner scanner) {
		System.out.print("Q1 - Digite a temperatura em Fahrenheit: ");
		double fahrenheit = scanner.nextDouble();
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.printf("Q1 - Temperatura em Celsius: %.2f°C%n", celsius);
	}

	// Questão 2: Celsius para Fahrenheit
	private static void executarQuestao2(Scanner scanner) {
		System.out.print("Q2 - Digite a temperatura em Celsius: ");
		double celsius = scanner.nextDouble();
		double fahrenheit = (celsius * 9 / 5) + 32;
		System.out.printf("Q2 - Temperatura em Fahrenheit: %.2f°F%n", fahrenheit);
	}

	// Questão 3: Cálculo do IMC
	private static void executarQuestao3(Scanner scanner) {
		System.out.print("Q3 - Digite seu peso (kg): ");
		double peso = scanner.nextDouble();
		System.out.print("Q3 - Digite sua altura (m): ");
		double altura = scanner.nextDouble();
		double imc = peso / (altura * altura);
		System.out.printf("Q3 - Seu IMC é: %.2f%n", imc);
	}

	// Questão 4: Valor ao quadrado e ao cubo
	private static void executarQuestao4(Scanner scanner) {
		System.out.print("Q4 - Digite um valor: ");
		double valor = scanner.nextDouble();
		double quadrado = valor * valor;
		double cubo = valor * valor * valor;
		System.out.printf("Q4 - Valor ao quadrado: %.2f%n", quadrado);
		System.out.printf("Q4 - Valor ao cubo: %.2f%n", cubo);
	}

	// Questão 5: Área de um triângulo
	private static void executarQuestao5(Scanner scanner) {
		System.out.print("Q5 - Digite a base do triângulo: ");
		double base = scanner.nextDouble();
		System.out.print("Q5 - Digite a altura do triângulo: ");
		double altura = scanner.nextDouble();
		double area = (base * altura) / 2;
		System.out.printf("Q5 - Área do triângulo: %.2f%n", area);
	}

	// Questão 6: Equação do segundo grau (Bhaskara)
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
