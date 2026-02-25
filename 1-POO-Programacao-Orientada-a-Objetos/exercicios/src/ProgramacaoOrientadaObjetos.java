// ============================================================
//  Programação Orientada a Objetos (POO) em Java
//
//  Este arquivo reúne os pilares fundamentais da POO:
//    1. Classe e Objeto
//    2. Encapsulamento
//    3. Construtor
//    4. Herança
//    5. Polimorfismo
//    6. Classe Abstrata
//    7. Interface
//
//  Em Java, um arquivo pode conter várias classes,
//  mas apenas UMA pode ser public e deve ter o mesmo
//  nome do arquivo.  As demais usam visibilidade padrão
//  (sem modificador) e ficam visíveis dentro do mesmo pacote.
// ============================================================

import java.util.ArrayList;
import java.util.List;


// ============================================================
//  1. CLASSE ABSTRATA
//  Uma classe abstrata NÃO pode ser instanciada diretamente;
//  serve como "molde" para outras classes.
//  Métodos marcados com 'abstract' OBRIGAM as subclasses
//  a fornecer uma implementação.
// ============================================================
abstract class Animal {

    // --- Encapsulamento: atributos privados só acessíveis via métodos ---
    private String nome;
    private String especie;

    // --- Construtor: inicializa o objeto com valores obrigatórios ---
    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    // --- Getters: única forma de ler os atributos de fora da classe ---
    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    // --- Setter com validação: controla o que pode ser gravado ---
    public void setNome(String novoNome) {
        if (novoNome != null && !novoNome.isEmpty()) {
            this.nome = novoNome;
        } else {
            System.out.println("Nome inválido! Não foi alterado.");
        }
    }

    // --- Método abstrato: cada subclasse DEVE implementar este método ---
    public abstract String falar();

    // --- @Override de Object.toString(): define a representação textual ---
    @Override
    public String toString() {
        return especie + ": " + nome;
    }
}


// ============================================================
//  2. INTERFACE
//  Define um "contrato": qualquer classe que implementar
//  Adestravél DEVE fornecer o método executarComando().
//  Interfaces permitem polimorfismo entre classes sem herança direta.
// ============================================================
interface Adestravél {
    // Método de interface — implicitamente public e abstract
    String executarComando(String comando);
}


// ============================================================
//  3. HERANÇA + POLIMORFISMO + INTERFACE
//  Cachorro HERDA de Animal e IMPLEMENTA Adestravél.
//  'extends' = herança de classe
//  'implements' = implementação de interface
// ============================================================
class Cachorro extends Animal implements Adestravél {

    public Cachorro(String nome) {
        // 'super(...)' chama o construtor da classe pai (Animal)
        super(nome, "Cachorro");
    }

    // @Override indica que este método substitui o da superclasse
    @Override
    public String falar() {
        return "Au au!";
    }

    // Implementação exigida pela interface Adestravél
    @Override
    public String executarComando(String comando) {
        return getNome() + " executa: " + comando + " 🐾";
    }
}


// ============================================================
//  4. HERANÇA + POLIMORFISMO (sem interface desta vez)
// ============================================================
class Gato extends Animal {

    // Atributo exclusivo da subclasse
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


// ============================================================
//  5. CLASSE PRINCIPAL — demonstra todos os conceitos acima
// ============================================================
public class ProgramacaoOrientadaObjetos {

    public static void main(String[] args) {

        // ---- 5.1 Criando objetos (instanciação) ----
        System.out.println("=== Criando Objetos ===");
        Cachorro rex = new Cachorro("Rex");
        Gato mimi = new Gato("Mimi", true);

        System.out.println("Objeto criado: " + rex);   // chama toString()
        System.out.println("Objeto criado: " + mimi);

        // ---- 5.2 Encapsulamento: getter e setter ----
        System.out.println("\n=== Encapsulamento ===");
        System.out.println("Nome antes: " + rex.getNome());
        rex.setNome("Bolt");                            // setter válido
        System.out.println("Nome depois: " + rex.getNome());
        rex.setNome("");                                // setter com dado inválido
        System.out.println("Nome atual: " + rex.getNome()); // nome não muda

        // ---- 5.3 Polimorfismo com lista de Animal ----
        // Uma lista do tipo Animal pode guardar qualquer subclasse.
        // Ao chamar falar(), Java escolhe a versão CORRETA em tempo de execução.
        System.out.println("\n=== Polimorfismo ===");
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Rex"));
        animais.add(new Gato("Mimi", false));
        animais.add(new Cachorro("Totó"));

        for (Animal a : animais) {
            // Mesmo método, comportamentos diferentes — isso é polimorfismo
            System.out.println(a + " diz: " + a.falar());
        }

        // ---- 5.4 Interface ----
        System.out.println("\n=== Interface (Adestravél) ===");
        Adestravél caoAdestrado = new Cachorro("Lassie"); // referência pelo tipo da interface
        System.out.println(caoAdestrado.executarComando("senta"));
        System.out.println(caoAdestrado.executarComando("deita"));

        // ---- 5.5 Verificação de tipo com instanceof ----
        System.out.println("\n=== instanceof ===");
        for (Animal a : animais) {
            if (a instanceof Cachorro) {
                Cachorro c = (Cachorro) a; // cast seguro após verificação
                System.out.println(c.getNome() + " é um Cachorro → " + c.executarComando("busca"));
            } else if (a instanceof Gato) {
                Gato g = (Gato) a;
                System.out.println(g.getNome() + " é um Gato doméstico? " + g.isEhDomestico());
            }
        }

        // ---- 5.6 Atributos e métodos de classe (static) ----
        // 'static' significa que pertence à CLASSE, não a um objeto específico
        System.out.println("\n=== Método static (pertence à classe) ===");
        System.out.println("Total de animais na lista: " + contarAnimais(animais));
    }

    // Método estático da própria classe principal
    static int contarAnimais(List<Animal> lista) {
        return lista.size();
    }
}
