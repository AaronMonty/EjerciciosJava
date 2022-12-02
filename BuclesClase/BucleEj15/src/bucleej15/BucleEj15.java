/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej15;

import java.util.Scanner;

/**
 *
 * Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número
 * que introducimos por teclado.
 *
 * @author Aaron Monterroso Segura 07/11/2022
 */
public class BucleEj15 {

    public static void main(String[] args) {

        int numero, contador = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {

            if (i % 3 == 0) {

                contador++;

            }

        }

        System.out.println("Cantidad de multiplos de 3: " + contador);

    }

}
