/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque2ej17;

import java.util.Scanner;

/**
 * Ejercicio17-Desenvolupa un programa que mostri un menú on les opcions siguin
 * “Equilater”, “Isosceles” i “Escale”, demani una opció i calculi el perímetre
 * del triangle seleccionat.
 *
 *
 * @author Aaron Monterroso Segura 12/10/2022
 */
public class Bloque2Ej17 {

    public static void main(String[] args) {

        String palabra;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una de las siguientes palabras: ");
        System.out.println("--------");
        System.out.println("Equilater");
        System.out.println("Isosceles");
        System.out.println("Escale");
        System.out.println("--------");
        palabra = entrada.nextLine();

        if (palabra.equalsIgnoreCase("Equilater") || palabra.equalsIgnoreCase("Equilatero")) {
            System.out.println("La formula de un " + palabra + " es la suma de A+A+A porque son iguales");
        } else if (palabra.equalsIgnoreCase("Isosceles")) {
            System.out.println("La formula de un " + palabra + " es la suma de A+A+B porque 2 lados son iguales y 1 diferente");

        } else if (palabra.equalsIgnoreCase("Escale") || palabra.equalsIgnoreCase("Escaleno")) {
            System.out.println("La formula de un " + palabra + " es la suma de A+B+C porque sus lados son diferentes");

        } else {
            System.out.println("La palabra que elegiste es incorrecta");
        }

    }

}
