/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solucionexamen;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura
 */
public class SolucionExamen {

    public static void main(String[] args) {

        float minutos, cobro, total = 0, impuestos = 0;
        boolean juegoOnline;
        int hora, minutosHorarioNocturno;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantos minutos has estado");
        minutos = entrada.nextFloat();
        System.out.println("Es un juego online? (Si=S o No=N)");

        entrada.nextLine();
        juegoOnline = entrada.next().charAt(0) == 'S';

        System.out.println("Dame la hora y los minutos (Formato: Horas y Minutos)");
        hora = entrada.nextInt();
        minutosHorarioNocturno = entrada.nextInt();

        if (minutos < 0 || hora < 0 || hora > 23 || minutosHorarioNocturno > 59) {

            System.out.println("Error,Datos incorrectos");

        } else {

            if (minutos < 60) {

                cobro = minutos * 0.50F;

            } else if (minutos >= 60 && minutos < 120) {

                cobro = minutos * 0.45F;

            } else {

                cobro = minutos * 0.30F;
            }

            total += cobro;

            if (juegoOnline) {

                total += 5.0f;

            }

            if (hora >= 21 || hora < 6) {

                impuestos = cobro * 0.05F;

                total += impuestos;

            }

            System.out.println("Tienes que pagar en total: " + total);

            System.out.println("Tus impuestos por horario nocturno son: " + impuestos);

            if (juegoOnline) {

                System.out.println("Tu añadido por juego es de: 5€");

            }
        }

    }

}
