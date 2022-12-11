/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion13;

import java.util.Scanner;

/**
 * Realiza un programa que calcule el porcentaje de descuento que nos han hecho
 * al comprar algo. Se debe solicitar la cantidad sin descuento y la cantidad
 * con el descuento aplicado. Se debe crear una función a la que le pasemos
 * ambos valores y nos devuelva el descuento
 *
 *
 *
 * @author Aaron Monterroso Segura 28/11/2022
 */
public class Funcion13 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float sinDescuento, conDescuento, descuento;

        System.out.println("Introduce el precio sin descuento");
        sinDescuento = entrada.nextFloat();
        System.out.println("Introduce el precio con descuento");
        conDescuento = entrada.nextFloat();

        descuento = devolverDescuento(conDescuento, sinDescuento);

        System.out.println("El descuento es " + descuento+"%");

    }

    public static float devolverDescuento(float numero1, float numero2) {

        float sobra;

        sobra = (numero2 - numero1);

        return (sobra / numero2) * 100;

    }

}
