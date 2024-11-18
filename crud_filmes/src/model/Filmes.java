/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author yasmi
 */
public class Filmes {
    private int codigo;
    private String titulo;
    private String genero;
    private String produtora;
    private String dataCompra;

    public Filmes() {
        this(0,"","","","");
    }

    public Filmes(int codigo, String titulo, String genero, String produtora, String dataCompra) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.produtora = produtora;
        this.dataCompra = dataCompra;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }
    
    Conexao con = new Conexao();
    
    public void cadastrar(){           
      String sql= "Insert into filmes(codigo,titulo,genero,produtora,dt_compra)values "+
                "("+this.getCodigo()+",'"+ this.getTitulo()+"','"+this.getGenero()+"','"+this.getProdutora()+"','"+ this.getDataCompra()+"' )";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");     
    }

        
    public ResultSet consultar(){
        ResultSet tabela;
        tabela = null;
        
        String sql= "Select * from filmes";
        tabela = con.RetornarResultset(sql);
     return tabela;   
    }
     
    public void excluir(){
        String sql;
        sql= "Delete from filmes where codigo="+ getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }
    public void alterar(){
        String sql;
        sql="Update filmes set titulo='"+ getTitulo()+"',genero='"+getGenero()+"',produtora='"+getProdutora()+"',dt_compra='"+getDataCompra()+"' where codigo="+ getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso...");
        
    }
    
     public ResultSet consultarCampoEspecifico(){
        ResultSet tabela;
        tabela = null;
    
        try{
          String sql="Select * from filmes where nome like '"+ getTitulo()+"%'";
          tabela= con.RetornarResultset(sql);                  
       
           }
           catch(Exception sqle){
                JOptionPane.showMessageDialog(null,"Atenção..."+sqle.getMessage());
           }
        return tabela;    
    }


}
