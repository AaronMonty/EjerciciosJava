/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura
 */
public class Ej2 {

    public static void main(String[] args) {
        int contador = 0;
        String nombre;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime tu nombre");
        nombre = entrada.nextLine();

        for (int i = 0; i < nombre.length() - 1; i++) {
            if (nombre.charAt(i) == 'a' || nombre.charAt(i) == 'A') {
                contador++;
            }
        }

        System.out.println("Hay " + contador + " a ");

    }

}
