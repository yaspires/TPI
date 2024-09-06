/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1, num2, soma, subt, div, mult;
        
        Scanner leia = new Scanner(System.in);
        DecimalFormat conv = new DecimalFormat("0.00");
        
        System.out.println("Digite o primeiro número:");
        num1 = leia.nextDouble();
        System.out.println("Digite o segundo número:");
        num2 = leia.nextDouble();
        soma = num1 + num2;
        subt = num1 - num2;
        div = num1 / num2;
        mult = num1 * num2;
        
        System.out.println("O resultado da soma é: "+soma);
        System.out.println("O resultado da subtração é: "+subt);
        System.out.println("O resultado da divisão é: "+div);
        System.out.println("O resultado da multiplicação é: "+mult);
        
        
        
        
        
        
    }
    
}
