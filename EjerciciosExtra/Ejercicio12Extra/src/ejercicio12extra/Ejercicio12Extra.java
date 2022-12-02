/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12extra;

import java.util.Scanner;

/**
 * Ejercicio12- Fer un programa que calculi l'edat exacta d'una persona.
 *
 *
 * @author Aaron Monterroso Segura 02/10/2022
 */
public class Ejercicio12Extra {

    public static void main(String[] args) {

        int edad, fnacimiento, factual;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el año actual: ");
        factual = entrada.nextInt();

        System.out.println("Introduce tu año de nacimiento: ");
        fnacimiento = entrada.nextInt();

        edad = factual - fnacimiento;

        if (factual < 0) {
            System.out.println("No se pueden años negativos");
            System.exit(0);
        }

        if (fnacimiento < 0) {
            System.out.println("No se pueden años negativos");
            System.exit(0);
        }

        System.out.println("Tu edad es " + edad);

    }

}
