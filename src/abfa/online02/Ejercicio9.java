/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abfa.online02;

import java.util.Scanner;

/**
 * Se introduzca un número por teclado e indique si es par o impar.
 * 
 * @author Adrián
 * @version 1.0
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // DECLARACIONES
        
        int numero;
        
        Scanner entrada = new Scanner(System.in);
        
        // ENTRADA DE DATOS
        
        do { // Mientras el usuario no introduzca un 0...
            
            System.out.print("Introduzca un número, por favor: ");
            numero = entrada.nextInt();
            
        } while (numero == 0);
        
        // PROCESAMIENTO Y SALIDA DE DATOS
        
        if (numero %2 == 0) { // Si el número es par.
            
            System.out.println("\nEl número es par.");
        }
        else if (numero %2 != 0){ // Si el número es impar.
            
            System.out.println("\nEl número es impar.");
        }
        
        
    }
    
}
