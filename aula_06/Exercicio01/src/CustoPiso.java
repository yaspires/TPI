
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class CustoPiso {
    private double comprimentoCamada;
    private double larguraCamada;
    private double precoporArea;
    private double custoTotalComodo;

    public CustoPiso() {
        this(0.0,0.0,0.0,0.0);
    }

    public CustoPiso(double comprimentoCamada, double larguraCamada, double precoporArea, double custoTotalComodo) {
        this.comprimentoCamada = comprimentoCamada;
        this.larguraCamada = larguraCamada;
        this.precoporArea = precoporArea;
        this.custoTotalComodo = custoTotalComodo;
    }
   
    private Scanner  l = new Scanner(System.in);

    public double getComprimentoCamada() {
        return comprimentoCamada;
    }

    public void setComprimentoCamada(double comprimentoCamada) {
        this.comprimentoCamada = comprimentoCamada;
    }

    public double getLarguraCamada() {
        return larguraCamada;
    }

    public void setLarguraCamada(double larguraCamada) {
        this.larguraCamada = larguraCamada;
    }

    public double getPrecoporArea() {
        return precoporArea;
    }

    public void setPrecoporArea(double precoporArea) {
        this.precoporArea = precoporArea;
    }

    public double getCustoTotalComodo() {
        return custoTotalComodo;
    }

    public void setCustoTotalComodo(double custoTotalComodo) {
        this.custoTotalComodo = custoTotalComodo;
    }

    public Scanner getL() {
        return l;
    }

    public void setL(Scanner l) {
        this.l = l;
    }
    
    public void inserirValores(){
        setComprimentoCamada(Double.parseDouble(JOptionPane.showInputDialog("Informe o comprimento do comodo: ")));
        setLarguraCamada(Double.parseDouble(JOptionPane.showInputDialog("Insira a largura do comodo: ")));
        setPrecoporArea(Double.parseDouble(JOptionPane.showInputDialog("Insira o preço por área: ")));    
    }
    
    public void calcularArea(){
        setCustoTotalComodo(getComprimentoCamada()*getLarguraCamada()*getPrecoporArea());
    }
    
    public void mostrarValores(){
        JOptionPane.showMessageDialog(null, "Comprimento do comodo: "+getComprimentoCamada());
        JOptionPane.showMessageDialog(null, "Largura do comodo: "+getLarguraCamada());
        JOptionPane.showMessageDialog(null, "Preço por área: "+getPrecoporArea());
        JOptionPane.showMessageDialog(null, "Valor total: "+getCustoTotalComodo());
    }

    
}
