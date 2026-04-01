package CodigosDeAulas.RepeticaoEx;

public class ExemploFlag {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Variáveis
        int cont = 0, idade = 0, soma = 0;
        double media = 0.0;

        // Mensagem de entrada
        System.out.println("Informe a Idade (para ENCERRAR, digite -1):");

        // Loop com flag
        // o flag pode ser while (idade > = 0) ou while (true) ou outro como abaixo
        while (idade != -1) {
            idade = entrada.nextInt();

            // Verificar a flag, validar o flag e garantir que ele interrompa e não entre
            // para os calculos
            // O break garante a validação e o resultado correto, caso contrário a ultima
            // idade entrara nos calculos da soma e do cont
            if (idade == -1) {
                break; // Encerra o laço
            }

            // Atualizar soma e contador
            soma += idade; // soma+=idade é o mesmo que -> soma = soma + idade;
            cont++; // é o mesmo que cont = cont + 1;
        }

        // Verificar se houve entradas válidas
        if (cont > 0) {
            media = (double) soma / cont; // Cálculo da média
            System.out.println("O total de idades digitadas foi: " + cont);
            System.out.println("A média das idades é: " + media);
        } else {
            System.out.println("Nenhuma idade válida foi informada.");
        }

        // Fechar o scanner
        entrada.close();

    }

}
