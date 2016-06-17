package br.pucpr.bsi.hotel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Avaliacao {
    private Integer id;
    private Date data;
    private String comentario;
    private Pessoa pessoa;
    private List<Resposta> respostas;

    public Avaliacao(Pessoa pessoa) {
        this.respostas = new ArrayList<>();
        this.pessoa = pessoa;
        this.pessoa.addAvaliacoes(this);
    }
    
    public void addResposta(Resposta resposta){
        this.respostas.add(resposta);
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

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Resposta> getRespostas() {
        return respostas;
    }
    
}
