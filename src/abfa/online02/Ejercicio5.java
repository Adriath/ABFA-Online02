/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abfa.online02;

import java.util.Scanner;

/**
 *Muestre los 10 siguientes números pares a partir de uno introducido por teclado. 
 * Por ejemplo, si el número introducido es el 13 ha de mostrar: 14, 16, 18, 20, 
 * 22, 24, 26, 28, 30, 32.
 * 
 * @author Adrián
 * @version 1.0
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // DECLARACIONES
        
        int numero;
        
        Scanner entrada = new Scanner(System.in);
        
        // ENTRADA DE DATOS
        
        System.out.println("Introduce un número, por favor: "); // Pedimos un númeor al usuario.
        numero = entrada.nextInt(); // Guardame en "numero" el número introducido por el usuario.
        
        // PROCESAMIENTO Y SALIDA DE DATOS
        
        for (int i = 0; i < 10; i++) { // Usamos un bucle for para que muestre solamente 10 números.
            
            if (numero %2 == 0) { // Si el número es par
                
                System.out.print((numero + 2) + " "); // añade 2 al primer número junto a un espacio
                numero += 2 ; // e increméntalo de 2 en 2 hasta el completar el bucle for.
            }
            else{ // Y si no es par
                
                System.out.print((numero + 1) + " "); // súmale 1 al primer número para hacerlo par
                numero += 2 ; // e incremente a de dos en dos hasta completar el bucle for.
            }
        }
    }
    
}
