/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion9;

import java.util.Scanner;

/**
 *
 * Realiza un programa que pida introducir tres valores enteros y nos diga cuál
 * de ellos es el más elevado. Impleméntalo creando únicamente una función a la
 * que le pasemos dos valores (no tres) y nos devuelva el máximo de los dos
 * valores.
 *
 *
 * @author Aaron Monterroso Segura 28/11/2022
 */
public class Funcion9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, numero3, resultadoFinal;

        System.out.println("Introduce 3 numeros");
        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();
        numero3 = entrada.nextInt();

        int auxiliar = mayor(numero3, numero3);

        System.out.println("El mayor es: " + (mayor(auxiliar, numero3)));

    }

    public static int mayor(int numeroUno, int numeroDos) {

        if (numeroUno > numeroDos) {

            return numeroUno;

        } else {

            return numeroDos;
        }

    }

}
