package br.com.notas.alunos;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author VINICIUS.BORGES
 */
public class BoletimSimples {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o nome do aluno: ");
        String nome = leitor.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("\n=== Boletim do Aluno ===");
        System.out.println("Nome: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.printf("Média Final: %.2f\n", media);

        if (media >= 6.0) {
            System.out.println("Status: APROVADO");
        } else {
            System.out.println("Status: REPROVADO");
        }

        leitor.close();
    }
}