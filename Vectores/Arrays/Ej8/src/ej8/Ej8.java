/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * Crea un programa que cree un array con 100 números reales aleatorios entre
 * 0.0 y 1.0, utilizando Math.random(), y luego le pida al usuario un valor real
 * R. Por último, mostrará cuántos valores del array son igual o superiores a R.
 *
 * @author Aaron Monterroso Segura 24/01/2023
 */
public class Ej8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float opcion;
        System.out.println("Digame un numero mayor al 0.0 o menor al 1.0");
        opcion = entrada.nextFloat();

        while (opcion < 0.0 || opcion > 1.0) {
            System.out.println("Error, dime un numero mayor al 0.0 o menor al 1.0");
            opcion = entrada.nextFloat();
        }

        igualOMayor(llenarArray(), opcion);
    }

    public static float[] llenarArray() {
        float[] vector = new float[100];
        Random aleatorio = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextFloat(0.0F, 1.0F);

        }
        return vector;

    }

    public static void igualOMayor(float[] vector, float opcion) {
        int iguales = 0, mayores = 0;
        for (int i = 0; i < vector.length; i++) {

            if (opcion == vector[i]) {
                iguales++;
            } else if (vector[i] > opcion) {
                mayores++;
            }

        }

        System.out.println("Hay " + iguales + " numeros iguales ");
        System.out.println("Hay " + mayores + " numeros mayores ");
    }
}
