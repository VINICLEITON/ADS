package CodigosDeAulas.RepeticaoEx;

import java.util.Scanner;

public class AlturaSexo_While {
public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);

final int TOTAL_PESSOAS = 5;

double maiorAltura = 0;
double menorAltura = 999;
double somaAlturasMulheres = 0;
double mediaAlturaMulheres = 0;

int numeroMulheres = 0;
int numeroHomens = 0;
int contador = 0;

while (contador < TOTAL_PESSOAS) {
    System.out.print("Digite a altura da pessoa " + (contador + 1) + ": ");
    double altura = leitor.nextDouble();

    System.out.print("Digite 1 para feminino e 2 para masculino: ");
    int sexo = leitor.nextInt();

    if (altura > maiorAltura) {
        maiorAltura = altura;
    }

    if (altura < menorAltura) {
        menorAltura = altura;
    }

    if (sexo == 1) {
        somaAlturasMulheres = somaAlturasMulheres + altura;
        numeroMulheres++;
    }

    if (sexo == 2) {
        numeroHomens++;
    }

    contador++;
}

if (numeroMulheres > 0) {
    mediaAlturaMulheres = somaAlturasMulheres / numeroMulheres;
}

System.out.println("Maior altura do grupo: " + maiorAltura);
System.out.println("Menor altura do grupo: " + menorAltura);
System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres);
System.out.println("Número de homens: " + numeroHomens);

leitor.close();
}
}
