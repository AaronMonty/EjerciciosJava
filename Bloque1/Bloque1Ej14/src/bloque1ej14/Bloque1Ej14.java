/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque1ej14;

import java.util.Scanner;

/**
 * Ejercicio14-Escriu un programa que donada la quantitat de monedes de
 * 1-5-10-25-50 cèntims d'euro i 1 €, digui la quantitat de diners que es té en
 * total.
 *
 *
 * @author Aaron Monterroso Segura
 */
public class Bloque1Ej14 {

    public static void main(String[] args) {

        int unEuro, cincuentaCent, veinteCent, diezCent, cincoCent, unCent, total, euros, centimos;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantas monedas tienes de 1 euro: ");
        unEuro = entrada.nextInt();

        System.out.println("Cuantas monedas tienes de 50 centimos: ");
        cincuentaCent = entrada.nextInt();

        System.out.println("Cuantas monedas tienes de 20 centimos: ");
        veinteCent = entrada.nextInt();

        System.out.println("Cuantas monedas tienes de 10 centimos: ");
        diezCent = entrada.nextInt();

        System.out.println("Cuantas monedas tienes de 5 centimos : ");
        cincoCent = entrada.nextInt();

        System.out.println("Cuantas monedas tienes de 1 centimo: ");
        unCent = entrada.nextInt();

        total = unEuro * 100 + cincuentaCent * 50 + veinteCent
                * 20 + diezCent * 10 + cincoCent * 5 + unCent * 1;

        euros = total / 100;

        centimos = total % 100;

        System.out.println("Tienes " + euros + " euros" + " con " + centimos + " centimos");

    }


}
