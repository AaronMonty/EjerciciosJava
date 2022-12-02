/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque1ej6;

import java.util.Scanner;

/**
 * Ejercicio6-Programa que determini la edat d’un usuari (paràmetre d’entrada)
 * quan hagi transcorregut un quart de segle.
 *
 *
 * @author Aaron Monterroso Segura 06/10/2022
 */
public class Bloque1Ej6 {

    public static void main(String[] args) {
        int edad, edadtotal;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        edad = entrada.nextInt();

        edadtotal = edad + 25;

        System.out.println("Tu edad pasado un cuarto de siglo es de " + edadtotal + " años");
    }

}
