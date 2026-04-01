package BaseCodigos;

/**
 *
 * @author VINICIUS.BORGES
 */
public class Strings {

    public static void main(String[] args) {

        String saudacao = "Olá, Mundo!";
        String curso = "Análise e Desenvolvimento de Sistemas";

        System.out.println("=== Strings básicas ===");
        System.out.println(saudacao);
        System.out.println(curso);

        System.out.println("\n=== length() ===");
        System.out.println("\"" + saudacao + "\" tem " + saudacao.length() + " caracteres");

        System.out.println("\n=== charAt() ===");
        System.out.println("Primeiro caractere: " + saudacao.charAt(0));
        System.out.println("Último caractere:   " + saudacao.charAt(saudacao.length() - 1));

        System.out.println("\n=== toUpperCase() / toLowerCase() ===");
        System.out.println(saudacao.toUpperCase());
        System.out.println(saudacao.toLowerCase());

        String linguagem = "Java";

        System.out.println("\n=== Verificações ===");
        System.out.println("Contém \"Mundo\"? " + saudacao.contains("Mundo"));
        System.out.println("Começa com \"Olá\"? " + saudacao.startsWith("Olá"));
        System.out.println("Termina com \"!\"? " + saudacao.endsWith("!"));
        System.out.println("Está vazia? " + linguagem.isEmpty());
        System.out.println("Índice de \"Mundo\": " + saudacao.indexOf("Mundo"));

        String textoMinusculo = "java";
        String textoMaiusculo = "Java";

        System.out.println("\n=== Comparação de Strings ===");
        System.out.println("equals:           \"" + textoMinusculo + "\".equals(\"" + textoMaiusculo + "\") → " + textoMinusculo.equals(textoMaiusculo));
        System.out.println("equalsIgnoreCase: \"" + textoMinusculo + "\".equalsIgnoreCase(\"" + textoMaiusculo + "\") → " + textoMinusculo.equalsIgnoreCase(textoMaiusculo));

        System.out.println("\n=== substring() ===");
        String texto = "Programação em Java";
        System.out.println("substring(15):     \"" + texto.substring(15) + "\"");
        System.out.println("substring(0, 11):  \"" + texto.substring(0, 11) + "\"");

        System.out.println("\n=== replace() ===");
        String original = "O gato comeu o peixe do gato";
        String substituido = original.replace("gato", "cachorro");
        System.out.println("Original:    " + original);
        System.out.println("Substituído: " + substituido);

        System.out.println("\n=== trim() ===");
        String comEspacos = "   Olá, Java!   ";
        System.out.println("Com espaços:  |" + comEspacos + "|");
        System.out.println("Sem espaços:  |" + comEspacos.trim() + "|");

        System.out.println("\n=== split() ===");
        String csv = "Ana,Bruno,Carlos,Diana";
        String[] nomes = csv.split(",");
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }

        System.out.println("\n=== StringBuilder ===");
        StringBuilder construtorTexto = new StringBuilder();
        construtorTexto.append("Java ");
        construtorTexto.append("é ");
        construtorTexto.append("incrível!");
        System.out.println(construtorTexto.toString());

        System.out.println("\n=== Conversão número ↔ String ===");
        int numero = 42;
        String textoNumero = String.valueOf(numero);
        System.out.println("int → String: " + textoNumero + " (tipo String)");

        String textoValor = "123";
        int valorInteiro = Integer.parseInt(textoValor);
        System.out.println("String → int: " + valorInteiro + " (tipo int, somando 1 = " + (valorInteiro + 1) + ")");
    }
}
