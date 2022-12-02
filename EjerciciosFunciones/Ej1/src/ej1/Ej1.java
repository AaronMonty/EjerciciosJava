/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

import java.util.Scanner;

/**
 * Escribe un programa que pida dos números reales por teclado y muestre por
 * pantalla el resultado de multiplicarlos. Implementa y utiliza la función:
 * double multiplica(double a, double b) // Devuelve la multiplicación de dos
 * números
 *
 *
 * @author Aaron Monterroso Segura 30/10/2022
 */
public class Ej1 {

    public static double multiplica(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        double x, y, res;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número real: ");
        x = entrada.nextDouble();
        System.out.print("Introduce un número real: ");
        y = entrada.nextDouble();
        res = multiplica(x, y);
        System.out.println("Resultado: " + res);
    }

}
