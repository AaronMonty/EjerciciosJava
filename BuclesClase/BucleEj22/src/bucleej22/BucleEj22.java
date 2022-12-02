/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej22;

import java.util.Scanner;

/**
 *
 * Realiza un programa que pida un número y construya por pantalla su pirámide.
 * Ejemplo:
 *
 * @author Aaron Monterroso Segura 15/11/2022
 */
public class BucleEj22 {

    public static void main(String[] args) {

        System.out.print("Dime un numero para realizar su piramide: ");
        Scanner entrada = new Scanner(System.in);
        int numero;
        do {
            numero = entrada.nextInt();
            System.out.print("Porfavor introduzca un numero positivo: ");
        } while (numero < 0);

        System.out.println();

        for (int i = 1; i <= numero; i++) {

            for (int j = 1; j <= numero - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
