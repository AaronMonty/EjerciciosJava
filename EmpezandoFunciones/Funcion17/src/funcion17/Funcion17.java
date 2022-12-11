/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion17;

import java.util.Scanner;

/**
 *
 * Realiza un programa que nos pida número enteros hasta que se introduzca el 0,
 * diciéndonos, para cada número introducido si es primo o no. Hay que recordar
 * que un número es primo si es divisible por si mismo y por 1. El 1 no es primo
 * por convenio. Se debe crear una función que pasándole un número entero
 * devuelva si es primo o no.
 *
 *
 * @author Aaron Monterroso Segura 30/11/2022
 */
public class Funcion17 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = -1;
        boolean primo;
        while (numero != 0) {
            System.out.println("Introduce un numero");
            numero = entrada.nextInt();
            primo = esPrimo(numero);

            if (primo) {
                System.out.println("El numero " + numero + " no es primo ");
            } else {
                System.out.println("El numero " + numero + " es primo ");
            }

        }

    }

    public static boolean esPrimo(int numero) {
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }

        if (contador != 2) {
            return true;
        } else {
            return false;
        }

    }

}
