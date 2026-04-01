package atividades;

public class Produto {

    String nome;
    double preco;
    double desconto;

    double calcularPrecoComDesconto() {
        return preco - (preco * desconto / 100);
    }
}
