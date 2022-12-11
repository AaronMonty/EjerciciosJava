/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion3;

import java.util.Scanner;

/**
 * Escribe un programa que pida dos números enteros por teclado y muestre por
 * pantalla cual es el mínimo. Implementa y utiliza la función: int minimo(int
 * a, int b) // Devuelve el menor entre a y b
 *
 *
 * @author Aaron Monterroso Segura 24/11/2022
 */
public class Funcion3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Introduce dos numero");
        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();

        minimo(numero1, numero2);

        System.out.println("El numero minimo es " + minimo(numero1, numero2));

    }

    public static int minimo(int a, int b) {

//        if (a > b) {
//            return b;
//        } else {
//            return a;
//        }

        return (a > b ? b : a);

    }

}
