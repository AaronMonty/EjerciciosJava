/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque1ej7;

import java.util.Scanner;

/**
 * Ejercicio7-Programa que demani una quantitat en euros i determini quin era el
 * seu valor amb les antigues 'pessetes'. (166,386 pts és un euro).
 *
 *
 * @author Aaron Monterroso Segura 06/10/2022
 */
public class Bloque1Ej7 {

    public static void main(String[] args) {
        float euros, pesetas=166.386F,totalPesetas;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una cantidad en euros:");
        euros = entrada.nextFloat();

        totalPesetas = euros * pesetas;

        System.out.println("La cantida en pesetas es de " + totalPesetas+" pesetas");

    }

}
