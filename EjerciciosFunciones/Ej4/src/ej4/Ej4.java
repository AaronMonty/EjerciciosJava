/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4;

import java.util.Scanner;

/**
 * Escribe un programa que pida un número entero por teclado y muestre por
 * pantalla si es positivo, negativo o cero. Implementa y utiliza la función:
 * int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si
 * es positivo
 *
 *
 * @author Aaron Monterroso Segura 31/10/2022
 */
public class Ej4 {

    public static int dimeSigno(int a) {
        int r;
        if (a < 0) {
            r = -1;
        } else if (a == 0) {
            r = 0;
        } else {
            r = 1;
        }
        return r;
    }

    public static void main(String[] args) {

        int x, y, min;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        x = entrada.nextInt();

        switch (dimeSigno(x)) {
            case -1:
                System.out.println("Es negativo");
                break;
            case 0:
                System.out.println("Es cero");
                break;
            case 1:
                System.out.println("Es positivo");
                break;

        }

    }

}
