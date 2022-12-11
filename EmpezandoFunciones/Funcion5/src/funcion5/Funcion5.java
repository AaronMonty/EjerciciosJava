/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion5;

import java.util.Scanner;

/**
 * Escribe un programa que pida un valor entero en millas y muestre su
 * equivalente en kilómetros. Recuerda que una milla son 1,60934 kilómetros.
 * Implementa y utiliza la función: double millas_a_kilometros(int millas) //
 * Devuelve la conversión de millas a kilómetros
 *
 *
 *
 * @author Aaron Monterroso Segura 28/11/2022
 */
public class Funcion5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double millas, millasKM;

        System.out.println("Introduce un numero en millas");
        millas = entrada.nextInt();

        millasKM = millas_a_kilometros(millas);
        System.out.println("El resultado en kilometros es " + millasKM + " kilometros");

    }

    public static double millas_a_kilometros(double millas) {

        return millas * 1.60934;

    }

}
