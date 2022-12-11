/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion8;

import java.util.Scanner;

/**
 * Escribe un programa que pida un valor N entero y luego muestre: el sumatorio
 * des 1 a N, el productorio de 1 a N y el valor intermedio entre 1 y N.
 * Implementa y utiliza las funciones: int suma1aN(int n) // Devuelve la suma de
 * enteros de 1 a n int producto1aN(int n) // Devuelve el producto de enteros de
 * 1 a n double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
 *
 *
 * @author Aaron Monterroso Segura 28/11/2022
 */
public class Funcion8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero, resultadoFinal;

        double resultadoFinalDouble;

        System.out.println("Dime un numero ");
        numero = entrada.nextInt();

        resultadoFinal = suma1aN(numero);

        System.out.println("El resultado de la suma de 1 hasta " + numero + " es de " + resultadoFinal);

        resultadoFinal = producto1aN(numero);

        System.out.println("El resultado de la multiplicacion de 1 hasta " + numero + " es de  " + resultadoFinal);

        resultadoFinalDouble = intermedio1aN(numero);

        System.out.println("El resultado de la division de 1 hasta " + numero + " es de " + resultadoFinalDouble);
    }

    public static int suma1aN(int n) {
        int devolver = 0;
        for (int i = 0; i <= n; i++) {
            devolver = devolver + i;
        }
        return devolver;
    }

    public static int producto1aN(int n) {
        int devolver = 1;
        for (int i = 1; i <= n; i++) {
            devolver = devolver * i;
        }
        return devolver;
    }

    public static double intermedio1aN(int n) {
        int devolver = 0;
        for (int i = 1; i <= n; i++) {
            devolver = (n) + i / 2;
        }
        return devolver;
    }

}
