package entities;

public class Produto {
    public String nome;
    public double precoUnitario;
    public int quantidadeEstoque;

    public Produto(String nome, double precoUnitario, int quantidadeEstoque) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Produto(String nome, double precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    public double valorTotalEmEstoque() {
        return precoUnitario * quantidadeEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        if(quantidade > 0) {
            this.quantidadeEstoque += quantidade;
        } else {
            System.out.println("Quantidade inválida!");
        }

    }

    public void removerEstoque(int quantidade) {

        if(quantidade <= 0) {
            System.out.println("Quantidade inválida para remoção!");
        } else if(quantidade > quantidadeEstoque) {
            System.out.println("Estoque insuficiente!");
        } else {
            this.quantidadeEstoque -= quantidade;
        }

    }
    @Override
    public String toString() {
        return nome
                + ", R$ "
                + String.format("%.2f", precoUnitario)
                +", "
                + quantidadeEstoque
                + ", Total: R$ "
                + String.format("%.2f", valorTotalEmEstoque());

    }


}
