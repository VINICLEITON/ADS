package BaseCodigos;
// ============================================================
//  Estruturas de Controle em Java
//  Conceito: permitem que o programa tome DECISÕES e execute
//  blocos de código diferentes dependendo de condições.
// ============================================================

public class EstruturasDeControle {

    public static void main(String[] args) {

        // ===================================================
        //  IF / ELSE IF / ELSE
        //  Estrutura de decisão mais comum em Java.
        //  O bloco dentro de 'if' só executa se a condição for true.
        //  O bloco 'else' executa quando NENHUMA condição anterior foi true.
        // ===================================================
        int nota = 72;

        System.out.println("=== if / else if / else ===");

        if (nota >= 90) {
            // Executa se nota for maior ou igual a 90
            System.out.println("Conceito A – Excelente!");
        } else if (nota >= 70) {
            // Executa se nota estiver entre 70 e 89
            System.out.println("Conceito B – Bom");
        } else if (nota >= 60) {
            // Executa se nota estiver entre 60 e 69
            System.out.println("Conceito C – Regular");
        } else {
            // Executa para qualquer nota abaixo de 60
            System.out.println("Reprovado");
        }

        // ----- Exemplo com boolean -----
        boolean possuiCarteira = true;
        int idadeMotorista = 17;

        // Condições podem ser combinadas com && (E) e || (OU)
        if (possuiCarteira && idadeMotorista >= 18) {
            System.out.println("Pode dirigir.");
        } else {
            System.out.println("Não pode dirigir.");
        }

        // ===================================================
        //  SWITCH
        //  Ideal quando se quer comparar UMA variável com
        //  vários valores possíveis (alternativa ao if/else if).
        //  Funciona com: int, char, String e tipos enum.
        // ===================================================
        int diaDaSemana = 3; // 1 = Segunda, 2 = Terça, ..., 7 = Domingo

        System.out.println("\n=== switch ===");

        switch (diaDaSemana) {
            case 1:
                System.out.println("Segunda-feira");
                break; // 'break' impede a execução cair no próximo case
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
            case 7:
                // Dois cases sem break entre eles compartilham o mesmo bloco
                System.out.println("Fim de semana!");
                break;
            default:
                // Executa se nenhum case corresponder ao valor
                System.out.println("Dia inválido.");
        }

        // ----- Switch com String -----
        String estacao = "inverno";

        System.out.println("\n=== switch com String ===");

        switch (estacao.toLowerCase()) { // toLowerCase() garante comparação sem distinção de maiúsculas
            case "verao":
                System.out.println("Verão: tempo quente ☀️");
                break;
            case "outono":
                System.out.println("Outono: folhas caindo 🍂");
                break;
            case "inverno":
                System.out.println("Inverno: tempo frio ❄️");
                break;
            case "primavera":
                System.out.println("Primavera: flores brotando 🌸");
                break;
            default:
                System.out.println("Estação desconhecida.");
        }
    }
}
