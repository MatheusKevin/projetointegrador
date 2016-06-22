package br.pucpr.bsi.hotel.db;

import java.sql.Connection;

public class Conexao {
    public static Conexao instance = new Conexao();
    
    public Conexao() {
    }

    public static Conexao getInstance() {
        return instance;
    }
    
    public Connection obterConexao(){
        return null;
    }
    
    public void fecharConexao(){
        
    }
    
    public void confirmar(){
        //commit
    }
    
    public void abortar(){
        //rollback
    }
}
