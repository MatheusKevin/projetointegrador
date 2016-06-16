package br.pucpr.bsi.hotel.model;

import java.util.Date;

public class Preco {
    private Date data;
    private Double valor;
    private Marca marca;
    private Produto produto;

    public Preco(Marca marca, Produto produto) {
        this.marca = marca;
        this.produto = produto;
        this.marca.addPreco(this);
        this.produto.addPreco(this);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Marca getMarca() {
        return marca;
    }

    public Produto getProduto() {
        return produto;
    }
    
    
}
