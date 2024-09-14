
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
public class Quadrado {
    private double numero;
    private double resultado;

    public Quadrado() {
        this(0,0);
    }

    public Quadrado(double numero, double resultado) {
        this.numero = numero;
        this.resultado = resultado;
    }
    
    private Scanner l = new Scanner(System.in);
    

    public Scanner getL() {
        return l;
    }

    public void setL(Scanner l) {
        this.l = l;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public void calcularQuadrado(){
        System.out.println("Insira o número desejado: ");
        setNumero(l.nextDouble());
        
        resultado = numero * numero;
    }

    public void mostrarQuadrado(){
        System.out.println("Seu número elevado ao quadrado é "+ getResultado());
    }
    
}
