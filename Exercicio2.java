/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double nota1, nota2, nota3, nota4, nota5, nota6, med1, med2, soma;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite a nota1: ");
        nota1= leia.nextDouble();
        System.out.println("Digite a nota2: ");
        nota2= leia.nextDouble();
        System.out.println("Digite a nota3: ");
        nota3= leia.nextDouble();
        med1 = (nota1+nota2+nota3)/3;
        System.out.println("A média1 é: "+med1);
  
        System.out.println("Digite a nota4: ");
        nota4= leia.nextDouble();
        System.out.println("Digite a nota5: ");
        nota5= leia.nextDouble();
        System.out.println("Digite a nota6: ");
        nota6= leia.nextDouble();
        med2 = (nota4+nota5+nota6)/3;
        System.out.println("A média2 é: "+med2);
        soma = med1 + med2;
        System.out.println("A soma das médias é: "+soma);
        
    }
    
}
