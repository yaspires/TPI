/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_1;

import java.util.Scanner;
import static sun.net.www.http.HttpClient.New;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double raio, area;
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Insira o raio da circunfêrencia: ");
        raio = leia.nextDouble();
        
        area = (3.14 * (raio * raio));
        
        System.out.println("A área da circunfêrencia é "+area);
        
        
    }
    
}
