/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6.diagrama;

import java.util.Scanner;

/**
 * Ejercicio6- que dado el precio de un artículo y el precio de venta real nos
 * muestre el porcentaje de descuento realizado
 *
 * @author Aaron Monterroso Segura 25/09/2022
 */
public class Ejercicio6Diagrama {

    public static void main(String[] args) {

        double precioreal, precioarticulo;
        double descuento;
        double preciodescuento;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce Precio Real: ");
        precioreal = entrada.nextDouble();
        System.out.println("Introduce Precio Ariticulo: ");
        precioarticulo = entrada.nextDouble();

        descuento = (100 * precioarticulo) / precioreal;

        System.out.println("El porcentaje de descuento es: " + descuento);

    }

}
