/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Paciente {
    private int codigoPaciente;
    private String nomePaciente;
    private String endereco;
    private String complemento;
    private String rg;
    private String cpf;
    private String data;
    
    private Conexao con = new Conexao();

    public Paciente() {
        this(0,"","","","","","");
    }

    public Paciente(int codigoPaciente, String nomePaciente, String endereco, String complemento, String rg, String cpf, String data) {
        this.codigoPaciente = codigoPaciente;
        this.nomePaciente = nomePaciente;
        this.endereco = endereco;
        this.complemento = complemento;
        this.rg = rg;
        this.cpf = cpf;
        this.data = data;
    }

    public Conexao getCon() {
        return con;
    }

    public void setCon(Conexao con) {
        this.con = con;
    }

    public int getCodigoPaciente() {
        return codigoPaciente;
    }

    public void setCodigoPaciente(int codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
        public void cadastrarUsuario(){           
      String sql= "Insert into paciente(codigo,nome,endereco,complemento,rg,cpf,dataN)values "+
                "("+ this.getCodigoPaciente()+" ,'"+ this.getNomePaciente()+"','"+this.getEndereco()+"','"+this.getComplemento()+"','"+ this.getRg()+"','"+ this.getCpf() +"','"+ this.getData() +"')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");     
    }

        
     public ResultSet consultar(){
        ResultSet tabela;
        tabela = null;
        
        String sql= "Select * from paciente";
        tabela = con.RetornarResultset(sql);
     return tabela;   
    }
     
      public void excluir(){
        String sql;
        sql= "Delete from paciente where codigo="+ getCodigoPaciente();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }
    public void alterar(){
        String sql;
        sql="Update paciente set nome='"+ getNomePaciente()+"',endereco='"+getEndereco()+"',complemento='"+getComplemento()+"', rg='"+getRg()+"', cpf= '"+getCpf()+
                "', dataN='"+getData()+ "'where codigo="+ getCodigoPaciente();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso...");
        
    }
    
    //código classe usuário 
//busca de campo especifico
 public ResultSet consultarCampoEspecifico(){
        ResultSet tabela;
        tabela = null;
    
        try{
          String sql="Select * from paciente where nome like '"+ getNomePaciente()+"%'";
          tabela= con.RetornarResultset(sql);                  
       
           }
           catch(Exception sqle){
                JOptionPane.showMessageDialog(null,"Atenção..."+sqle.getMessage());
           }
        return tabela;    
    }
}
 


