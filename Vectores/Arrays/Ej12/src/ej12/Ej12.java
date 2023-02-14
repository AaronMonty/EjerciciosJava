/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej12;

import java.util.Scanner;

/**
 * Crea un programa que cree un array de 10 enteros y luego muestre el siguiente
 * menú con distintas opciones: a. Mostrar valores. b. Introducir valor. c.
 * Salir. La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’
 * pedirá un valor V y una posición P, luego escribirá V en la posición P del
 * array. El menú se repetirá indefinidamente hasta que el usuario elija la
 * opción ‘c’ que terminará el programa
 *
 * @author Aaron Monterroso Segura 30/01/2023
 */
public class Ej12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int vector[] = new int[10];
        boolean continuar = true;
        String opcion;

        while (continuar) {
            System.out.println();
            System.out.println("MENU PRINCIPAL\na. Mostrar valores\nb. Introducir valor\nc. Salir\nElige una opción y presiona intro:");

            opcion = entrada.nextLine();

            switch (opcion) {
                case "a":
                    for (int i = 0; i < vector.length; i++) {
                        System.out.print(vector[i] + " ");
                    }
                    System.out.println();
                    break;

                case "b":
                    int v,
                     p;
                    System.out.print("Valor: ");
                    v = entrada.nextInt();
                    System.out.println("Posición: ");
                    p = entrada.nextInt();
                    if (p < 0 || p >= vector.length) {
                        System.out.println("Posición fuera de límite");
                    } else {
                        vector[p] = v;
                    }
                    break;

                case "c":
                    System.out.println("Fin del programa");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
            entrada.nextLine();
        }

    }

}
