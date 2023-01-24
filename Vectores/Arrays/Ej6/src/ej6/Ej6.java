/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6;

import java.util.Scanner;

/**
 *
 * Crea un programa que pida dos valores enteros N y M, luego cree un array de
 * tamaño N, escriba M en todas sus posiciones y lo muestre por pantalla
 *
 * @author Aaron Monterroso Segura 24/01/2023
 */
public class Ej6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int posiciones, numero;
        System.out.print("De cuantas posiciones quieres el array: ");
        posiciones = entrada.nextInt();
        System.out.print("Dime un numero para poner en todas las posiciones del array: ");
        numero = entrada.nextInt();

        mostrarContenido(llenarArray(posiciones, numero));

    }

    public static int[] llenarArray(int posiciones, int numero) {
        Scanner entrada = new Scanner(System.in);
        int[] vector = new int[posiciones];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = vector[i] + numero;

        }

        return vector;

    }

    public static void mostrarContenido(int[] vector) {

        for (int i = 0; i < vector.length; i++) {

            System.out.println(vector[i]);

        }

    }

}
