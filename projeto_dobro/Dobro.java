
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Dobro {
    private double numero;
    private double calculo;

    public Dobro() {
        this(0.00,0.00);
    }

    public Dobro(double numero, double calculo) {
        this.numero = numero;
        this.calculo = calculo;
    }
    
    private Scanner l = new Scanner(System.in);

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getCalculo() {
        return calculo;
    }

    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }

    public Scanner getL() {
        return l;
    }

    public void setL(Scanner l) {
        this.l = l;
    }
    
    public void calcularDobro(){
        System.out.println("Insira o número desejado: ");
        setNumero(l.nextDouble());
        
        calculo = 2*numero;
        
        System.out.println("O dobro do número inserido é "+ getCalculo());
    }
}
