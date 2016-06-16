package br.pucpr.bsi.hotel.model;

import java.util.ArrayList;
import java.util.List;

public class Plano {
    private Integer id;
    private String nome;
    private String descricao;
    private List<Diaria> diarias;

    public Plano() {
        this.diarias = new ArrayList<>();
    }

    public void addDiaria(Diaria diaria){
        this.diarias.add(diaria);
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
    
    public List<Diaria> getDiarias() {
        return diarias;
    }
}
