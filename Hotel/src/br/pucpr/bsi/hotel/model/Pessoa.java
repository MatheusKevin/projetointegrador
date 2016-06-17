package br.pucpr.bsi.hotel.model;

import java.util.List;

public abstract class Pessoa {
    private Integer id;
    private String foneRes;
    private String foneCel;
    private String email;
    private String usuario;
    private String senha;
    private List<Endereco> endereco;
    private List<Veiculo> veiculos;
    private List<Pedido> pedidos;
    private List<Reserva> reserva;
    private List<Avaliacao> avaliacoes;
}
