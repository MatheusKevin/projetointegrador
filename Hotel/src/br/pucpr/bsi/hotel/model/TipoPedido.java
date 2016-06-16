package br.pucpr.bsi.hotel.model;
    
import java.util.ArrayList;
import java.util.List;

public class TipoPedido {
    private Integer id;
    private String nome;
    private List<Pedido> pedidos;

    public TipoPedido() {
        this.pedidos = new ArrayList<>();
    }
    
    public void addPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
    
}
