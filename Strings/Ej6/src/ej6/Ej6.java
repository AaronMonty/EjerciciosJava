/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura
 */
public class Ej6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombre;
        String alreves = "";
        System.out.println("Cual es tu nombre?");
        nombre = entrada.nextLine();

        for (int i = nombre.length() - 1; i >= 0; i--) {

            alreves += nombre.charAt(i);

        }

        System.out.println("Tu nombre en orden: " + nombre);
        System.out.println("Tu nombre al reves: " + alreves);

    }

}
