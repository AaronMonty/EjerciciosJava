/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion4;

import java.util.Scanner;

/**
 *
 * Escribe un programa que pida dos números enteros por teclado y muestre por
 * pantalla cual es el mínimo. Implementa y utiliza la función: int minimo(int
 * a, int b) // Devuelve el menor entre a y b
 *
 *
 * @author Aaron Monterroso Segura 24/11/2022
 */
public class Funcion4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero, signo;

        System.out.println("Dime un numero");
        numero = entrada.nextInt();

        signo = dimeSigno(numero);

        if (signo < 0) {
            System.out.println("Es negativo");
        } else if (signo == 0) {
            System.out.println("Es 0");
        } else {
            System.out.println("Es positivo");
        }
    }

    public static int dimeSigno(int a) {

        int devolver;

        if (a < 0) {
            devolver = -1;
        } else if (a == 0) {
            devolver = 0;
        } else {
            devolver = 1;
        }

        return devolver;
    }

}
