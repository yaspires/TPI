/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sal_min, sal_fun, qtdsal;
        Scanner leia = new Scanner (System.in);
        
        System.out.print("Digite o atual slário mínimo: ");
        sal_min = leia.nextDouble();
        System.out.println("Digite o salário de seu funcionario: ");
        sal_fun = leia.nextDouble();
        qtdsal = sal_fun/sal_min;
        System.out.println("O salário inserido equivale a "+ qtdsal +" salários mínimos");
    
    }
    
}
