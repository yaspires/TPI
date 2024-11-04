
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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CustoPiso custo = new CustoPiso();
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite \n1- Inserir valores do comodo; \n2- Calcular preço por area; \n3- Mostrar valores; \n0- Sair"));
        
            switch(op){
                case 1:
                    custo.inserirValores();
                break;
                case 2:
                    custo.calcularArea();
                break;
                case 3:
                    custo.mostrarValores();
                break;
                case 0:
                JOptionPane.showMessageDialog(null,"Finalizando...");
                break;
                default:
                JOptionPane.showMessageDialog(null,"Opção inválida");
                break;
        }
        
    }while(op!=0);
    }
    
}
