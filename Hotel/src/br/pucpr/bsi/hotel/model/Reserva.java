package br.pucpr.bsi.hotel.model;

import java.util.Date;

public class Reserva extends Item{
    private Date dataEntrada;
    private Date dataSaida;
    private Pessoa hospede;
    private Quarto quarto;
    
    public Reserva(Pedido pedido, Quarto quarto, Pessoa hospede) {
        super(pedido);
        this.quarto = quarto;
        this.hospede =  hospede;
        this.quarto.addReserva(this);
        this.hospede.addReserva(this);
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Pessoa getHospede() {
        return hospede;
    }

    public void setHospede(Pessoa hospede) {
        this.hospede = hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
    
}
