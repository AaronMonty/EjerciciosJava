/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3;

import java.util.Scanner;

/**
 * Escribe un programa que pida dos números enteros por teclado y muestre por
 * pantalla cual es el mínimo. Implementa y utiliza la función: int minimo(int
 * a, int b) // Devuelve el menor entre a y b
 *
 * @author Aaron Monterroso Segura 30/10/2022
 */
public class Ej3 {

    public static int minimo(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int x, y, min;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        x = entrada.nextInt();
        System.out.print("Introduce un número: ");
        y = entrada.nextInt();
        min = minimo(x, y);
        System.out.println("El minimo es: " + min);

    }
}
