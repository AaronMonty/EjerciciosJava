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

        Scanner entrada = new Scanner(System.in);
        int posiciones;

        System.out.println("Dime de cuantas posiciones quieres el array");
        posiciones = entrada.nextInt();
        sumarNumeros(llenarArray(posiciones));
    }

    public static void sumarNumeros(int[] vector) {
        Scanner entrada = new Scanner(System.in);
        int resultado = 0;
        for (int i = 0; i < vector.length; i++) {

            resultado += vector[i];
        }

        System.out.println("La suma de todos los numeros del array son: " + resultado);

    }

    public static int[] llenarArray(int numero) {
        Scanner entrada = new Scanner(System.in);
        int[] vector = new int[numero];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Dime " + numero + " numeros para rellenar el array");
            vector[i] = entrada.nextInt();

        }

        return vector;

    }

}
