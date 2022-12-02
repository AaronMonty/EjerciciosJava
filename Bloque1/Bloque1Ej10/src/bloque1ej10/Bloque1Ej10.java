/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque1ej10;

import java.util.Scanner;

/**
 * Ejercicio10-Calcula el preu d'un bitllet de viatge, prenent en compte el
 * nombre de quilòmetres que es van a recórrer, sent el preu 10,50 € per Km.
 *
 *
 * @author Aaron Monterroso Segura 06/10/2022
 */
public class Bloque1Ej10 {

    public static void main(String[] args) {

        float km, precioBillete, precioKilometro = 10.50F;

        Scanner entrada = new Scanner(System.in);
        System.out.println("De cuantos KiloMetros es el viaje:");
        km = entrada.nextInt();

        precioBillete = precioKilometro * km;

        System.out.println("El precio del billete es " + precioBillete);

    }

}
