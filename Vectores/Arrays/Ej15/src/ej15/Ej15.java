/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej15;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 01/02/2023
 */
public class Ej15 {

    public static void main(String[] args) {
        //Pedimos tamaño (n) y valor (m)
        Scanner entrada = new Scanner(System.in);
        System.out.print("Tamaño del vector: ");
        int n = entrada.nextInt();
        System.out.print("Valor a introducir: ");
        int m = entrada.nextInt();

        mostrarArray(llenarArrayFill(m, m));

    }

    public static int[] llenarArrayFill(int tamaño, int valor) {
        int vector[] = new int[tamaño];

        Arrays.fill(vector, valor);

        return vector;
    }

    public static void mostrarArray(int[] vector) {
        //Mostramos el array
        String arrayStr = Arrays.toString(vector);
        System.out.println("Array: " + arrayStr);
    }

}
