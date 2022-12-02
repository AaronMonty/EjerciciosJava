/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14extra;

import java.util.Scanner;

/**
 * Ejercicio14-Fer un programa que em mostri l'arrel quadrada de qualsevol
 * nombre ingressat.
 *
 *
 * @author Aaron Monterroso Segura 02/10/2022
 */
public class Ejercicio14Extra {

    public static void main(String[] args) {

        double numero, resultado, raiz;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        numero = entrada.nextDouble();

        raiz = Math.sqrt(numero);

        System.out.println("La raiz cuadrada de " + numero + " es " + raiz);

    }

}
