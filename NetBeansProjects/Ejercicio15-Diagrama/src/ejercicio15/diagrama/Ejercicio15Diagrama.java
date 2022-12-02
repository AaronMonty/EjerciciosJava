/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15.diagrama;

import java.util.Scanner;

/**
 * Ejercicio15-que lea tres números distintos y nos diga cuál es el mayor
 *
 * @author Aaron Monterroso Segura 25/09/2022
 */
public class Ejercicio15Diagrama {

    public static void main(String[] args) {

        int num1, num2, num3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Introduce el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Introduce el tercer numero: ");
        num3 = entrada.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero mayor es: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero mayor es: " + num2);
        } else {
            System.out.println("El numero mayor es: " + num3);
        }
    }

}
