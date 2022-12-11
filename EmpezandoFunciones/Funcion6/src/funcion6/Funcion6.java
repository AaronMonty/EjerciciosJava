/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion6;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 28/11/2022
 */
public class Funcion6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int precio;

        System.out.println("Introduce 5 precios");

        for (int i = 0; i < 5; i++) {

            precio = entrada.nextInt();
            System.out.println("El precio con iva es de " + precioConIVA(precio));

        }

    }

    public static double precioConIVA(int precio) {

        double conIva;

        conIva = precio + (precio * 0.21);

        return conIva;

    }

}
