/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 24/02/2023
 */
public class Ej1 {

    public static int[][] matriz;
    public static int minimo = 9999, maximo = -9999;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //crear una matriz: 2 x 5 de enteros
        matriz = new int[2][5];

        //inicializa los valores desde el código
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Introduce edades: ");
                matriz[i][j] = entrada.nextInt();

                while (matriz[i][j] < 0 || matriz[i][j] > 118) {

                    System.out.print("Error,Edades menores a 0 o mayores a 118 no se pueden.\nDame una edad:");
                    matriz[i][j] = entrada.nextInt();
                }

            }
        }

        // Imprimir toda la matriz
        System.out.println("Toda la matriz");
        imprimir();
        System.out.println("-------------");
        // Imprimir la última fila de la matriz
        System.out.println("Ultima linea de la matriz");
        imprimirUltimaFila();
        System.out.println("-------------");
        //Decir minimo y maximo
        System.out.println("Edad pequeña y grande");
        imprimirMaximoYMinimo();
        System.out.println("-------------");
        //Cambiar filas
        System.out.println("Cambiando filas");
        imprimirAlReves();
        System.out.println("-------------");
        //Vertices Matriz
        verticesMatriz();
    }

    public static void imprimir() {

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void imprimirUltimaFila() {

        for (int i = 0; i < 5; i++) {

            System.out.print(matriz[1][i] + " ");

        }
        System.out.println();
    }

    public static void imprimirMaximoYMinimo() {
        int maxFila = 0, maxColumna = 0, minFila = 0, minColumna = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                    maxFila = i;
                    maxColumna = j;
                }
                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j];
                    minFila = i;
                    minColumna = j;
                }
            }
        }
        System.out.println("Valor maximo: " + maximo + " en fila " + maxFila + " columna " + maxColumna);
        System.out.println("Valor minimo: " + minimo + " en fila " + minFila + " columna " + minColumna);

    }

    public static void imprimirAlReves() {

        //Imprimir la matriz original
        System.out.println("Matriz original");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        //Imprimir la matriz con las filas cambiadas
        int[] fila1 = new int[matriz[0].length];
        for (int i = 0; i < matriz[0].length; i++) {
            fila1[i] = matriz[0][i];
            matriz[0][i] = matriz[1][i];
            matriz[1][i] = fila1[i];
        }
        //Matriz filas al reves
        System.out.println("Matriz con filas al reves");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void verticesMatriz() {
        System.out.println("Los valores de los vértices de la matriz son:");

        System.out.println(matriz[0][0]);
        System.out.println(matriz[0][5 - 1]);
        System.out.println(matriz[2 - 1][0]);
        System.out.println(matriz[2 - 1][5 - 1]);

        
        
    }

}
