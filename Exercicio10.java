/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio10;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, quadrado;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Insira o numero desejado: ");
        num = leia.nextInt();
                
        quadrado = (int) Math.pow(num,2);
        System.out.println("O quadrado do número inserido é "+quadrado);
        
        
        
    }
    
}
