
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
public class passagem {
    private String nomePassageiro;
    private String RG;
    private String telefone;
    private String localViagem;
    private String data;
    private String horario;
    private int numPoltrona;

    public passagem() {
        this("","","","","","",0); 
    }

    public passagem(String nomePassageiro, String RG, String telefone, String localViagem, String data, String horario, int numPoltrona) {
        this.nomePassageiro = nomePassageiro;
        this.RG = RG;
        this.telefone = telefone;
        this.localViagem = localViagem;
        this.data = data;
        this.horario = horario;
        this.numPoltrona = numPoltrona;
    }

    Scanner leia = new Scanner(System.in);
    
    
    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLocalViagem() {
        return localViagem;
    }

    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getNumPoltrona() {
        return numPoltrona;
    }

    public void setNumPoltrona(int numPoltrona) {
        this.numPoltrona = numPoltrona;
    }
    
    public void cadastrarDadosPassageiros(){
        System.out.println("Digite o nome do passageiro: ");
        setNomePassageiro(leia.next());
        
        System.out.println("Digite o RG do passageiro: ");
        setRG(leia.next());
        
        System.out.println("Digite o telefone do passageiro: ");
        setTelefone(leia.next());
    }
    
    public void cadastrarDadosPassagem(){
        System.out.println("\n Digite o local da viagem: ");
        setLocalViagem(leia.next());
        
        System.out.println("Digite a data da viagem: ");
        setData(leia.next());
        
        System.out.println("Digite o horário da viagem: ");
        setHorario(leia.next());
        
        System.out.println("Digite o número da poltrona: ");
        setNumPoltrona(leia.nextInt());
    }
   
    public void mostrarDadosPassageiro(){
        System.out.println("**Dados do passageiro** \n Nome passageiro: "+ getNomePassageiro() +"\n RG:"+ getRG() +"\n Telefone: "+ getTelefone());
        
    }
    
    public void mostrarDadosPassagem(){
        System.out.println("\n **Dados da passagem** \n Local da Viagem: "+ getLocalViagem() +"\n Data: "+ getData() +"\n Horário"+ getHorario() +"\n Número da poltrona: "+ getNumPoltrona());
    }
}
