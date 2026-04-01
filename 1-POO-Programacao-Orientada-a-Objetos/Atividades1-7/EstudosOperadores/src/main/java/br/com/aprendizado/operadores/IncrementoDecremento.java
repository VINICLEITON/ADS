package br.com.aprendizado.operadores;

public class IncrementoDecremento {

    public static void main(String[] args) {

        int x1 = 5, y1, z1;

        y1 = ++x1;
        z1 = --x1;

        System.out.println("=== Exemplo Prefixado ===");
        System.out.println("x1 = " + x1);
        System.out.println("y1 = " + y1);
        System.out.println("z1 = " + z1);

        System.out.println();

        int x2 = 5, y2, z2;

        y2 = x2++;
        z2 = x2--;

        System.out.println("=== Exemplo Posfixado ===");
        System.out.println("x2 = " + x2);
        System.out.println("y2 = " + y2);
        System.out.println("z2 = " + z2);
    }
}
