package br.pucpr.bsi.hotel.model;

import java.util.ArrayList;
import java.util.List;

public class TipoPagamento {
    private Integer id;
    private String nome;
    private List<Pagamento> pagamentos;

    public TipoPagamento() {
        this.pagamentos = new ArrayList<>();
    }
    
    public void addPagamento(Pagamento pagamento){
        this.pagamentos.add(pagamento);
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

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }
    
}
