/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque2ej4;

import java.util.Scanner;

/**
 * Ejercicio4-Desenvolupa un programa que demani un número a l'usuari del 1 al 5
 * i digui si és un nombre primer o no.
 *
 *
 * @author Aaron Monterroso Segura 10/10/2022
 */
public class Bloque2Ej4 {

    public static void main(String[] args) {

        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 5:");
        numero = entrada.nextInt();

        if (numero < 0 || numero > 5) {

            System.out.println("Error no operamos con esos numeros");

        } else if (numero == 4) {
            System.out.println("Este numero no es primo");
        } else{
            System.out.println("Este numero es primo");
        }

    }
}
