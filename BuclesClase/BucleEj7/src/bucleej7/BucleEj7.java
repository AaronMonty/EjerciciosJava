/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej7;

import java.util.Scanner;

/**
 *
 * Realiza un programa que lea 10 números no nulos y luego muestre un mensaje
 * indicando cuántos son positivos y cuantos negativos.
 *
 * @author Aaron Monterroso Segura 05/11/2022
 */
public class BucleEj7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero, contadorNegativos = 0, contadorPositivos = 0;

        System.out.println("Introduce 10 numeros");

        for (int i = 0; i < 10; i++) {

            numero = entrada.nextInt();

            if (numero < 0) {

                contadorNegativos++;

            } else {

                contadorPositivos++;
            }

        }

        System.out.println("Hay " + contadorNegativos + " numeros negativos ");
        System.out.println("Hay " + contadorPositivos + " numeros positivos ");
    }

}
