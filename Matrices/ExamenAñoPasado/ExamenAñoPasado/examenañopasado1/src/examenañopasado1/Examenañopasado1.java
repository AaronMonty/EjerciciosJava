/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenañopasado1;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura
 */
public class Examenañopasado1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int N = 0;
        String[] ficheros;
        int[][] permisos;

        System.out.println("Cuantos ficheros tienes en el sistema");
        N = entrada.nextInt();

        while (N < 0) {
            System.out.println("No puede introducir menos de 0");
            N = entrada.nextInt();
        }
        permisos = new int[N][10];
        ficheros = new String[N];

        //Limpiamos Buffer
        entrada.nextLine();

        //Le preguntamos al usuario los nombres de los ficheros
        for (int i = 0; i < ficheros.length; i++) {

            System.out.println("Dime el nombre del fichero: " + (i + 1));
            ficheros[i] = entrada.nextLine();
        }

        permisos = rellenarMatriz(permisos, N);
        imprimirMatriz(permisos);
    }

    public static int[][] rellenarMatriz(int[][] matriz, int N) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            System.out.println("Dime los permisos del archivo: " + (i + 1));
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 3; k++) {
                    matriz[i][j] = entrada.nextInt();

                }
            }
        }

        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Permisos del fichero: " + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }

}
