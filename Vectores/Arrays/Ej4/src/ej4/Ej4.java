/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4;

import java.util.Scanner;

/**
 *
 * Crea un programa que pida veinte números enteros por teclado, los almacene en
 * un array y luego muestre por separado la suma de todos los valores positivos
 * y negativos
 *
 * @author Aaron Monterroso Segura
 */
public class Ej4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int posiciones;
        System.out.println("Dime de cuantas posiciones quieres el array");
        posiciones = entrada.nextInt();
        sumarPosNeg(llenarArray(posiciones));
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

    public static void sumarPosNeg(int[] vector) {

        int sumaPositivos = 0, sumaNegativos = 0;
        for (int i = 0; i < vector.length; i++) {

            if (vector[i] >= 0) {
                sumaPositivos += vector[i];
            } else {
                sumaNegativos += vector[i];
            }
        }

        System.out.println("Suma de numeros positivos: " + sumaPositivos);
        System.out.println("Suma de numeros negativos: " + sumaNegativos);
    }

}
