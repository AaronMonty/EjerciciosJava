/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura
 */
public class Ej9 {

    public static void main(String[] args) {

        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero y te dire su posicion en el array");
        numero = entrada.nextInt();

        while (numero < 0 || numero > 100) {
            System.out.println("Error, dime un numero mayor al 0 o menor al 100");
            numero = entrada.nextInt();
        }

        System.out.println("La posicion de el " + numero + " que elegiste es: " + posicionEnArrayInt(llenarArray(), numero));
    }

    public static int[] llenarArray() {
        int[] vector = new int[101];
        Random aleatorio = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(1, 100);
        }
        return vector;

    }

    public static int posicionEnArrayInt(int[] vector, int numero) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numero) {
                System.out.println(" " + i);
            }
        }
        return -1;
    }
}
