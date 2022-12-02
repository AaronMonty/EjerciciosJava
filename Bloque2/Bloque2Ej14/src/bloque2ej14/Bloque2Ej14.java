/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque2ej14;

import java.util.Scanner;

/**
 * Ejercicio14-Desenvolupa un programa que demani 2 números i digui si els 2 són
 * parells o senars.
 *
 *
 * @author Aaron Monterroso Segura 12/10/2022
 */
public class Bloque2Ej14 {

    public static void main(String[] args) {

        int numero, numero2;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        numero = entrada.nextInt();

        System.out.println("Introduce el segundo numero");
        numero2 = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero "+numero+" es par");
        } else {
            System.out.println("El numero "+numero+" no es par");
        }
        if (numero2 % 2 == 0) {
            System.out.println("El numero "+numero2+" es par");
        } else {
            System.out.println("El numero "+numero2+" no es par");
        }

    }

}
