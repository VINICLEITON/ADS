// Exemplo: Olá Mundo em Java com conceitos básicos de POO

public class HelloWorld {

    // Atributo da classe
    private String nome;

    // Construtor
    public HelloWorld(String nome) {
        this.nome = nome;
    }

    // Método getter (encapsulamento)
    public String getNome() {
        return nome;
    }

    // Método que exibe uma saudação
    public void saudar() {
        System.out.println("Olá, " + nome + "! Bem-vindo à POO com Java.");
    }

    public static void main(String[] args) {
        // Criando um objeto da classe HelloWorld
        HelloWorld obj = new HelloWorld("ADS");
        obj.saudar();
        System.out.println("Curso: " + obj.getNome());
    }
}
