/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14.diagrama;

import java.util.Scanner;

/**
 * Ejercicio14-que lee dos números y nos dice cuál es el mayor o si son iguales
 *
 * @author Aaron Monterroso Segura 25/09/2022
 */
public class Ejercicio14Diagrama {

    public static void main(String[] args) {

        int numero1, numero2;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Introduce otro numero: ");
        numero2 = entrada.nextInt();

        if (numero1 == numero2) {
            System.out.println("Son iguales");
        } else if (numero1 > numero2) {
            System.out.println("El " + numero1 + " es mas grande");
        } else {
            System.out.println("El " + numero2 + " es mas grande");
        }

    }

}
