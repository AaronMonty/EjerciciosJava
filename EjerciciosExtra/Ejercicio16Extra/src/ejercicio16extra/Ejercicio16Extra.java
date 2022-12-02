/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16extra;

import java.util.Scanner;

/**
 * Ejercicio15- Fer un programa que realitzi la conversió de lliures a
 * quilograms (on 1 Kg = 2.2046 lliures).
 *
 *
 * @author Aaron Monterroso Segura 02/10/2022
 */
public class Ejercicio16Extra {

    public static void main(String[] args) {
        
        double libras,kilogramos,resultado;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una cantidad en libras: ");
        libras = entrada.nextDouble();

        kilogramos = libras / 2.205;
        
        System.out.println("La cantida en kilogramos es "+kilogramos);
        
        
    }

}
