/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13.diagrama;

import java.util.Scanner;

/**
 * Ejercicio 13- de un programa que lee dos números y los visualiza en orden
 * ascendente
 *
 * @author Aaron Monterroso Segura 25/09/2022
 */
public class Ejercicio13Diagrama {

    public static void main(String[] args) {

        int numero1, numero2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Introduce otro numero: ");
        numero2 = entrada.nextInt();

        if (numero1 > numero2) {
            System.out.println("El orden es " + numero2 + " y " + numero1);
        } else {
            System.out.println("El orden es " + numero1 + " y " + numero2);
        }

    }

}
