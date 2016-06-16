package br.pucpr.bsi.hotel.model;

import java.util.ArrayList;
import java.util.List;

public class Quarto {
    private Integer numero;
    private Integer andar;
    private Categoria categoria;
    private Status status;
    private List<Diaria> diarias;
    private List<Reserva> reservas;

    public Quarto(Categoria categoria, Status status) {
        this.diarias = new ArrayList<>();
        this.reservas = new ArrayList<>();
        this.categoria = categoria;
        this.status = status;
    }
    
    public void addDiaria(Diaria diaria){
        this.diarias.add(diaria);
    }
    
    public void addReserva(Reserva reserva){
        this.reservas.add(reserva);
    }
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getAndar() {
        return andar;
    }

    public void setAndar(Integer andar) {
        this.andar = andar;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Diaria> getDiarias() {
        return diarias;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
    
}
