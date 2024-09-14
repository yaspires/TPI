
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
public class Prova {
    private String nome;
    private double pontos;
    private String nivel;

    public Prova() {
        this("",0,"");
    }

    public Prova(String nome, double pontos, String nivel) {
        this.nome = nome;
        this.pontos = pontos;
        this.nivel = nivel;
    }
    
    private Scanner l = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPontos() {
        return pontos;
    }

    public void setPontos(double pontos) {
        this.pontos = pontos;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Scanner getL() {
        return l;
    }

    public void setL(Scanner l) {
        this.l = l;
    }
    
    public void nivelProva(){
        System.out.println("Insira o nome:");
        setNome(l.next());
        
        System.out.println("Insira a quantidade de pontos:");
        setPontos(l.nextDouble());
        
        if(pontos <= 100){
            setNivel("nível 1");
            
        }else if(pontos > 100 && pontos < 200){
            setNivel("nível 2");
            
        }else{
            setNivel("nível 3");
        }
        
    }
    
    public void listarSituacao(){
        System.out.println("/nNome: "+ getNome() +"\nPontos: "+ getPontos() +"\nNível da prova: "+ getNivel());
    }
}
