/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque2ej12;

import java.util.Scanner;

/**
 * Ejercicio12-Desenvolupa un programa que mostri un menú que contempli les
 * opcions "Arxiu", "Buscar" i "Sortir" i en el cas de que no s'introdueixi una
 * opció correcta es notificarà per pantalla.
 *
 *
 * @author Aaron Monterroso Segura 11/10/2022
 */
public class Bloque2Ej12 {

    public static void main(String[] args) {

        String palabra;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una de las siguientes palabras: ");
        System.out.println("--------");
        System.out.println("Arxiu");
        System.out.println("Buscar");
        System.out.println("Sortir");
        System.out.println("--------");
        palabra = entrada.nextLine();

        if (palabra.equalsIgnoreCase("Arxiu") || palabra.equalsIgnoreCase("Archivo")) {
            System.out.println("La palabra que elegiste es " + palabra);
        } else if (palabra.equalsIgnoreCase("Buscar")) {
            System.out.println("La palabra que elgiste es " + palabra);
        } else if (palabra.equalsIgnoreCase("Sortir") || palabra.equalsIgnoreCase("Salir")) {
            System.out.println("La palabra que elegiste es " + palabra);
        } else {
            System.out.println("La palabra que elegiste es incorrecta");
        }
    }

}
