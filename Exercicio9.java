/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2,dobro,triplo;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Insira o primeiro número:");
        num1 = leia.nextInt();
        System.out.println("Insira o segundo número:");
        num2 = leia.nextInt();
        
        dobro = num1*2;
        triplo = num2*3;
        
        System.out.println("O primeiro número é "+ num1 +" e seu dobro é "+ dobro);
        System.out.println("O segundo número é "+ num2 +" e seu triplo é "+ triplo);
        
    }
    
}
