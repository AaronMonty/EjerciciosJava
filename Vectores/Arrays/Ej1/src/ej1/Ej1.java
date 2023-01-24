/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

import java.util.Scanner;

/**
 *
 * Crea un programa que pida diez números reales por teclado, los almacene en un
 * array, y luego muestre todos sus valores.
 *
 *
 * @author Aaron Monterroso Segura 22/01/2023
 */
public class Ej1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int posiciones;
        System.out.println("Dime cuantas posiciones ");
        posiciones = entrada.nextInt();
        mostrarContenido(llenarArray(posiciones));
        //        int[] manera1={1,2,3};
        //        int[] manera2= new int[10];
        //        int[] manera3= manera2; //funcion();
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

    public static void mostrarContenido(int[] vector) {

        for (int i = 0; i < vector.length; i++) {

            System.out.println(vector[i]);

        }

    }

}
