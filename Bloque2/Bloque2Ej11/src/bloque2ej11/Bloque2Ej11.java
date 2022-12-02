/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque2ej11;

import java.util.Scanner;

/**
 * Ejercicio-11 Desenvolupa un programa que demani 3 números i indiqui si el
 * tercer és igual a la suma del primer i el segon.
 *
 *
 * @author Aaron Monterroso Segura 11/10/2022
 */
public class Bloque2Ej11 {

    public static void main(String[] args) {

        int numero1,numero2,numero3,suma;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero: ");
        numero1=entrada.nextInt();
        
        System.out.println("Introduce el segundo numero: ");
        numero2=entrada.nextInt();
        
        System.out.println("Introduce el tercer numero: ");
        numero3=entrada.nextInt();
        
        suma=numero1+numero2;
        
        if (numero3 == suma) {
            
            System.out.println("El tercer numero es el mismo que la suma de "+numero1+" y "+numero2);
            
        } else {
            System.out.println("El tercer numero no es lo mismo que la suma de "+numero1+" y "+numero2);
        }
        
        
    }

}
