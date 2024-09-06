/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_02;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nm1, nm2, nm3;
        int quant_1, quant_2, quant_3;
        double valor_1, valor_2, valor_3, vt1, vt2, vt3, valor_t;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Insira o nome, quantidade e valor do primeiro produto: ");
        nm1 = leia.next();
        quant_1 = leia.nextInt();
        valor_1 = leia.nextDouble();
        
        System.out.println("Insira o nome, quantidade e valor do segundo produto: ");
        nm2 = leia.next();
        quant_2 = leia.nextInt();
        valor_2 = leia.nextDouble();
        
        System.out.println("Insira o nome, quantidade e valor do terceiro produto: ");
        nm3 = leia.next();
        quant_3 = leia.nextInt();
        valor_3 = leia.nextDouble();
        
        vt1 = quant_1 * valor_1;
        vt2 = quant_2 * valor_2;
        vt3 = quant_3 * valor_3;
        
        valor_t = vt1 + vt2 + vt3;
        
        System.out.println(quant_1+" "+nm1+"s custará "+vt1+" reais");
        System.out.println(quant_2+" "+nm2+"s custará "+vt2+" reais");
        System.out.println(quant_3+" "+nm3+"s custará "+vt3+" reais");
        System.out.println("O valor total de sua compra será de "+valor_t+" reais.");
    }
    
}
