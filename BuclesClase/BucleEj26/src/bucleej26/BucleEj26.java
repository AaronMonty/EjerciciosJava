/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej26;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 20/11/2022
 */
public class BucleEj26 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        do {

            System.out.println("Ingrese el tamaño del cuadrado: ");
            numero = entrada.nextInt();

        } while (numero < 0);

        Scanner teclado = new Scanner(System.in);

        //Linea superior
        for (int i = 0; i < numero; i++) {
            System.out.print("*");
        }
        System.out.println();

        //centro de la forma
        for (int i = 0; i < numero - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < numero - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        //Linea inferior
        for (int i = 0; i < numero; i++) {
            System.out.print("*");
        }

    }

}
