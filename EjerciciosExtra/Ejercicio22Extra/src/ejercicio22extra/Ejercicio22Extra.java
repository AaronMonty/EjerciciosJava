/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22extra;

import java.util.Scanner;

/**
 * Ejercicio 22- Desenvolupa un programa que demani una lletra i detecti si és
 * una vocal.
 *
 * @author Aaron Monterroso Segura 02/10/2022
 */
public class Ejercicio22Extra {

    public static void main(String[] args) {

        char letra;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una letra");
        letra = entrada.next().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o'
                || letra == 'u' || letra == 'A' || letra == 'E'
                || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("La " + letra + " es una vocal");

        } else {
            System.out.println("Es consonante");
        }

    }

}
