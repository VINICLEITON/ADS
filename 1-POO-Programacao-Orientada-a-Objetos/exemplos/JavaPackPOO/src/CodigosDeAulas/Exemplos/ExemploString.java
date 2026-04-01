package CodigosDeAulas.Exemplos;

public class ExemploString {

	public static void main(String[] args) {
		 	//Criando uma string
	        String s = "Boa tarde";

	        // Juntando texto com concat
	        System.out.println(s.concat("!!!"));

	        // Juntando texto com +
	        System.out.println(s + "!!!");

	        // Verificando se começa com "Boa"
	        System.out.println(s.startsWith("Boa"));

	        // Transformando em minúsculo e verificando
	        System.out.println(s.toLowerCase().startsWith("boa"));

	        // Mostrando a quantidade de caracteres
	        System.out.println(s.length());

	        // Comparando se é igual
	        System.out.println(s.equals("Boa tarde"));

	        // Comparando após transformar em minúsculo
	        System.out.println(s.toLowerCase().equals("boa tarde"));

	        // Comparando sem diferenciar maiúsculas e minúsculas
	        System.out.println(s.equalsIgnoreCase("boa tarde"));

	        // Criando variáveis
	        var nome = "Pedro";
	        var sobrenome = "Santos";
	        var idade = 33;
	        var salario = 12345.987;

	        // Mostrando os dados
	        System.out.println("\n--- Dados do Usuário ---");
	        System.out.println("Nome: " + nome +
	                           "\nSobrenome: " + sobrenome +
	                           "\nIdade: " + idade +
	                           "\nSalário: " + salario);

	        // Mostrando os dados formatados
	        System.out.printf("\nO senhor %s %s tem %d anos e ganha R$%.2f.",
	                          nome, sobrenome, idade, salario);

	        // Guardando uma frase formatada em uma variável
	        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.",
	                                     nome, sobrenome, idade, salario);

	        // Exibindo a frase
	        System.out.println(frase);	    
	}
}
