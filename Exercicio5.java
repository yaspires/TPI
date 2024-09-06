/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sal_mensal, ajuste, sal_ajustado;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o salario atual de seu funcionario: ");
        sal_mensal = leia.nextDouble();
        System.out.println("Insira o porcentual do ajuste");
        ajuste = leia.nextDouble();
        sal_ajustado = sal_mensal+(sal_mensal*(ajuste/100));
        System.out.println("O salario ajustado será de: "+sal_ajustado);
        
    }
    
}
