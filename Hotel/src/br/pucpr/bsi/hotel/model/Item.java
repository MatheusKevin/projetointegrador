package br.pucpr.bsi.hotel.model;

public abstract class Item {
    private Integer id;
    private Double valor;
    private Pedido pedido;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
        this.pedido.addItem(this);
    }
    
    
}
