/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicando1;

import java.util.Scanner;

/**
 *
 * @author aamo3180
 */
public class Practicando1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        /* System.out.println("Dame una letra");
         */
//        char letra;

        /*
        letra = entrada.next().charAt(0);
        while (letra != 'a') {

            System.out.println("Esta no es la letra que busco dame otra ");
            letra = entrada.next().charAt(0);

        }
        System.out.println("encontrada!");
         */
//        do {
//
//            System.out.println("Dama una letra");
//            letra = entrada.next().charAt(0);
//
//        } while (letra != 'a');
//        int num;
//
//        System.out.println("Dame un numero");
//        num = entrada.nextInt();
//
//        while (num % 100 != 0) {
//
//            num += 2;
//
//        }
//
//        System.out.println("El numero es: " + num);

        float min = 999, max = -999, altura;

        int n;

        System.out.println("Cuantas personas hay? ");
        n = entrada.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Cuanto mides?");
            altura = entrada.nextFloat();

            if (altura < min) {

                min = altura;

            }
            if (altura > max) {

                max = altura;

            }

        }
        System.out.println("El max es " + max);
        System.out.println("El min es " + min);

    }

}
