package BaseCodigos;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {

    private String nome;
    private String especie;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setNome(String novoNome) {
        if (novoNome != null && !novoNome.isEmpty()) {
            this.nome = novoNome;
        } else {
            System.out.println("Nome inválido! Não foi alterado.");
        }
    }

    public abstract String falar();

    @Override
    public String toString() {
        return especie + ": " + nome;
    }
}

interface Adestravél {
    String executarComando(String comando);
}

class Cachorro extends Animal implements Adestravél {

    public Cachorro(String nome) {
        super(nome, "Cachorro");
    }

    @Override
    public String falar() {
        return "Au au!";
    }

    @Override
    public String executarComando(String comando) {
        return getNome() + " executa: " + comando + " 🐾";
    }
}

class Gato extends Animal {

    private boolean ehDomestico;

    public Gato(String nome, boolean ehDomestico) {
        super(nome, "Gato");
        this.ehDomestico = ehDomestico;
    }

    @Override
    public String falar() {
        return "Miau!";
    }

    public boolean isEhDomestico() {
        return ehDomestico;
    }
}

public class ProgramacaoOrientadaObjetos {

    public static void main(String[] args) {

        System.out.println("=== Criando Objetos ===");
        Cachorro rex = new Cachorro("Rex");
        Gato mimi = new Gato("Mimi", true);

        System.out.println("Objeto criado: " + rex);
        System.out.println("Objeto criado: " + mimi);

        System.out.println("\n=== Encapsulamento ===");
        System.out.println("Nome antes: " + rex.getNome());
        rex.setNome("Bolt");
        System.out.println("Nome depois: " + rex.getNome());
        rex.setNome("");
        System.out.println("Nome atual: " + rex.getNome());

        System.out.println("\n=== Polimorfismo ===");
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Rex"));
        animais.add(new Gato("Mimi", false));
        animais.add(new Cachorro("Totó"));

        for (Animal animal : animais) {
            System.out.println(animal + " diz: " + animal.falar());
        }

        System.out.println("\n=== Interface (Adestravél) ===");
        Adestravél caoAdestrado = new Cachorro("Lassie");
        System.out.println(caoAdestrado.executarComando("senta"));
        System.out.println(caoAdestrado.executarComando("deita"));

        System.out.println("\n=== instanceof ===");
        for (Animal animal : animais) {
            if (animal instanceof Cachorro) {
                Cachorro cachorro = (Cachorro) animal;
                System.out.println(cachorro.getNome() + " é um Cachorro → " + cachorro.executarComando("busca"));
            } else if (animal instanceof Gato) {
                Gato gato = (Gato) animal;
                System.out.println(gato.getNome() + " é um Gato doméstico? " + gato.isEhDomestico());
            }
        }

        System.out.println("\n=== Método static (pertence à classe) ===");
        System.out.println("Total de animais na lista: " + contarAnimais(animais));
    }

    static int contarAnimais(List<Animal> lista) {
        return lista.size();
    }
}
