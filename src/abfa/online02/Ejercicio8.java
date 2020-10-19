/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abfa.online02;

/**
 * Muestre los primeros 50 números impares. Recuerda que has de usar algunas
 * de las estructuras vistas en la unidad.
 * 
 * @author Adrián
 * @version 1.0
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // DECLARACIONES
        
        int numero = 1;
        
        // PROCESAMIENTO Y SALIDA DE DATOS
        
        System.out.println("En este programa vamos a mostrar los primero 50 números impares: ");
        
        for (int i = 1; i <= 50; i++) { // Mostrará 50 números.
            
            System.out.print(numero + " "); // Mostramos el número (iniciado como 1)...
            numero +=2 ; // ... y le añadimos 2 para que continúe mostrandos los impares.
            
        }
        
    }
    
}
