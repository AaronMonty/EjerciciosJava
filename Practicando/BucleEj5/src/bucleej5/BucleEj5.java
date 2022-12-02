/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej5;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 07/11/2022
 */
public class BucleEj5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int acumulador = 1;
        int numero;

        do {
            System.out.println("Introduce numero positivo");
            numero = entrada.nextInt();

        } while (numero < 0);

        while (numero > 1) {
            acumulador *= numero;
            numero--;

        }
        System.out.println(acumulador);
    }
}
