/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abfa.online02;

/**
 * Muestre los 100 primeros números negativos.
 * 
 * @author Adrián
 * @version 1.0
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Es ente programa vamos a mostrar los primeros 100 números negativos.");
        
        //PROCESAMIENTO y SALIDA DE DATOS
        
        for(int numero = -1; numero >= -100; numero--){
            
            System.out.print(numero + " "); //Imprime los primeros 100 números negativos por pantalla.
        
        }
    
    }
}
