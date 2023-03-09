/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3;

import java.util.Scanner;

/**
 * Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por
 * teclado) e introduzca en ella NxM valores (también introducidos por teclado).
 * Luego deberá recorrer la matriz y al final mostrar por pantalla cuántos
 * valores son mayores que cero, cuántos son menores que cero y cuántos son
 * igual a cero
 *
 * @author Aaron Monterroso Segura 17/02/2023
 */
public class Ej3 {

    public static int filas, columnas, mayorACero = 0, igualACero = 0, menorQueCero = 0;
    public static int[][] matriz;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el numero de filas");
        filas = entrada.nextInt();
        System.out.println("Introduce el numero de columnas");
        columnas = entrada.nextInt();

        crearMatrizConTamaño();
        rellenarMatriz();
        ImprimirResultado();
    }

    public static int[][] crearMatrizConTamaño() {

        return matriz = new int[filas][columnas];
    }

    public static int[][] rellenarMatriz() {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Introduce el valor para la posición (" + i + "," + j + "): ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        return matriz;

    }

    public static void ImprimirResultado() {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] > 0) {
                    mayorACero++;
                } else if (matriz[i][j] < 0) {
                    menorQueCero++;
                } else {
                    igualACero++;
                }
            }
        }

        System.out.println("Valores mayores que cero: " + mayorACero);
        System.out.println("Valores menores a cero: " + menorQueCero);
        System.out.println("Valores iguales a cero: " + igualACero);
    }

}
