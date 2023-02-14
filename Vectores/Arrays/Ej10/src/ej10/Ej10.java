/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 30/01/2023
 */
public class Ej10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce N: ");
        int N = entrada.nextInt();
        int[] vector = CrearVector(N);

//        Programa sin funciones
//        Scanner entrada = new Scanner(System.in);
//
//        //Pedimos nº de alturas y creamos vector
//        System.out.print("¿Cuantas alturas a introducir?: ");
//        int n = entrada.nextInt();
//        double alturas[] = new double[n];
//
//        //Pedimos alturas al usuario e introducimos en array
//        System.out.print("Introduce las alturas de una en una: ");
//        for (int i = 0; i < alturas.length; i++) {
//            alturas[i] = entrada.nextDouble();
//        }
//
//        //Calculamos media, máximo y mínimo
//        double suma = 0, media, max = alturas[0], min = alturas[0];
//        for (int i = 0; i < alturas.length; i++) {
//            suma += alturas[i];
//            if (alturas[i] > max) {
//                max = alturas[i];
//            }
//            if (alturas[i] < min) {
//                min = alturas[i];
//            }
//        }
//        media = suma / n;
//
//        //Calculamos cuantas alturas por encima y por debajo de la media
//        int encima = 0, debajo = 0;
//        for (int i = 0; i < alturas.length; i++) {
//            if (alturas[i] > media) {
//                encima++;
//            }
//            if (alturas[i] < media) {
//                debajo++;
//            }
//        }
//
//        //Mostramos los datos
//        System.out.println("Altura media: " + media);
//        System.out.println("Altura máxima: " + max);
//        System.out.println("Altura mínima: " + min);
//        System.out.println("Alturas por encima de la media: " + encima);
//        System.out.println("Alturas por debajo de la media: " + debajo);
    }

    public static int maximo(int[] vector) {

        int mayor = vector[0];

        for (int i = 1; i < vector.length; i++) {

            if (vector[i] > mayor) {
                mayor = vector[i];
            }

        }
        return mayor;
    }

    public static int minimo(int[] vector) {

        int menor = vector[0];

        for (int i = 1; i < vector.length; i++) {

            if (vector[i] < menor) {
                menor = vector[i];
            }

        }
        return menor;
    }

    public static int[] CrearVector(int N) {
        Scanner entrada = new Scanner(System.in);
        int[] vector = new int[N];
        for (int i = 0; i < N; i++) {
            vector[i] = entrada.nextInt();
        }

        return vector;

    }

    public static int CuantasEncimaMedia(int[] vector, int media) {
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > media) {
                cont++;
            }
        }
        return cont;
    }

    public static int CuantasDebajoMedia(int[] vector, int media) {
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < media) {
                cont++;
            }
        }
        return cont;
    }

}
