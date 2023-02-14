/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 30/01/2023
 */
public class Ej11 {

    public static void main(String[] args) {

        System.out.println("Array en orden");
        mostrarContenido(llenarArray());
        System.out.println("Array inverso");
        mostrarContenido(arrayInverso(llenarArray()));
    }

    public static int[] llenarArray() {
        Scanner entrada = new Scanner(System.in);
        int[] vector = new int[100];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;

        }
        return vector;

    }

    public static int[] arrayInverso(int[] vector) {
        int[] vectorInverso = new int[vector.length];

        for (int i = 0; i < vector.length; i++) {
            vectorInverso[vector.length - i - 1] = vector[i];
        }

        return vectorInverso;
    }

    public static void mostrarContenido(int[] vector) {

        for (int i = 0; i < vector.length; i++) {

            System.out.println(vector[i] + " ");

        }

    }

}
