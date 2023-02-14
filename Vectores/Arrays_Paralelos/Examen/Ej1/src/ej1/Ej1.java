/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 13/02/2023
 */
public class Ej1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int tamaño;

        System.out.println("Dime un tamaño que sea par para el vector");
        tamaño = entrada.nextInt();

        while (tamaño % 2 != 0) {

            System.out.println("Error, me tienes que decir un tamaño que sea par");
            tamaño = entrada.nextInt();
        }

        int[] vector = new int[tamaño];
//        int[] vector1 = {1, 5, 4, 7, 3, 0};
//        int[] vector2 = {-4, 0, -2, -3, -3, 0};

        llenarArray(vector);

        semiSuma(vector);
    }

    public static int[] llenarArray(int[] vector) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Llena el vector");
            vector[i] = entrada.nextInt();

        }

        return vector;

    }

    public static void semiSuma(int[] vector) {

        int suma = 0;
        int suma2 = 0;
        for (int i = 0; i < vector.length / 2; i++) {

            suma += vector[i];

        }

        for (int i = (vector.length - 1) / 2; i >= 0; i--) {

            suma2 += vector[i];

        }

        if (suma == suma2) {

            System.out.println("Es semiSuma");

        } else {

            System.out.println("No es semiSuma");
        }

    }

}
