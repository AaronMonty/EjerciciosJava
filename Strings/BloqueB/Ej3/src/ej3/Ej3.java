/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3;

import java.util.Scanner;

/**
 *
 * Crea un programa que pida por teclado tres cadenas de texto: nombre y dos
 * apellidos. Luego mostrará un código de usuario (en mayúsculas) formado por la
 * concatenación de las tres primeras letras de cada uno de ellos. Por ejemplo
 * si se introduce “Lionel”, “Tarazón” y “Alcocer” mostrará “LIOTARALC”.
 *
 *
 * @author Aaron Monterroso Segura
 */
public class Ej3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombre, apellido1, apellido2;

        System.out.println("Dime tu nombre");
        nombre = entrada.nextLine();
        System.out.println("Dime tu primer apellido");
        apellido1 = entrada.nextLine();
        System.out.println("Dime tu segundo apeliido");
        apellido2 = entrada.nextLine();

        coger3(nombre, apellido1, apellido2);

    }

    public static void coger3(String palabra, String palabra2, String palabra3) {

        System.out.print(palabra.toUpperCase().substring(0, 3));
        System.out.print(palabra2.toUpperCase().substring(0, 3));
        System.out.print(palabra3.toUpperCase().substring(0, 3));
        System.out.println();
    }

    //Parte Joan
    public static String dividirString(String palabra) {

        if (palabra.length() > 2) {
            return "" + palabra.charAt(0) + palabra.charAt(1) + palabra.charAt(2);

        } else {
            return "No se puede nombre de menos de 3 letras";
        }

    }

}
