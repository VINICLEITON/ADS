package CodigosDeAulas.Exemplos;

/*
 * No printf, você escreve um texto padrão e coloca marcadores
 * de formato onde os valores serão inseridos.Os principais são:
 * 
 * %s → texto (String)
 * %d → número inteiro (int)
 * %f → número decimal (double ou float)
 * %.2f → número decimal com 2 casas
 * %n → quebra de linha
 * 
 * Diferença entre print, println e printf
 * print → imprime sem pular linha
 * println → imprime e pula linha
 * printf → imprime com formatação
 */


public class ExemploPrintf {	
	    public static void main(String[] args) {
	        String nome = "Vivi";
	        int idade = 30;
	        double nota = 8.756;

	        System.out.printf("Nome: %s\n", nome);
	        System.out.printf("Idade: %d anos\n", idade);
	        System.out.println("Idade: " + idade + "anos");
	        System.out.printf("Nota final: %.2f\n", nota);
	        System.out.printf("Olá!\n");
	        System.out.printf("\tOlá!");
	        System.out.printf("Nome: %s\n", nome);
	    }	
}
