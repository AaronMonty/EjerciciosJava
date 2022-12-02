/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4extra;

import java.util.Scanner;

/**
 * Ejercicio4- Una tenda ofereix un descompte del 15% sobre el total de la
 * compra i un client desitja saber quant haurà de pagar finalment per la seva
 * compra.
 *
 *
 * @author Aaron Monterroso Segura 1/09/2022
 */
public class Ejercicio4Extra {

    public static void main(String[] args) {

        double totalcompra, descuento, compra;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuando le costo su compra: ");
        compra = entrada.nextDouble();

        descuento = compra * 0.15;

        totalcompra = compra - descuento;

        System.out.println("El precio de la compra total con el descuento "
                + "realizado es: " + totalcompra);

    }

}
