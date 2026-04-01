// Autor: VINICIUS.BORGES
package CodigosDeAulas.Exemplos;

public class ExemploString {

    public static void main(String[] args) {
        String texto = "Boa tarde";

        System.out.println(texto.concat("!!!"));
        System.out.println(texto + "!!!");
        System.out.println(texto.startsWith("Boa"));
        System.out.println(texto.toLowerCase().startsWith("boa"));
        System.out.println(texto.length());
        System.out.println(texto.equals("Boa tarde"));
        System.out.println(texto.toLowerCase().equals("boa tarde"));
        System.out.println(texto.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        System.out.println("\n--- Dados do Usuário ---");
        System.out.println("Nome: " + nome +
                           "\nSobrenome: " + sobrenome +
                           "\nIdade: " + idade +
                           "\nSalário: " + salario);

        System.out.printf("\nO senhor %s %s tem %d anos e ganha R$%.2f.",
                          nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.",
                                     nome, sobrenome, idade, salario);

        System.out.println(frase);
    }
}
