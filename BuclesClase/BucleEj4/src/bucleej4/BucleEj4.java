/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej4;

import java.util.Scanner;

/**
 * Realiza un programa que muestre los números desde el 1 hasta un número N que
 * se introducirá por teclado
 *
 *
 * @author Aaron Monterroso Segura 03/11/2022
 */
public class BucleEj4 {

    public static void main(String[] args) {

        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {

            System.out.println("N" + i);

        }

    }

}
