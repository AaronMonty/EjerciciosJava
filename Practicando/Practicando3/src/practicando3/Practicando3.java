/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicando3;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 21/10/2022
 */
public class Practicando3 {

    public static void main(String[] args) {

        float precioMinuto, minutos, impuesto = 0.0F, total;

        int dia;

        char turno;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantos minutos duro la llamada?");
        minutos = entrada.nextFloat();

        System.out.println("Que dia hiciste la llamada?");
        dia = entrada.nextInt();

        System.out.println("Que turno es (Mañana=M o Tarde=T)");
        turno = entrada.next().charAt(0);
        if (minutos < 0) {

            System.out.println("Error, solo se pueden minutos positivos");

        } else {

            if (minutos <= 5) {

                total = minutos * 1;

            } else if (minutos <= 8) {

                total = minutos * 0.8F;
            } else if (minutos <= 10) {

                total = minutos * 0.7F;

            } else {

                total = minutos * 0.5F;
            }

            if (dia == 7) {

                impuesto = minutos * 0.03F;

            } else if (turno == 'M') {

                impuesto = minutos * 0.15F;
            } else {

                impuesto = minutos * 0.10F;
            }

            System.out.println("El precio de la llamada es de " + total);
            if (dia == 7) {
                System.out.println("Los impuestos son de " + impuesto);
            } else if (turno == 'M') {
                System.out.println("Los impuestos son de " + impuesto);
            } else {
                System.out.println("Los impuestos son de " + impuesto);

            }
        }

    }

}
