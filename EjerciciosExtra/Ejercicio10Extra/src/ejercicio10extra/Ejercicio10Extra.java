/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10extra;

import java.util.Scanner;

/**
 * Ejercicio10- Fer un programa que llegeix 2 nombres enters positius i que
 * mostri la suma i la multiplicació d'aquests.
 *
 *
 * @author Aaron Monterroso Segura 02/10/2022
 */
public class Ejercicio10Extra {

    public static void main(String[] args) {

        int numero1,numero2,suma,multiplicacion;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        numero1 = entrada.nextInt();
        
        System.out.println("Dime otro numero: ");
        numero2 = entrada.nextInt();
        
        suma = numero1+numero2;
        
         multiplicacion= numero1*numero2;
         
         System.out.println("El resultado de la suma es: "+suma);
         
         System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
        
    }

}
