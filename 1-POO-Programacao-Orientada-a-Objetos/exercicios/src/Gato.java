// Herança e polimorfismo
public class Gato extends Animal {

    public Gato(String nome) {
        super(nome, "Gato");
    }

    @Override
    public String falar() {  // polimorfismo
        return "Miau!";
    }
}
