/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej16;

import java.util.Scanner;

/**
 * Realiza un programa en java que pida un número entero positivo y nos diga si
 * es primo o no.
 *
 * @author Aaron Monterroso Segura 07/11/2022
 */
public class BucleEj16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero");
        int numero;
        boolean primo = true;
        numero = entrada.nextInt();

        for (int i = 2; i < numero && primo; i++) {

            if (numero % i == 0) {
                primo = false;

            }

        }

        if (primo) {

            System.out.println("Es primo");

        } else {

            System.out.println("No es primo");
        }

    }

}
