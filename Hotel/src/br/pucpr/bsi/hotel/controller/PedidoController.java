package br.pucpr.bsi.hotel.controller;

import br.pucpr.bsi.hotel.model.Pedido;
import br.pucpr.bsi.hotel.model.Pessoa;
import java.util.List;

public class PedidoController {
    private static PedidoController instance = new PedidoController();

    public PedidoController() {
    }
    
    public PedidoController getInstance() {
        return instance;
    }
    
    public void inserir(Pedido pedido){        
    }
    
    public void atualizar(Pedido pedido){        
    }
    
    public void exluir(Pedido pedido){
    }
    
    public Pedido obterPorId(int id){
        return null;
    }
    
    public List<Pedido> obterPorPessoa(Pessoa pessoa){
        return null;
    }
    
    public List<Pedido> obterTodos(){
        return null;
    }
    
    private void validarPedido(Pedido pedido){
        //está retornando void pq em caso de erro será lançado excessao
    }
}
