package CodigosDeAulas.Exemplos;

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
