package br.pucpr.bsi.hotel.model;

import java.util.ArrayList;
import java.util.List;

public class Pergunta {
    private Integer numero;
    private String Texto;
    private List<Resposta> respostas;

    public Pergunta() {
        this.respostas = new ArrayList<>();
    }
    
    public void addResposta(Resposta resposta){
        this.respostas.add(resposta);
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String Texto) {
        this.Texto = Texto;
    }

    public List<Resposta> getRespostas() {
        return respostas;
    }
    
}
