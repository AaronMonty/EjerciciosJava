/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej5;

import java.util.Scanner;

/**
 * Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de
 * si ha leído algún número negativo o no.
 *
 *
 * @author Aaron Monterroso Segura 05/11/2022
 */
public class BucleEj6 {

    public static void main(String[] args) {

        //En While
//        Scanner entrada = new Scanner(System.in);
//        int i = 0;
//        boolean encontrado = false;
//        int numero = 0;
//        while (numero < 10 && !encontrado) {
//            System.out.println("Dame un numero");
//            int n = entrada.nextInt();
//            if (n < 0) {
//                encontrado = true;
//
//            }
//
//            i++;
//
//        }
//        if (encontrado) {
//
//            System.out.println("He encontrado numeros negativos");
//
//        } else {
//            System.out.println("No encontre numeros negativos");
//        }
        // En For
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce 10 numeros");
        int numero = 0;
        boolean negativo = false;

        for (int i = 0; i < 10; i++) {

            numero = entrada.nextInt();

            if (numero < 0) {

                negativo = true;

            }

        }

        if (negativo) {

            System.out.println("He encontrado numeros negativos");

        } else {

            System.out.println("No encontre numeros negativos");
        }
    }

}
