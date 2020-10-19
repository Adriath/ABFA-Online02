/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abfa.online02;

import java.util.Scanner;

/**
 * Pida dos números por teclado. Ha de mostrar la suma, resta, multiplicación y división de ambos números.
 * 
 * @author Adrián
 * @version 1.0
 */

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        //DECLARACIONES
        
        double num1 ;
        double num2 ;
        double suma, resta, multiplicacion, division;
        
        Scanner entrada = new Scanner(System.in);
        
        //ENTRADA DE DATOS
        
        System.out.println("Introduce un número, por favor: "); //pedimos un número al usuario
        num1 = entrada.nextDouble();
        
        System.out.println("Introduce otro número, por favor: "); //pedimos un segundo número al usuario
        num2 = entrada.nextDouble();
        
        //PROCESAMIENTO
        
        suma = num1 + num2 ; //suma
        resta = num1 - num2 ; //resta
        multiplicacion = num1 * num2 ; //multiplicación
        division = num1 / num2 ; //división
        
        //SALIDA DE DATOS
        
        System.out.println("La suma de " + (int)num1 + " + " + (int)num2 + " es igual a = " + (int)suma);
        System.out.println("La resta de " + (int)num1 + " - " + (int)num2 + " es igual a = " + (int)resta);
        System.out.println("La multiplicación de " + (int)num1 + " x " + (int)num2 + " es igual a = " + (int)multiplicacion);
        System.out.println("La división de " + (int)num1 + " / " + (int)num2 + " es igual a = " + division);
    }
        
}
    

