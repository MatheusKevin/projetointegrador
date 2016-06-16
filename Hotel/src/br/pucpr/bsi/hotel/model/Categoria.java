package br.pucpr.bsi.hotel.model;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private Integer id;
    private String nome;
    private Integer capacidade;
    private String descricao;
    private List<Quarto> quartos;

    public Categoria() {
        this.quartos = new ArrayList<>();
    }
    
    public void addQuarto(Quarto quarto){
        this.quartos.add(quarto);
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

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }    
    
}
