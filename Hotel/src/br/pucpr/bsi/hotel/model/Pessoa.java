package br.pucpr.bsi.hotel.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
    private Integer id;
    private String foneRes;
    private String foneCel;
    private String email;
    private String usuario;
    private String senha;
    private List<Endereco> enderecos;
    private List<Veiculo> veiculos;
    private List<Pedido> pedidos;
    private List<Reserva> reservas;
    private List<Avaliacao> avaliacoes;

    public Pessoa() {
        this.enderecos = new ArrayList<>();
        this.veiculos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.reservas = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }
    
    public void addEndereco(Endereco endereco){
        this.enderecos.add(endereco);
    }
    
    public void addVeiculos(Veiculo veiculo){
        this.veiculos.add(veiculo);
    }
    
    public void addPedidos(Pedido pedido){
        this.pedidos.add(pedido);
    }
    
    public void addReserva(Reserva reserva){
        this.reservas.add(reserva);
    }
    
    public void addAvaliacoes(Avaliacao avaliacao){
        this.avaliacoes.add(avaliacao);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFoneRes() {
        return foneRes;
    }

    public void setFoneRes(String foneRes) {
        this.foneRes = foneRes;
    }

    public String getFoneCel() {
        return foneCel;
    }

    public void setFoneCel(String foneCel) {
        this.foneCel = foneCel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }
    
}
