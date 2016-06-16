package br.pucpr.bsi.hotel.model;

import java.util.Date;

public class Diaria {
    private Date data;
    private Double valor;
    private Plano plano;
    private Quarto quarto;

    public Diaria(Plano plano, Quarto quarto) {
        this.plano = plano;
        this.quarto = quarto;
        this.plano.addDiaria(this);
        this.quarto.addDiaria(this);
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

    public Plano getPlano() {
        return plano;
    }

    public Quarto getQuarto() {
        return quarto;
    }

}