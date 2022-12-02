/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque2ej8;

import java.util.Scanner;

/**
 * Ejercicio8-Desenvolupa un programa que demani un número i digui si és major
 * que 100 o menor que 500 o (que sea par y menos que 100), escribir un mensaje
 * para cada caso.
 *
 *
 * @author Aaron Monterroso Segura 11/10/2022
 */
public class Bloque2Ej8 {

    public static void main(String[] args) {

         int numero;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = entrada.nextInt();

        if (numero > 100) {
            System.out.println("El numero que introduciste es mayor que 100");
        } else if (numero == 100) {
            System.out.println("El numero que introduciste es igual que 100");
        } else if(numero<500) {
            System.out.println("El numero que introduciste es menor que 500");
        }

    }

}
