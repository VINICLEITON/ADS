package atividades;

/**
 *
 * @author VINICIUS.BORGES
 */
public class Produto {

    String nome;
    double preco;
    double desconto;

    double calcularPrecoFinal() {
        return preco - (preco * desconto / 100);
    }
}
