/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3;

import java.util.Scanner;

/**
 *
 * Crea un programa que pida diez números reales por teclado, los almacene en un
 * array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por
 * pantalla.
 *
 * @author Aaron Monterroso Segura
 */
public class Ej3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int posiciones;
        System.out.println("Dime de cuantas posiciones quieres el array");
        posiciones = entrada.nextInt();
        minimoMaximo(llenarArray(posiciones));

    }

    public static int[] llenarArray(int numero) {
        Scanner entrada = new Scanner(System.in);
        int[] vector = new int[numero];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Dime " + numero + " numeros para rellenar el array ");
            vector[i] = entrada.nextInt();

        }

        return vector;

    }

    public static void minimoMaximo(int[] vector) {

        int menor = vector[0];
        int mayor = vector[0];
        for (int i = 0; i < vector.length; i++) {

            if (vector[i] < menor) {
                menor = vector[i];
            }

        }
        for (int i = 0; i < vector.length; i++) {

            if (vector[i] > mayor) {
                mayor = vector[i];
            }

        }

        System.out.println("El numero mayor del array es: " + mayor);
        System.out.println("El numero menor del array es: " + menor);

    }

}
