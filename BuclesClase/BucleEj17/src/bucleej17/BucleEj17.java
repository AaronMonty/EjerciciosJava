/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej17;

import java.util.Scanner;

/**
 *
 * Realiza un programa que lea y acepte únicamente aquellos que sean mayores que
 * el último dado. La introducción de números finaliza con la introducción de un
 * 0. Al final se mostrará: El total de números introducidos, excluido el 0. El
 * total de números fallados.
 *
 * @author Aaron Monterroso Segura 11/11/2022
 */
public class BucleEj17 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = 1, anterior, fallo = 0, total = 0;

        System.out.print("Dime un numero: ");
        numero = entrada.nextInt();

        anterior = numero - 1;

        while (numero != 0) {

            total++;

            if (anterior >= numero) {

                System.out.println("Te has equivocado");
                fallo++;

            }
            anterior = numero;
            System.out.print("Dime un numero: ");
            numero = entrada.nextInt();

        }

        System.out.print("Total de numeros introducidos: " + total);
        System.out.print("Numeros fallados: " + fallo);
    }

}
