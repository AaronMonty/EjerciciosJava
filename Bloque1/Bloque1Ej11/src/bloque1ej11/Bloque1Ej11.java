/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque1ej11;

import java.util.Scanner;

/**
 * Ejercicio11-Calcular el descompte i la suma a pagar per un medicament
 * qualsevol en una farmacia si tots els medicaments tenen un descompte del 35%.
 *
 *
 * @author Aaron Monterroso Segura 06/10/2022
 */
public class Bloque1Ej11 {

    public static void main(String[] args) {

        float descuento = 0.35F, descuento2, precio, preciocondescuento;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cual es el precio del medicamento");
        precio = entrada.nextFloat();

        descuento2 = precio * descuento;
        System.out.println("El descuento de " + descuento + " es de " + descuento2 + " euros");

        preciocondescuento = precio - descuento2;

        System.out.println("El precio del medicamento es de " + preciocondescuento + " euros");

    }

}
