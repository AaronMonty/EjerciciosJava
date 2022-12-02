/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej20;

import java.util.Scanner;

/**
 *
 * Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre
 * por pantalla los números desde 1 hasta N, uno en cada línea, repitiendo cada
 * número tantas veces como su valor. Ejemplo:
 *
 *
 * @author Aaron Monterroso Segura 15/11/2022
 */
public class BucleEj20 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Introduce un numero entre el 0 y 20");
            numero = entrada.nextInt();
        } while (numero < 0 || numero > 20);

        for (int i = 1; i <= numero; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }   

    }

}
