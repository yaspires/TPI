/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import control.Conexao;
import java.sql.ResultSet;

/**
 *
 * @author fatec-dsm2
 */
public class Clinica {
    private String login;
    private String senha;

    public Clinica() {
        this("","");
    }

    public Clinica(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    Conexao con = new Conexao();
    
    //método para login
  public ResultSet logar() {
        ResultSet tabela;
        tabela = null;
        
         String sql = "select * from login where login= '" + getLogin() + "' and senha= '" + getSenha() + "' " ;
          tabela= con.RetornarResultset(sql);  
          return tabela;
    }
}
