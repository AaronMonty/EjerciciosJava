/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque2ej15;

import java.util.Scanner;

/**
 * Ejercicio15-Desenvolupa un programa que demani 3 números i digui si la
 * multiplicació dels dos primers és igual al tercer.
 *
 *
 * @author Aaron Monterroso Segura 12/10/2022
 */
public class Bloque2Ej15 {

    public static void main(String[] args) {

        
      
        int numero1,numero2,numero3,multiplicacion;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero: ");
        numero1=entrada.nextInt();
        
        System.out.println("Introduce el segundo numero: ");
        numero2=entrada.nextInt();
        
        System.out.println("Introduce el tercer numero: ");
        numero3=entrada.nextInt();
        
        multiplicacion=numero1*numero2;
        
        if (numero3 == multiplicacion) {
            
            System.out.println("El tercer numero es el mismo que la multiplicacion de "+numero1+" y "+numero2);
            
        } else {
            System.out.println("El tercer numero no es lo mismo que la multiplicacion de "+numero1+" y "+numero2);
        }  
        
        
    }

}
