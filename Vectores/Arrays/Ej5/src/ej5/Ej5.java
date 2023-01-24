/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5;

import java.util.Scanner;

/**
 *
 * Crea un programa que pida veinte números reales por teclado, los almacene en
 * un array y luego lo recorra para calcular y mostrar la media: (suma de
 * valores) / nº de valores.
 *
 * @author Aaron Monterroso Segura 24/01/2023
 */
public class Ej5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int posiciones;
        System.out.println("Dime cuantas posiciones ");
        posiciones = entrada.nextInt();
        mediaArray(llenarArray(posiciones), posiciones);
    }

    public static int[] llenarArray(int numero) {
        Scanner entrada = new Scanner(System.in);
        int[] vector = new int[numero];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Dime " + numero + " numeros ");
            vector[i] = entrada.nextInt();

        }

        return vector;

    }

    public static void mediaArray(int[] vector, int cantidad) {

        float resultado;
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {

            suma = suma + vector[i];

        }
        resultado = suma / cantidad;
        System.out.println("La media del array es: " + resultado);

    }

}
