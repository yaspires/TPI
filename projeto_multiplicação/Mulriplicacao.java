
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
public class Mulriplicacao {
    private int valor;
    private int resultado;

    public Mulriplicacao() {
        this(0,0);
    }

    public Mulriplicacao(int valor, int resultado) {
        this.valor = valor;
        this.resultado = resultado;
    }
    
    private Scanner l = new Scanner(System.in);

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public Scanner getL() {
        return l;
    }

    public void setL(Scanner l) {
        this.l = l;
    }
    
    public void multiplicao4(){
        System.out.println("Insira o número desejado: ");
        setValor(l.nextInt());
        
        resultado = valor * 4;
    }
    
    public void MostrarMultiplicacao(){
        System.out.println("O resultado de sua multiplicação é "+ getResultado());
    }
}
