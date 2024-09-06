/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double lado_a, lado_b, perimetro, area;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Insira a medida do lado A (em cm): ");
        lado_a = leia.nextDouble();
        System.out.println("Insira a medida do lado B (em cm): ");
        lado_b = leia.nextDouble();
        
        perimetro = 2*lado_a + 2*lado_b;
        area = lado_a*lado_b;
        
        System.out.println("O perímetro deste rentângulo é "+ perimetro +" e a área é "+ area);
      
        
    }
    
}
