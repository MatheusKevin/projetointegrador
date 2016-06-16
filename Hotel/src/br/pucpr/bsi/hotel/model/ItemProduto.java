package br.pucpr.bsi.hotel.model;

public class ItemProduto extends Item{
    private Integer quantidade;
    private Produto produto;
    
    public ItemProduto(Pedido pedido, Produto produto) {
        super(pedido);
        this.produto = produto;
        this.produto.addItemProduto(this);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
}
