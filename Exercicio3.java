/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade, dias, ano=365;
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite sua idade:  ");
        idade = leia.nextInt();
        dias = idade*ano;
        System.out.println("Você já viveu "+ dias +" dias");
        
        
    }
    
}
