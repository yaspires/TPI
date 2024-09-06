/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio12;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double val_atraso,parcela, juros, atraso;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Insira o valor da parcela em atraso: ");
        parcela = leia.nextInt();
        System.out.println("Insira a taxa de juros: ");
        juros = leia.nextInt();
        System.out.println("Insira a quantidade de meses em atraso: ");
        atraso = leia.nextInt();
        
        val_atraso = parcela + ( parcela * (juros/100) * atraso);
        System.out.println("O valor a ser pago agora é de "+ val_atraso);
    }
    
}
