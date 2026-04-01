package CodigosDeAulas.RepeticaoEx;
/* Exemplo 1 - estrutura for (para): ler 8 números fornecidos pelo usuário
* calcular e exibir a média entre eles.
*/

/* O programa utiliza a classe Scanner para ler os 
* números digitados via teclado pelo usuário */

import java.util.Scanner;

//classe (o nome do programa ex1_for.java)
public class Ex1_for {

	// método principal onde inicia a execução do programa
	public static void main(String args[]) {
		// declaração de variáveis
		float soma, num, media;
		int cont;
		Scanner leia = new Scanner(System.in);
		// incializa a variável
		soma = 0;

		/*
		 * para cont começando com 1;
		 * até cont menor ou igual a 8;
		 * increment cont de 1 em 1
		 */

		for (cont = 1; cont <= 8; cont++) {

			/*
			 * a variável leia armazena o valor digitado pelo usuário
			 * esse valor é atribuído à num
			 */

			num = leia.nextFloat();
			// soma armazena o valor de soma + o valor de num
			soma += num; // soma = soma + num
		} // fim do loop

		/*
		 * calcula a média
		 * o valor de soma dividido pelo número de iterações
		 */

		media = soma / cont;

		// exibe a média dos números digitados

		System.out.println("Média =" + media);
	}
}
// Em Java a expressão cont ← cont + 1 é representada por cont++.
