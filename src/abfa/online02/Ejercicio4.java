/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abfa.online02;

import java.util.Scanner;

/**
 * Comprueba si un número introducido por teclado es positivo. En caso afirmativo muestra el mensaje
 * "El número introducido es positivo".
 * 
 * @author Adrián
 * @version 1.0
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //DECLARACIONES
        
        int numero ;
        
        Scanner entrada = new Scanner(System.in);
        
        //PROCESAMIENTO Y SALIDA DE DATOS
        
        do { // Realizamos un bucle do-while para que vuelva a pedir el número en caso de introducir el 0. Deberá introducir un valor distinto a 0 para continuar.
            
        System.out.println("Introduce un número, por favor: ");
        numero = entrada.nextInt(); //Guardamos el número que introduce el usuario.
        
            if (numero > 0) {
                
                System.out.println("El número introducido ES POSITIVO."); // El número es positivo.
            }
            else if (numero < 0){
                
                System.out.println("El número introducido ES NEGATIVO"); // El número es negativo.
            }
            
        } while (numero == 0);
        
        
    }
    
}
