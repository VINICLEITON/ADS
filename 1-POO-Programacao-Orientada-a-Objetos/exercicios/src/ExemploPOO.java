import java.util.ArrayList;
import java.util.List;

// Exemplo: Conceitos básicos de POO em Java
public class ExemploPOO {

    public static void main(String[] args) {
        // Criando objetos (herança e polimorfismo)
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Rex"));
        animais.add(new Gato("Mimi"));

        for (Animal animal : animais) {
            System.out.println(animal + " diz: " + animal.falar());
        }
    }
}
