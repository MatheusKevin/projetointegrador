package br.pucpr.bsi.hotel.dao;

import br.pucpr.bsi.hotel.model.Pedido;
import br.pucpr.bsi.hotel.model.Pessoa;
import java.sql.ResultSet;
import java.util.List;

public class PedidoDAO {
    private static PedidoDAO instance = new PedidoDAO();

    public PedidoDAO() {
    }
    
    public static PedidoDAO getInstance() {
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
    
    private Pedido popularObjeto(ResultSet rs){
        return null;
    }
}
