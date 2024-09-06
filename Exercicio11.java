/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio11;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vendas,sal_bonus;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Insira a quantidade de móveis vendidos: ");
        vendas = leia.nextInt();
        
        sal_bonus = 50*vendas+1000;
                
        System.out.println("Você vendeu "+ vendas +" móveis e seu salário será de "+ sal_bonus);
    }
    
}
