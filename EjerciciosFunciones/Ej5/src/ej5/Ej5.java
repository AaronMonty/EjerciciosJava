/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5;

import java.util.Scanner;

/**
 *
 * Escribe un programa que pida un valor entero en millas y muestre su
 * equivalente en kilómetros. Recuerda que una milla son 1,60934 kilómetros.
 * Implementa y utiliza la función: double millas_a_kilometros(int millas) //
 * Devuelve la conversión de millas a kilómetros
 *
 * @author Aaron Monterroso Segura 31/10/2022
 */
public class Ej5 {

    public static void main(String[] args) {

        double millas, km;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce las millas");
        millas = entrada.nextDouble();

        km = millas_a_kilometros(millas);

        System.out.println("El resultado es " + km + " kilometros");

    }

    public static double millas_a_kilometros(double millas) {

        return 1.60394 * millas;

    }
}
