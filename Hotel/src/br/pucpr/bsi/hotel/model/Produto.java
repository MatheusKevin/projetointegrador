package br.pucpr.bsi.hotel.model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private Integer id;
    private String nome;
    private String descricao;
    private List<Preco> precos;
    private List<ItemProduto> itemProdutos;

    public Produto() {
        this.precos = new ArrayList<>();
        this.itemProdutos = new ArrayList<>();
    }
    
    public void addPreco(Preco preco){
        this.precos.add(preco);
    }
    
    public void addItemProduto(ItemProduto item){
        this.itemProdutos.add(item);
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Preco> getPrecos() {
        return precos;
    }

    public List<ItemProduto> getItemProdutos() {
        return itemProdutos;
    }
    
}
