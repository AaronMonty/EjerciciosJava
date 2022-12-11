/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion12;

import java.util.Scanner;

/**
 * Realiza un programa que dado un valor en kilómetros nos lo traduce a millas.
 * El programa debe tener una función que reciba como parámetro una cantidad en
 * kilómetros y nos la devuelva en millas
 *
 *
 * @author Aaron Monterroso Segura 28/11/2022
 */
public class Funcion12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int km;
        float resultadoFinal;
        System.out.println("Introduce los kilometros");
        km = entrada.nextInt();

        System.out.println(devolverMillas(km));

    }

    public static float devolverMillas(float numero1) {

        numero1 = +(numero1 * 0.6F);

        return numero1;

    }

}
