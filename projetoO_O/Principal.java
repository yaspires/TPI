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
        // INSTANCIAR OBJETO USU DA CLASSE USUÁRIO
        Usuario usu = new Usuario();
        
        //CHAMADA DOS METODOS DA CLASSE USUARIO
        usu.GuardarDados();
        usu.MostrarDados();
        
        
    }
    
}
