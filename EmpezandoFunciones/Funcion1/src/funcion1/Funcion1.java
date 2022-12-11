/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion1;

import java.util.Scanner;

/**
 * Escribe un programa que pida dos números reales por teclado y muestre por
 * pantalla el resultado de multiplicarlos. Implementa y utiliza la función:
 * double multiplica(double a, double b) // Devuelve la multiplicación de dos
 * números
 *
 *
 * @author Aaron Monterroso Segura 24/11/2022
 */
public class Funcion1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double numero1, numero2, resultadoFinal;
        System.out.println("Introduce dos numeros");
        numero1 = entrada.nextDouble();
        numero2 = entrada.nextDouble();

        resultadoFinal = multiplica(numero1, numero2);

        System.out.println(resultadoFinal);
    }

    public static double multiplica(double a, double y) {

        return (a * y);

    }

}
