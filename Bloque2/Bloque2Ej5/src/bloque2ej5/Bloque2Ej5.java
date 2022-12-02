/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque2ej5;

import java.util.Scanner;

/**
 * Ejercicicio6-Desenvolupa un programa que demani un número a l'usuari i digui
 * si és parell o senar.
 *
 *
 * @author Aaron Monterroso Segura 10/10/2022
 */
public class Bloque2Ej5 {

    public static void main(String[] args) {

        int numero;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Es un numero par");
        } else {
            System.out.println("No es un numero par");
        }

    }

}
