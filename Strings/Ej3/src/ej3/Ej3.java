/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura
 */
public class Ej3 {

    public static void main(String[] args) {

        String nombre;
        int contador = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe tu nombre");
        nombre = entrada.nextLine();

        for (int i = 0; i < nombre.length(); i++) {

            if (esVocal(nombre.charAt(i))) {
                contador++;
            }

        }

        System.out.println("Hay " + nombre.length() + " letras " + " y hay " + contador + " vocales ");

    }

    public static boolean esVocal(char letra) {

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o'
                || letra == 'u' || letra == 'A' || letra == 'E' || letra
                == 'I' || letra == 'O' || letra == 'U') {
            return true;
        }

        return false;

    }

}
