package CodigosDeAulas.RepeticaoEx;

/* Exemplo 2 - utilizando "while" (enquanto)
 * Ler 8 números fornecidos pelo usuário, 
 * calcular e exibir a média entre eles.
 */
import java.util.Scanner;

//classe
public class Ex2_while {

	// método principal
	public static void main(String args[]) {
		// declaração de variáveis
		float soma, num, media;
		int cont;

		Scanner leia = new Scanner(System.in);
		// inicialização de variáveis
		soma = 0;
		cont = 0;
		// enquanto a variável cont for menor que 8
		while (cont < 8) { // inicia o loop
			// armazena na variável num o valor digitado via teclado
			num = leia.nextFloat();
			// a variável soma acula a soma com num
			soma += num;
			// incrementa o contador cont
			cont++;
		} // fim do loop
			// calcula a média dos números somados
		media = soma / cont;
		// exibe (escreve) a média
		System.out.println("Média = " + media);
	} // fim do método principal
} // fim da cl

// Em Java a expressão cont ← cont + 1 é representada por cont++.
