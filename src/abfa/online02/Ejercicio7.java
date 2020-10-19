/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abfa.online02;

import java.util.Scanner;

/**
 * Realice la división del número 100 entre uno introducido por el usuario y 
 * muestre el resultado. Posteriormente debe realizar la división del 
 * resultado obtenido entre otro número que introduzca el usuario y así 
 * sucesivamente hasta que este introduzca un 0 que finalizará el programa.
 * Hay que tener en cuenta dos cosas: 
 *  1. Se desea que el resultado que se muestre por pantalla y el que se 
 *      almacene en la variable sea lo más exacto posible, por lo que has de 
 *      elegir el dato más preciso posible.
 *  2. La división por 0 no se debe realizar ya que dará como resultado una
 *      "indeterminación". Utiliza la estructura más idódena para que esto no
 *      suceda.
 * 
 * @author Adrián
 * @version 1.0
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // DECLARACIONES
        
        double numero = 100;
        double numeroUsuario;
        double resultado;
        
        Scanner entrada = new Scanner(System.in);
        
        // ENTRADA DE DATOS
        
        System.out.print("Introduzca un número: "); // Pedimos un número al usuario.
        numeroUsuario = entrada.nextDouble();
        
        // PROCESAMIENTO Y SALIDA DE DATOS
        
        while (numeroUsuario != 0){ // Mientras el usuario no introduzca un 0...
            
            resultado = numero / numeroUsuario ; //La operación base.
            
            if (resultado %2 == 0) {
                
                System.out.println((int)numero + "/" + (int)numeroUsuario + " = " + (int)resultado);
            }
            else {
                
                System.out.println((int)numero + "/" + (int)numeroUsuario + " = " + resultado);
            }
            
            numero = resultado ; // Almacenamos el resultado en "numero" para pueda repetirse el la operación con el nuevo valor.
            
            System.out.print("Introduce otro número, por favor: "); // Pedimos un nuevo número al usuario.
            numeroUsuario = entrada.nextDouble();
        }
        
        System.out.println("La división por cero no se puede realizar."); //Ha introducido 0. Fin del programa.
    }
    
}
