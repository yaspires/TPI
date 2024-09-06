/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg7;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome;
        int quant;
        double preco, vlr_total;
        Scanner leia = new Scanner(System.in);
        DecimalFormat conv = new DecimalFormat("0.00");
        
        System.out.print("Insira a o nome do produto: ");
        nome = leia.next();
        System.out.print("Insira a quantidade comprada: ");
        quant = leia.nextInt();
        System.out.print("Insira o preço do produto: ");
        preco = leia.nextDouble();
        
        vlr_total = quant*preco;
        
        System.out.println("O produto desejado é "+ nome +" e o valor total a ser pago é "+ conv.format(vlr_total));
        
        
        
    }
    
}
