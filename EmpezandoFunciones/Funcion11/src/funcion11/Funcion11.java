/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion11;

import java.util.Scanner;

/**
 *
 * Realiza un programa que escriba la tabla de multiplicar de un número
 * introducido por teclado. Para ello implementa una función que reciba como
 * parámetro un número entero y muestre por pantalla la tabla de multiplicar de
 * dicho número.
 *
 * @author Aaron Monterroso Segura 28/11/2022
 */
public class Funcion11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Dime un numero y te dire la tabla de multiplicar");
        numero = entrada.nextInt();

        tablaMultiplicar(numero);

    }

    public static void tablaMultiplicar(int numero1) {

        for (int i = 0; i <= 10; i++) {

            System.out.println(numero1 + " * " + i + " = " + numero1 * i);

        }

    }

}
