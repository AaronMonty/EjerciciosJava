/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9.diagrama;

import java.util.Scanner;

/**
 * Ejercicio9- de un programa que pide la edad por teclado y nos muestra el
 * mensaje de “eres mayor de edad” o el mensaje de “eres menor de edad”.
 *
 * @author Aaron Monterroso 25/09/2022
 */
public class Ejercicio9Diagrama {

    public static void main(String[] args) {

        int edad, diez=10;
        double numero,alejas;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Que edad tienes?: ");
        edad = entrada.nextInt();

        if (edad >= 18) {
            System.out.println("........");
            System.out.println("Eres mayor de edad");
            System.out.println("........");
        } else {
            System.out.println("........");
            System.out.println("Eres menor de edad");
            System.out.println("........");
        }

        
        System.out.println("Dime un numero decimal: ");
        numero = entrada.nextDouble();
        
        if (numero>10) {
            System.out.println("El numero es mayor que 10: ");
            alejas = numero - diez;
        } else if (numero<10) {
            System.out.println("El numero es menor que 10: ");
        }else{
            System.out.println("El numero es igual que 10: ");
        }
        
        
        alejas = numero - diez;
        
        System.out.println("Me alejo "+alejas);
        
    }
    

}
