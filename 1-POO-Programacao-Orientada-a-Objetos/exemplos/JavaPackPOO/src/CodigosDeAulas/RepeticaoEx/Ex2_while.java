package CodigosDeAulas.RepeticaoEx;

import java.util.Scanner;

public class Ex2_while {

public static void main(String args[]) {
float soma, numero, media;
int contador;

Scanner leitor = new Scanner(System.in);
soma = 0;
contador = 0;

while (contador < 8) {
numero = leitor.nextFloat();
soma += numero;
contador++;
}

media = soma / contador;
System.out.println("Média = " + media);
}
}
