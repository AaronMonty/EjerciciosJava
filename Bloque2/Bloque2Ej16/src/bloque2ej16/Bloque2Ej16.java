/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque2ej16;

import java.util.Scanner;

/**
 * Ejercicio16-Desenvolupa un programa que demani 3 números i digui si el tercer
 * és el residu de la divisió dels dos primers.
 *
 *
 * @author Aaron Monterroso Segura 12/10/2022
 */
public class Bloque2Ej16 {

    public static void main(String[] args) {

         float numero1,numero2,numero3,division;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero: ");
        numero1=entrada.nextFloat();
        
        System.out.println("Introduce el segundo numero: ");
        numero2=entrada.nextFloat();
        
        System.out.println("Introduce el tercer numero: ");
        numero3=entrada.nextFloat();
        
        division=numero1/numero2;
        
        if (numero3 == division) {
            
            System.out.println("El tercer numero es el mismo que la division de "+numero1+" y "+numero2);
            
        } else {
            System.out.println("El tercer numero no es lo mismo que la division de "+numero1+" y "+numero2);
        }  
        
        
    }

}
