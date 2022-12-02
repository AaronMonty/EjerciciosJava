/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque2ej3;

import java.util.Scanner;

/**
 * Ejercicio3- Desenvolupa un programa que demani tres números i escrigui els
 * tres números ordenats de manera creixent (de menor a major). Ex: si els
 * números són 3, 4 i 2, el resultat serà 2 3 4.
 *
 *
 * @author Aaron Monterroso Segura 10/10/2022
 *
 * 
 *
 *
 */
public class Bloque2Ej3 {

    public static void main(String[] args) {

        int num1, num2, num3;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        num1 = entrada.nextInt();

        System.out.println("Introduce el segundo numero: ");
        num2 = entrada.nextInt();

        System.out.println("Introduce el tercer numero: ");
        num3 = entrada.nextInt();

        if (num1 > num2) {

            if (num1 > num3) {

                if (num2 > num3) {

                    System.out.println("Orden Ascendente: " + num3 + " " + num2 + " " + num1);

                } else {

                    System.out.println("Orden Ascendente: " + num1 + " " + num3 + " " + num2);

                }

            } else {

                System.out.println("Orden Ascendente: " + num2 + " " + num1 + " " + num3);

            }

        } else {

            if (num2 > num3) {

                if (num1 > num3) {

                    System.out.println("Orden Ascendente: " + num3 + " " + num1 + " " + num2);

                } else {

                    System.out.println("Orden Ascendente: " + num1 + " " + num3 + " " + num2);

                }

            } else {

                System.out.println("Orden Ascendente: " + num1 + " " + num2 + " " + num3);

            }

        }

    }

}
