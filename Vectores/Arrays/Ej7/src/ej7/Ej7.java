/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7;

import java.util.Scanner;

/**
 *
 * Crea un programa que pida dos valores enteros P y Q, luego cree un array que
 * contenga todos los valores desde P hasta Q, y lo muestre por pantalla
 *
 * @author Aaron Monterroso Segura 24/01/2023
 */
public class Ej7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int inicial, fin;
        System.out.print("Dime una posicion donde empiece el array: ");
        inicial = entrada.nextInt();

        System.out.print("Dime otra posicion donde quieres que acabe el array: ");
        fin = entrada.nextInt();

        crearVectorDesdePaQ(inicial, fin);

    }

    public static int[] crearVectorDesdePaQ(int P, int Q) {

        if (Q > P) {
            int aux = P;
            P = Q;
            Q = aux;
        }

        int[] vector = new int[(P - Q) - 1];
        for (int i = 0; i < vector.length; i++, P--) {
            vector[i] = P;
        }

        return vector;

    }

//    public static int[] llenarArray(int inicial, int fin) {
//        int[] vector = new int[fin];
//
//        for (int i = 0; i < vector.length; i++) {
//
//            vector[i] = i;
//        }
//
//        return vector;
//
//    }
//
//    public static void mostrarContenido(int[] vector) {
//
//        for (int i = 0; i < vector.length; i++) {
//
//            System.out.println(vector[i]);
//
//        }
//
//    }
}
