/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int litros;
        double vlr_pago, preço= 5.89;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de litros desejado:");
        litros = leia.nextInt();
        vlr_pago = litros*preço;
        System.out.println("O valor a ser pago é "+ vlr_pago);
    }
    
}
