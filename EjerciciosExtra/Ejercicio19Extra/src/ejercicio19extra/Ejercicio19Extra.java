/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19extra;

import java.util.Scanner;

/**
 * Ejercicio19- Desenvolupa un programa que demani un número i digui si és
 * positiu o negatiu.
 *
 *
 * @author Aaron Monterroso Segura 02/10/2022
 */
public class Ejercicio19Extra {

    public static void main(String[] args) {

        float numero;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = entrada.nextFloat();

        if (numero >= 0) {
            System.out.println("Es un numero positivo");
        } else {
            System.out.println("Es un numero negativo");
        }

    }

}
