/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12.diagrama;

import java.util.Scanner;

/**
 * Ejercicio12-de un programa que lee un número y me dice si es positivo o
 * negativo, consideraremos el cero como positivo
 *
 * @author Aaron Monterroso Segura 25/09/2022
 */
public class Ejercicio12Diagrama {

    public static void main(String[] args) {

        int numero1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        numero1 = entrada.nextInt();

        if (numero1 >= 0) {
            System.out.println("El " + numero1 + " es positivo");
        } else {
            System.out.println("El " + numero1 + " es negativo");
        }
    }

}
