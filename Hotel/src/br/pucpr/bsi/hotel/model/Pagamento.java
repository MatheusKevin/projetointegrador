package br.pucpr.bsi.hotel.model;

import java.util.Date;

public class Pagamento {
    private Integer id;
    private Date data;
    private Integer parcelas;
    private Double valor;
    private TipoPagamento tipoPagamento;
    private Pedido pedido;

    public Pagamento(TipoPagamento tipoPagamento, Pedido pedido) {
        this.tipoPagamento = tipoPagamento;
        this.pedido = pedido;
        this.tipoPagamento.addPagamento(this);
        this.pedido.addPagamento(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    
}
