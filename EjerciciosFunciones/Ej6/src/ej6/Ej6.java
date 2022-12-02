/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6;

import java.util.Scanner;

/**
 * Escribe un programa que pida cinco precios y muestre por pantalla el precio
 * de venta de cada uno tras aplicarle un 21% de IVA. Implementa y utiliza la
 * función: double precioConIVA(double precio) // Devuelve el precio tras
 * sumarle un 21% de IVA
 *
 *
 * @author Aaron Monterroso Segura 31/10/2022
 */
public class Ej6 {

    public static double precioConIVA(double precio) {

        return (precio * 0.21F);

    }

    public static void main(String[] args) {

        double precioSin, precioCon;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Precio sin IVA: ");
            precioSin = entrada.nextDouble();
            precioCon = precioConIVA(precioSin);
            System.out.println("Precio con IVA: " + precioCon);
        }

    }

}
