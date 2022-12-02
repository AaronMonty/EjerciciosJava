/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11.diagrama;

import java.util.Scanner;

/**
 * Ejercicio11-de un programa que lee 2 números y muestra el mayor
 *
 * @author Aaron Monterroso Segura 25/09/2022
 */
public class Ejercicio11Diagrama {

    public static void main(String[] args) {

        int numero1, numero2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        numero1 = entrada.nextInt();
        System.out.println("Introduce otro numero:");
        numero2 = entrada.nextInt();

        if (numero1 > numero2) {
            System.out.println("El " + numero1 + " es mas grande");
        } else if (numero2 > numero1) {
            System.out.println("El " + numero2 + " es mas grande");
        }else{
            System.out.println("Son iguales");
        }

    }

}
