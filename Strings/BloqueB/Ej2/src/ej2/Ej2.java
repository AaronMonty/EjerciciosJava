/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2;

import java.util.Scanner;

/**
 *
 * 2. Crea un programa que pida dos cadenas de texto por teclado y luego indique
 * si son iguales, además de si son iguales sin diferenciar entre mayúsculas y
 * minúsculas.
 *
 * @author Aaron Monterroso Segura
 */
public class Ej2 {

    public static String verdad = "Es igual";
    public static String falso = "No es igual";

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String cadena1, cadena2;

        System.out.println("Dime una cadena de texto");
        cadena1 = entrada.nextLine();
        System.out.println("Dime otra cadena de texto");
        cadena2 = entrada.nextLine();

        esIgual(cadena1, cadena2);

        System.out.println("Ahora vamos a diferenciar mayusculas y minusculas\nDigame una cadena de texto");
        cadena1 = entrada.nextLine();
        System.out.println("Dime otra cadena de texto");
        cadena2 = entrada.nextLine();

        esIgualMayus(cadena1, cadena2);

    }

    public static void esIgual(String cadena1, String cadena2) {

        if (cadena1.equals(cadena2)) {

            System.out.println(verdad);

        } else {

            System.out.println(falso);
        }

    }

    public static void esIgualMayus(String cadena1, String cadena2) {

        if (cadena1.equalsIgnoreCase(cadena2)) {

            System.out.println(verdad);

        } else {

            System.out.println(falso);
        }

    }

}
