package BaseCodigos;

/**
 *
 * @author VINICIUS.BORGES
 */
public class EstruturasDeControle {

    public static void main(String[] args) {

        int nota = 72;

        System.out.println("=== if / else if / else ===");

        if (nota >= 90) {
            System.out.println("Conceito A – Excelente!");
        } else if (nota >= 70) {
            System.out.println("Conceito B – Bom");
        } else if (nota >= 60) {
            System.out.println("Conceito C – Regular");
        } else {
            System.out.println("Reprovado");
        }

        boolean possuiCarteira = true;
        int idadeMotorista = 17;

        if (possuiCarteira && idadeMotorista >= 18) {
            System.out.println("Pode dirigir.");
        } else {
            System.out.println("Não pode dirigir.");
        }

        int diaDaSemana = 3;

        System.out.println("\n=== switch ===");

        switch (diaDaSemana) {
            case 1:
                System.out.println("Segunda-feira");
                break;
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
                System.out.println("Fim de semana!");
                break;
            default:
                System.out.println("Dia inválido.");
        }

        String estacao = "inverno";

        System.out.println("\n=== switch com String ===");

        switch (estacao.toLowerCase()) {
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
