package entities;

public class ItemVenda {
    private Long id;
    private Produto produto;
    private int quantidade;
    private double precoAplicado;

    public ItemVenda(Long id, Produto produto, int quantidade) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoAplicado = produto.getPrecoUnitario();
    }

    public double subTotal() {
        return quantidade * precoAplicado;
    }

    public Long getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoAplicado() {
        return precoAplicado;
    }








}
