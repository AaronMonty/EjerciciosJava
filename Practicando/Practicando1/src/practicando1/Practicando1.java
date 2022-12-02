/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicando1;

import java.util.Scanner;

/**
 *
 * < 1 hora                           ->0'50/min >=1 hora && <2 horas              -> 0,45/min >=2 horas -> 0'30/min
 * Empieza entre las 21:00 y 6:00 -> 5% Juego online -> 5€
 *
 *
 * @author Aaron Monterroso Segura 20/10/2022
 */
public class Practicando1 {

    public static void main(String[] args) {

        float total = 0, minutosTotales, tarifa1, tarifa2, tarifa3, impuestos = 0;

        int horaNocturna, minutosNocturnos;

        boolean juego;

        tarifa1 = 0.5F;
        tarifa2 = 0.4F;
        tarifa3 = 0.3F;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuanto rato has estado en el pc (Introduce en minutos porfavor)");
        minutosTotales = entrada.nextFloat();

        System.out.println("A que hora vas a empezar a usar el ordenador (Formato: Horas y luego Minutos)");
        horaNocturna = entrada.nextInt();
        minutosNocturnos = entrada.nextInt();

        System.out.println("Vas a juegar a un juego online? (Formato (S/N)");
        juego = entrada.next().charAt(0) == 'S';

        if (minutosTotales < 0 || horaNocturna < 0 || minutosNocturnos < 0 || horaNocturna > 23 || minutosNocturnos > 59) {

            System.out.println("Introduce los valores correctos");

        } else {

            if (minutosTotales < 60) {

                total = minutosTotales * tarifa1;

            } else if (minutosTotales >= 60 && minutosTotales < 120) {

                total = minutosTotales * tarifa2;

            } else {

                total = minutosTotales * tarifa3;

            }

            if (juego) {

                total += 5;

            }

            if (horaNocturna > 21 || horaNocturna < 6) {

                impuestos = total * 0.5F;

            }

            System.out.println("Tienes que pagar en total " + total);
            System.out.println("Tus impuestos por horario nocturno son de " + impuestos);
            if (juego) {
                System.out.println("Tu añadido por juego es de 5 euros ");
            }
        }

    }

}
