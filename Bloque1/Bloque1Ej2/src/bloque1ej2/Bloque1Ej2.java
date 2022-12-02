/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque1ej2;

import java.util.Scanner;

/**
 * Ejercicio2-Programa que demani una quantitat preu d'un producte i calculi i
 * visualitzi la quantitat d'IVA (aplicant un percentatge del 21 %) i la
 * quantitat total a pagar (preu original + IVA).
 *
 *
 * @author Aaron Monterroso Segura 06/10/2022
 */
public class Bloque1Ej2 {

    public static void main(String[] args) {

        double precio, total, iva;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el precio: ");
        precio = entrada.nextDouble();

        iva = precio * 0.21;

        System.out.println("El iva sera de " + iva);

        total = precio + iva;

        System.out.println("El precio con el iva es de " + total);

    }

}
