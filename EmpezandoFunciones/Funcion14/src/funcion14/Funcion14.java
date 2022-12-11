/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion14;

import java.util.Scanner;

/**
 *
 * Escribe una función que muestre por pantalla un triángulo como el del
 * ejemplo. Deberá recibir dos parámetros: el carácter que se desea imprimir y
 * el número de líneas del triángulo.
 *
 * @author Aaron Monterroso 30/11/2022
 */
public class Funcion14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        char caracter;
        int lineas;

        System.out.println("De que caracter quieres la piramide?");
        caracter = entrada.next().charAt(0);

        //Limpiamos Buffer
        entrada.nextLine();

        System.out.println("Cuantas lineas quieres de la piramide");
        lineas = entrada.nextInt();

        crearPiramide(lineas, caracter);

    }

    public static void crearPiramide(int numero, char letra) {

        System.out.println();
        for (int i = 1; i <= numero; i++) {

            for (int j = 1; j <= numero - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print(letra);
            }
            System.out.println();
        }

    }

}
