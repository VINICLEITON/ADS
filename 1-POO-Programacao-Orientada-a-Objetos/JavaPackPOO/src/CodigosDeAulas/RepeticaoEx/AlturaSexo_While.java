package CodigosDeAulas.RepeticaoEx;

import java.util.Scanner;

	public class AlturaSexo_While {
		public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        final int TOTAL_PESSOAS = 5;

	        double maiorAltura = 0;
	        double menorAltura = 999;
	        double somaAlturasMulheres = 0;
	        double mediaAlturaMulheres = 0;

	        int numeroMulheres = 0;
	        int numeroHomens = 0;
	        int cont = 0;

	        while (cont < TOTAL_PESSOAS) {
	            System.out.print("Digite a altura da pessoa " + (cont + 1) + ": ");
	            double altura = scanner.nextDouble();

	            System.out.print("Digite 1 para feminino e 2 para masculino: ");
	            int sexo = scanner.nextInt();

	            if (altura > maiorAltura) {
	                maiorAltura = altura;
	            }

	            if (altura < menorAltura) {
	                menorAltura = altura;
	            }

	            if (sexo == 1) {
	                somaAlturasMulheres = somaAlturasMulheres + altura;
	                numeroMulheres++;
	            }

	            if (sexo == 2) {
	                numeroHomens++;
	            }

	            cont++;
	        }

	        if (numeroMulheres > 0) {
	            mediaAlturaMulheres = somaAlturasMulheres / numeroMulheres;
	        }

	        System.out.println("Maior altura do grupo: " + maiorAltura);
	        System.out.println("Menor altura do grupo: " + menorAltura);
	        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres);
	        System.out.println("Número de homens: " + numeroHomens);

	        scanner.close();
	    }
	}