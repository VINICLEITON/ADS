// Classe base (abstração e encapsulamento)
public class Animal {

    private String nome;       // atributo privado (encapsulamento)
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

    // Método que será sobrescrito (polimorfismo)
    public String falar() {
        return "...";
    }

    @Override
    public String toString() {
        return especie + ": " + nome;
    }
}
