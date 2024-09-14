
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
public class Cliente {
    private String cliente;
    private String end;
    private String rg;

    public Cliente() {
        this("","","");
    }

    public Cliente(String cliente, String end, String rg) {
        this.cliente = cliente;
        this.end = end;
        this.rg = rg;
    }
    
    private Scanner leia = new Scanner(System.in);

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Scanner getLeia() {
        return leia;
    }

    public void setLeia(Scanner leia) {
        this.leia = leia;
    }
    
    public void cadastrarCliente(){
        System.out.println("Insira o nome do cliente: ");
        setCliente(leia.next());
        
        System.out.println("Insira o endereço: ");
        setEnd(leia.next());
        
        System.out.println("Insira o rg: ");
        setRg(leia.next());
    }
    
    public void listarCliente(){
        System.out.println("Cliente: "+ getCliente() +"\nRG: "+ getRg() +"\nEndereço: "+ getEnd());
    }
}
