/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion2;

import java.util.Scanner;

/**
 * Escribe un programa que pida la edad por teclado y muestre por pantalla si
 * eres mayor de edad o no. Implementa y utiliza la función: boolean
 * esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
 *
 *
 * @author Aaron Monterroso Segura 24/11/2022   
 */
public class Funcion2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;

        System.out.println("Introduce tu edad");
        edad = entrada.nextInt();

        if (esMayorEdad(edad)) {
            System.out.println("Eres mayor de edad");
        } else {

            System.out.println("Eres menor de edad");
        }

    }

    public static boolean esMayorEdad(int edad) {

        return edad >= 18;
    }

}
