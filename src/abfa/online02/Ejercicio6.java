/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abfa.online02;

import java.util.Scanner;

/**
 * Pida por teclado dos números. A continuación, ha de mostrar un menú con dos
 * opciones, indicando que si introduce un 1 por teclado se realizará la suma
 * de ambos números y si introduce un 2 se realizará la resta. Por último 
 * realizar la operación y mostrar el resultado por pantalla.
 * 
 * @author Adrián
 * @version 1.0
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // DECLARACIONES
        
        int num1, num2;
        int suma, resta;
        int opcion;
        
        Scanner entrada = new Scanner(System.in);
        
        // ENTRADA DE DATOS
        
        System.out.println("Vamos a realizar una operación a partir de dos números. \n");
        
        System.out.print("Por favor, introduzca un primer número: "); // Pedimos el primer número al usuario.
        num1 = entrada.nextInt();
        
        System.out.print("Y ahora el otro número: "); // Pedimos el segundo número al usuario.
        num2 = entrada.nextInt();
        
        System.out.println("\nElige una de las siguientes opciones: " // Establecemos un menú para elegir la opción.
            + "\n  1 --> Se realiza la SUMA de ambos números."
            + "\n  2 --> Se realiza la RESTA de ambos números.");
        opcion = entrada.nextInt();
        
        // PROCESAMIENTO Y SALIDA DE DATOS
        
        switch (opcion){
            
            case 1:
                
                suma = num1 + num2 ;
                
                System.out.println("La SUMA de los dos números es: " + suma);
                break;
                
            case 2:
                
                resta = num1 - num2 ;
                
                System.out.println("La RESTA de los dos números es: " + resta);
                break;
                
            default:
                System.out.println("Opción incorrecta.");
        }
        
    }
    
}
