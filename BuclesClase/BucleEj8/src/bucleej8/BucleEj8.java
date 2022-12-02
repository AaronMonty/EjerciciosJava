/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej8;

import java.util.Scanner;

/**
 *
 * Realiza un programa que lea una secuencia de números no nulos hasta que se
 * introduzca un 0, y luego muestre si ha leído algún número negativo, cuantos
 * positivos y cuantos negativos.
 *
 * @author Aaron Monterroso 05/11/2022
 */
public class BucleEj8 {

    public static void main(String[] args) {

        int numero = 0, contadorNegativos = 0, contadorPositivos = 0;
        boolean encontrado = false;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce numeros y pulsa 0 cuando quieras parar");

        do {

            numero = entrada.nextInt();

            if (numero > 0) {

                contadorPositivos++;

            } else if (numero < 0) {

                contadorNegativos++;
                encontrado = true;
            }

        } while (numero != 0);

        if (encontrado) {

            System.out.println("Se encontraron " + contadorNegativos + " numeros negativos ");

        } else {

            System.out.println("No se encontro ningun numero negativo");
        }

        System.out.println("Hay " + contadorPositivos + " numeros positivos ");

    }

}
