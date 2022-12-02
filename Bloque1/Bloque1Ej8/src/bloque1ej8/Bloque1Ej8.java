/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque1ej8;

import java.util.Scanner;

/**
 * Ejercicio8-Programa que demani un nombre sencer i mostri l'últim dígit.
 *
 *
 * @author Aaron Monterroso Segura 06/10/2022
 */
public class Bloque1Ej8 {

    public static void main(String[] args) {
        int numero, digito;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero: ");

        numero = entrada.nextInt();

        digito = numero % 10;

        System.out.println("El ultimo digito es " + digito);
    }

}
