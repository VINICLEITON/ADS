// Herança e polimorfismo
public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome, "Cachorro");
    }

    @Override
    public String falar() {  // polimorfismo
        return "Au au!";
    }
}
