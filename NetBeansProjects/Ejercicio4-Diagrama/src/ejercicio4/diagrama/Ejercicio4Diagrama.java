/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4.diagrama;

import java.util.Scanner;

/**
 * Ejercicio4- que lea dos números, calcule y muestre el valor de sus suma,
 * resta,producto y división
 *
 * @author Aaron Monterroso Segura 25/09/2022
 */
public class Ejercicio4Diagrama {

    public static void main(String[] args) {
        float numero1, numero2, suma, resta, producto, division;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime un numero");
        numero1 = entrada.nextFloat();

        System.out.println("Dime otro numero");
        numero2 = entrada.nextFloat();

        suma = numero1 + numero2;

        System.out.println("La suma es: " + suma);

        resta = numero1 - numero2;

        System.out.println("La Resta es: " + resta);

        producto = numero1 * numero2;

        System.out.println("La multiplicacion es:" + producto);

        if (numero2 == 0) {
            System.out.println("No se puede  con este numero");
            System.exit(0);
        }

        division = numero1 / numero2;

        System.out.println("La division es: " + division);

    }

}
