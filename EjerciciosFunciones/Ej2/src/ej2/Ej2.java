/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2;

import java.util.Scanner;

/**
 * Escribe un programa que pida la edad por teclado y muestre por pantalla si
 * eres mayor de edad o no. Implementa y utiliza la función: boolean
 * esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
 *
 * @author Aaron Monterroso Segura 30/10/2022
 */
public class Ej2 {

    public static boolean esMayorEdad(int a) {
        if (a >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int x;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        x = entrada.nextInt();

        if (esMayorEdad(x)) {
            System.out.println("Eres mayor de edad");

        } else {
            System.out.println("No eres mayor de edad");
        }
    }

}
