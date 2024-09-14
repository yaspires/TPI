
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
public class OlimpiadaMatematica {
    private String nome;
    private String endereco;
    private double media;
    private double notamenor;
    private double notamaior;

    public OlimpiadaMatematica() {
        this("","",0,0,0);
    }

    public OlimpiadaMatematica(String nome, String endereco, double media, double notamenor, double notamaior) {
        this.nome = nome;
        this.endereco = endereco;
        this.media = media;
        this.notamenor = notamenor;
        this.notamaior = notamaior;
    }
    private Scanner le = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getNotamenor() {
        return notamenor;
    }

    public void setNotamenor(double notamenor) {
        this.notamenor = notamenor;
    }

    public double getNotamaior() {
        return notamaior;
    }

    public void setNotamaior(double notamaior) {
        this.notamaior = notamaior;
    }

    public Scanner getLe() {
        return le;
    }

    public void setLe(Scanner le) {
        this.le = le;
    }
    
    public void calcularMedia(){
        System.out.println("Informe o nome do aluno:");
        setNome(le.next());
        System.out.println("Informe o endereço do aluno:");
        setEndereco(le.next());
        System.out.println("Informe a menor nota:");
        setNotamenor(le.nextDouble());
        System.out.println("Informe a maior nota:");
        setNotamaior(le.nextDouble());
        
        media = (notamenor + notamaior)/2;
        System.out.println("A média é "+getMedia());
    }
    
    public void verificarMedia(){
        if(getMedia()>9){
            System.out.println("O aluno " +getNome()+ "está inscrito");
        }else{
            System.out.println("Media insuficiente");
        }
    }
    
}
