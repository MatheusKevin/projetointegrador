package br.pucpr.bsi.hotel.model;

public class Veiculo {
    private String placa;
    private String modelo;
    private Pessoa proprietario;

    public Veiculo(Pessoa proprietario) {
        this.proprietario = proprietario;
        this.proprietario.addVeiculos(this);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }
    
}
