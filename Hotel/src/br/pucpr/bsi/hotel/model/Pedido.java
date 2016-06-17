package br.pucpr.bsi.hotel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Integer id;
    private Date data;
    private Double total;
    private String notaFiscal;
    private List<Item> itens;
    private TipoPedido tipoPedido;
    private Pessoa cliente;
    private Pessoa fornecedor;
    private List<Pagamento> pagamentos;

    public Pedido(Pessoa cliente, Pessoa fornecedor, Item item, Pagamento pagamento) {
        this.itens = new ArrayList<>();
        this.pagamentos = new ArrayList<>();
        this.itens.add(item);
        this.pagamentos.add(pagamento);
        this.cliente = cliente;
        this.fornecedor = fornecedor;
        this.cliente.addPedidos(this);
        this.fornecedor.addPedidos(this);
    }
    
    public void addItem(Item item){
        this.itens.add(item);
    }
    
    public void addPagamento(Pagamento pagamento){
        this.pagamentos.add(pagamento);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public TipoPedido getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(TipoPedido tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Pessoa getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Pessoa fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Item> getItens() {
        return itens;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }
    
}
