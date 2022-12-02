/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8.diagrama;

import java.util.Scanner;

/**
 * Ejercicio8- de un programa que pide la edad por teclado y nos muestra el
 * mensaje de “Eres mayor de edad” solo si lo somos
 *
 * @author Aaron Monterroso Segura 25/09/2022
 */
public class Ejercicio8Diagrama {

    public static void main(String[] args) {
        int edad;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Que edad tienes");
        edad = entrada.nextInt();

        if (edad >= 18) {
            System.out.println("........");
            System.out.println("Eres mayor de edad");
            System.out.println("........");
        } else {

        }

    }

}
