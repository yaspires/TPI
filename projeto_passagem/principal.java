/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instanciar a classe passagem
        passagem pas = new passagem();
        
        pas.cadastrarDadosPassageiros();
        pas.cadastrarDadosPassagem();
        
        pas.mostrarDadosPassageiro();
        pas.mostrarDadosPassagem();
    }
    
}
