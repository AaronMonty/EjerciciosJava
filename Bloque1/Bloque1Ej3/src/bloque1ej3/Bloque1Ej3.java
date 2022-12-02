/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque1ej3;

import java.util.Scanner;

/**
 * Ejercicio3-Modifica l'exercici anterior perquè el percentatge d'IVA sigui
 * variable (introduït per l'usuari).
 *
 *
 * @author Aaron Monterroso Segura 06/10/2022
 */
public class Bloque1Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double precio, totalprecio, iva, ivatotal;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el precio: ");
        precio = entrada.nextDouble();

        System.out.println("Introduce el % de iva");
        iva = entrada.nextDouble();

        System.out.println("El iva sera de " + iva);

        ivatotal = iva * precio;

        System.out.println("El iva que se sumara al precio es de " + ivatotal);

        totalprecio = ivatotal + precio;

        System.out.println("El producto mas el iva es de " + totalprecio);
    }

}
