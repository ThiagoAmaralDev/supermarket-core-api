package entities;

public class Produto {
    private String nome;
    private double precoUnitario;
    private int quantidadeEstoque;

    public Produto(String nome, double precoUnitario, int quantidadeEstoque) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Produto(String nome, double precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if(precoUnitario > 0) {
            this.precoUnitario = precoUnitario;
        } else {
            System.out.println("Preço inválido! O valor deve ser maior que zero.");
        }

    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
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
