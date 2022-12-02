/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej19;

import java.util.Scanner;

/**
 * Realiza un programa que lea un número y a continuación escriba el carácter
 * “*” tantas veces igual al valor numérico leído. En aquellos casos en que el
 * valor leído no sea positivo se deberá escribir un único asterisco.
 *
 * @author Aaron Monterroso Segura 14/11/2022
 */
public class BucleEj19 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Dime un numero");
        numero = entrada.nextInt();

        if (numero < 0) {

            System.out.println(" * ");

        } else {
            for (int i = 0; i < numero; i++) {

                System.out.print(" * ");

            }

        }

    }

}
