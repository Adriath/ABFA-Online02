/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abfa.online02;
import java.util.Scanner;

/**
 * Enseñe un menú donde se elija una de las siguientes opciones: pulgadas a centímetros y de centímetros
 * a pulgadas. Para ello, el programa solicitará que se seleccione la opción y preguntará al usuario que
 * introduzca el número de pulgadas (o centímetros, según el caso) y continuación mostrará cuantos
 * centímetros son (o pulgadas).
 * 
 * @author Adrián
 * @version 1.0
 */

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //DECLARACIÓN DE VARIABLES 
        
        double cm, pulgadas;
        int opcion;
        
        Scanner entrada = new Scanner(System.in);
        
        //ENTRADA DE DATOS
        
        System.out.println("Bienvenido/a al conversor de pulgadas<-->centímetros.");
        System.out.println("Escoge una opción, por favor: \n\n1: Centímetros --> Pulgadas \n2: Pulgadas --> Centímetros \n");
        opcion = entrada.nextInt();
        
        //PROCESAMIENTO y SALIDA DE DATOS
        
        switch (opcion){
            
            case 1:     //conversión de centímetros a pulgadas
                
                System.out.println("Introduce los centímetros: ");
                cm = entrada.nextDouble();
                
                pulgadas = cm / 2.54 ;
                
                System.out.println(cm + " centímetros son: " + pulgadas + " pulgadas.");
                
                break;
                
            case 2:
                
                System.out.println("Introduce las pulgadas: ");
                pulgadas = entrada.nextDouble();
                
                cm = pulgadas * 2.54 ;
                
                System.out.println(pulgadas + " pulgadas son: " + cm + " centímetros.");
                
                break;
        }
        
    }
        
}
    

