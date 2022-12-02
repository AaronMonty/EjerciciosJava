/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque2extra1;

import java.util.Scanner;

/**
 * Ejercicio1- En una tienda de descuento se efectúa una promoción en la cual se
 * hace un descuento sobre el valor de la compra total según el color de la
 * bolita que el cliente saque al pagar en caja. Si la bolita es de color blanco
 * no se le hará descuento alguno, si es verde se le hará un 10% de descuento,
 * si es amarilla un 25%, si es azul un 50% y si es roja un 100%. Determinar la
 * cantidad final que el cliente deberá pagar por su compra se sabe que solo hay
 * bolitas de los colores mencionados.
 *
 *
 * @author Aaron Monterroso Segura 13/10/2022
 */
public class Bloque2Extra1 {

    public static void main(String[] args) {

        float compra, descuento;

        String color, blanco, verde, amarillo, azul, roja;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuanto le ha costado la compra?");
        compra = entrada.nextFloat();

        System.out.println("De que color le toco la bola?");
        color = entrada.next();

        if (color.equalsIgnoreCase("blanco")) {
            System.out.println("Su compra es de " + compra + " porque no tiene descuento");
        } else if (color.equalsIgnoreCase("verde")) {

            descuento = compra * 0.1F;

            compra = compra - descuento;

            System.out.println("Su compra es de " + compra + " porque tiene un 10% de descuento");

        } else if (color.equalsIgnoreCase("amarillo")) {

            descuento = compra * 0.25F;

            compra = compra - descuento;

            System.out.println("Su compra es de " + compra + " porque tiene un 25 % de descuento");

        } else if (color.equalsIgnoreCase("azul")) {

            descuento = compra * 0.50F;

            compra = compra - descuento;

            System.out.println("Su compra es de " + compra + " porque tiene un 50% de descuento");
        } else if (color.equalsIgnoreCase("roja")) {

            System.out.println("!!! Enhorabuena su compra es totalmente gratuita");
        } else {

            System.out.println("Introduciste un color que no esta");
        }

    }

}
