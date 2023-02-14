/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej14;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 31/01/2023
 */
public class Ej14 {

    public static void main(String[] args) {

        int cuantos = 55;

        mostrarArray(llenarArray(cuantos));
    }

    public static int[] llenarArray(int cuantos) {
        //creamos el vector
        int valores[] = new int[cuantos];

        //Índice para recorrer el vector
        int posicion = 0;

        //Para cada número i del 1 al 10
        for (int i = 1; i <= 10; i++) {
            //repetimos i veces
            for (int j = 0; j < i; j++) {
                //Guardar el valor en 'posición'
                valores[posicion] = i;

                //Actualizadmos posición
                posicion++;
            }
        }
        return valores;
    }

    public static void mostrarArray(int[] vector) {
        //Mostramos el array
        System.out.print("Array: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

    }

}
