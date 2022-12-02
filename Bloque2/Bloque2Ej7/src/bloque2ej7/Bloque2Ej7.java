/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque2ej7;

import java.util.Scanner;

/**
 * Ejercicio7-Desenvolupa un programa que només permeti introduir els caràcters
 * S i N.
 *
 *
 * @author Aaron Monterroso Segura 10/10/2022
 */
public class Bloque2Ej7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        char letra;

        System.out.println("Introduzca un caracter que sea N o S: ");
        letra = entrada.next().charAt(0);
        if (letra == 'S' || letra == 'N' || letra == 'n' || letra == 's') {
            System.out.println("Es correcto");
        } else {
            System.out.println("Es incorrecto");
        }

    }

}
