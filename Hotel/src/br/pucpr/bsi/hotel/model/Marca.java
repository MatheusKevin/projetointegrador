package br.pucpr.bsi.hotel.model;

import java.util.ArrayList;
import java.util.List;

public class Marca {
    private Integer id;
    private String nome;
    private List<Preco> precos;

    public Marca() {
        this.precos = new ArrayList<>();
    }
    
    public void addPreco(Preco preco){
        this.precos.add(preco);
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

    public List<Preco> getPrecos() {
        return precos;
    }

}
