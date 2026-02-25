// ============================================================
//  Strings em Java
//  Conceito: String é uma CLASSE (não primitivo) que representa
//  uma sequência de caracteres. Strings em Java são IMUTÁVEIS:
//  toda operação que "modifica" uma String na verdade cria
//  uma nova String com o resultado.
// ============================================================

public class Strings {

    public static void main(String[] args) {

        // ===================================================
        //  CRIAÇÃO DE STRINGS
        // ===================================================
        String saudacao = "Olá, Mundo!";
        String curso = "Análise e Desenvolvimento de Sistemas";

        System.out.println("=== Strings básicas ===");
        System.out.println(saudacao);
        System.out.println(curso);

        // ===================================================
        //  COMPRIMENTO DA STRING
        //  .length() retorna o número de caracteres
        // ===================================================
        System.out.println("\n=== length() ===");
        System.out.println("\"" + saudacao + "\" tem " + saudacao.length() + " caracteres");

        // ===================================================
        //  ACESSO A CARACTERES
        //  .charAt(índice) retorna o char na posição informada
        //  (índice começa em 0, igual ao array)
        // ===================================================
        System.out.println("\n=== charAt() ===");
        System.out.println("Primeiro caractere: " + saudacao.charAt(0));     // 'O'
        System.out.println("Último caractere:   " + saudacao.charAt(saudacao.length() - 1)); // '!'

        // ===================================================
        //  CONVERSÃO DE MAIÚSCULAS E MINÚSCULAS
        // ===================================================
        System.out.println("\n=== toUpperCase() / toLowerCase() ===");
        System.out.println(saudacao.toUpperCase()); // tudo maiúsculo
        System.out.println(saudacao.toLowerCase()); // tudo minúsculo

        // ===================================================
        //  VERIFICAÇÕES
        //  Vários métodos retornam boolean (true/false)
        // ===================================================
        String linguagem = "Java";

        System.out.println("\n=== Verificações ===");
        System.out.println("Contém \"Java\"? " + saudacao.contains("Mundo"));    // true
        System.out.println("Começa com \"Olá\"? " + saudacao.startsWith("Olá")); // true
        System.out.println("Termina com \"!\"? " + saudacao.endsWith("!"));      // true
        System.out.println("Está vazia? " + linguagem.isEmpty());                // false
        System.out.println("Índice de \"Mundo\": " + saudacao.indexOf("Mundo")); // 5

        // ===================================================
        //  COMPARAÇÃO DE STRINGS
        //  NUNCA use == para comparar o conteúdo de Strings.
        //  Use .equals() (sensível a maiúsculas) ou
        //  .equalsIgnoreCase() (ignora maiúsculas/minúsculas).
        //  O operador == compara REFERÊNCIA de memória, não conteúdo!
        // ===================================================
        String a = "java";
        String b = "Java";

        System.out.println("\n=== Comparação de Strings ===");
        System.out.println("equals:           \"" + a + "\".equals(\"" + b + "\") → " + a.equals(b));                      // false
        System.out.println("equalsIgnoreCase: \"" + a + "\".equalsIgnoreCase(\"" + b + "\") → " + a.equalsIgnoreCase(b));  // true

        // ===================================================
        //  EXTRAÇÃO DE PARTES
        //  .substring(inicio) extrai do índice 'inicio' até o fim
        //  .substring(inicio, fim) extrai de 'inicio' até 'fim' (exclusive)
        // ===================================================
        System.out.println("\n=== substring() ===");
        String texto = "Programação em Java";
        System.out.println("substring(15):     \"" + texto.substring(15) + "\""); // "Java"
        System.out.println("substring(0, 11):  \"" + texto.substring(0, 11) + "\""); // "Programação"

        // ===================================================
        //  SUBSTITUIÇÃO
        //  .replace(antigo, novo) troca todas as ocorrências
        // ===================================================
        System.out.println("\n=== replace() ===");
        String original = "O gato comeu o peixe do gato";
        String substituido = original.replace("gato", "cachorro");
        System.out.println("Original:    " + original);
        System.out.println("Substituído: " + substituido);

        // ===================================================
        //  REMOÇÃO DE ESPAÇOS
        //  .trim() remove espaços em branco do início e do fim
        // ===================================================
        System.out.println("\n=== trim() ===");
        String comEspacos = "   Olá, Java!   ";
        System.out.println("Com espaços:  |" + comEspacos + "|");
        System.out.println("Sem espaços:  |" + comEspacos.trim() + "|");

        // ===================================================
        //  DIVISÃO DE STRINGS
        //  .split(separador) divide a String e retorna um array
        // ===================================================
        System.out.println("\n=== split() ===");
        String csv = "Ana,Bruno,Carlos,Diana";
        String[] nomes = csv.split(","); // divide onde houver vírgula
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }

        // ===================================================
        //  CONCATENAÇÃO COM StringBuilder
        //  Quando precisar montar uma String em loop, use StringBuilder.
        //  É muito mais eficiente do que usar + repetidamente,
        //  pois evita criar inúmeros objetos String intermediários.
        // ===================================================
        System.out.println("\n=== StringBuilder ===");
        StringBuilder sb = new StringBuilder();
        sb.append("Java ");    // adiciona texto ao final
        sb.append("é ");
        sb.append("incrível!");
        System.out.println(sb.toString()); // converte para String

        // ===================================================
        //  CONVERSÃO: número ↔ String
        // ===================================================
        System.out.println("\n=== Conversão número ↔ String ===");
        int numero = 42;
        String strNumero = String.valueOf(numero); // int → String
        System.out.println("int → String: " + strNumero + " (tipo String)");

        String strValor = "123";
        int intValor = Integer.parseInt(strValor); // String → int
        System.out.println("String → int: " + intValor + " (tipo int, somando 1 = " + (intValor + 1) + ")");
    }
}
