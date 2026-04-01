/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.notas.alunos;

/**
 *
 * @author VINICIUS.BORGES
 */
import java.util.Scanner;
import java.util.Locale;

public class BoletimSimples {

    public static void main(String[] args) {
        // Configurado com Locale.US para aceitar ponto como separador decimal nas notas
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // 1. Solicitando as informações
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        // 2. Calculando a média
        double media = (nota1 + nota2) / 2;

        // 3. Exibindo os resultados
        System.out.println("\n=== Boletim do Aluno ===");
        System.out.println("Nome: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        
        // Exibindo a média formatada com printf (2 casas decimais)
        System.out.printf("Média Final: %.2f\n", media);

        // 4. Estrutura condicional para verificar aprovação
        if (media >= 6.0) {
            System.out.println("Status: APROVADO");
        } else {
            System.out.println("Status: REPROVADO");
        }

        scanner.close();
    }
}