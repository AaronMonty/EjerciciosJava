/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque1ej5;

import java.util.Scanner;

/**
 * Ejercicio5-Donades dos variables A i B, que l’usuari ha d’introduïr, es
 * demana un programa que intercanvia el valor de les variables.
 *
 *
 * @author Aaron Monterroso Segura 06/10/2022
 */
public class Bloque1Ej5 {

    public static void main(String[] args) {

        int a, b, c;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        a = entrada.nextInt();

        System.out.println("Introduce otro numero: ");
        b = entrada.nextInt();
        c = a;
        a = b;
        b = c;

        System.out.println("a es " + a + " b es " + b);

    }

}
