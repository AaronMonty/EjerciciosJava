/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej21;

import java.util.Scanner;

/**
 * Realiza un programa que pida dos número enteros A y B, siendo B mayor que A.
 * Luego visualiza los números desde A hasta B e indicar cuantos hay que sean
 * pares. Ejemplo:
 *
 * @author Aaron Monterroso Segura 15/11/2022
 */
public class BucleEj21 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroA, numeroB = 0, pares = 0;

        System.out.print("Dime un numero: ");
        numeroA = entrada.nextInt();

        do {

            System.out.print("Dime otro numero mayor al anterior: ");
            numeroB = entrada.nextInt();

        } while (numeroB < numeroA);

        for (int i = numeroA; i <= numeroB; i++) {

            System.out.print(i);
            System.out.print(" ");

            if (i % 2 == 0) {
                pares++;
            }
        }
        System.out.println("");
        System.out.print("La cantidad de pares son: " + pares);
        System.out.println("");
    }

}
