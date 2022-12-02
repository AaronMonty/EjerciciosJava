/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21extra;

import java.util.Scanner;

/**
 * Ejercicio21-Desenvolupa un programa que demani un número i digui si és major
 * que 100.
 *
 *
 * @author Aaron Monterroso Segura 02/10/2022
 */
public class Ejercicio21Extra {

    public static void main(String[] args) {

        int numero;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = entrada.nextInt();

        if (numero > 100) {
            System.out.println("El numero que introduciste es mayor que 100");
        } else if (numero == 100) {
            System.out.println("El numero que introduciste es igual que 100");
        } else {
            System.out.println("El numero que introduciste es menor que 100");
        }

    }

}
