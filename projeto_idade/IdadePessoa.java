
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
public class IdadePessoa {
    private int ano;
    private int idade;

    public IdadePessoa() {
        this(0,0);
    }

    public IdadePessoa(int ano, int idade) {
        this.ano = ano;
        this.idade = idade;
    }
    
    private Scanner l = new Scanner(System.in);

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Scanner getL() {
        return l;
    }

    public void setL(Scanner l) {
        this.l = l;
    }
    
    public void calcularIdade(){
        System.out.println("Insira seu ano de nascimento: ");
        setAno(l.nextInt());
        
        idade = 2024 - ano;
    }

    public void mostarIdade(){
        System.out.println("Voc~e tem "+ getIdade() +" anos de idade!");
    }
}
