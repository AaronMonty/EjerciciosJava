/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 20/10/2022
 */
public class Examen {

    public static void main(String[] args) {

        float tiempo, precioMinuto, tarifa = 5;

        int hora, minutos;

        char uso;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantos tiempo estuviste en el ordenador");
        tiempo = entrada.nextFloat();

        System.out.println("Dime la hora a la que vas a empezar a usar el ordenador");
        hora = entrada.nextInt();

        System.out.println("Dime los minutos");
        minutos = entrada.nextInt();

        System.out.println("Vas a usar el ordenador para jugar (Si=S o No=N)");
        uso = entrada.next().charAt(0);

        if (tiempo <= 0 && hora < 0 && minutos < 0) {

            System.out.println("Lo sentimos solo se pueden numeros positivos");
        } else if (uso != 'S' && uso != 'N') {

            System.out.println("Opcion incorrecta solo puedes elegir (Si=S o No=N)");

        }

        if (tiempo < 60) {

            if (hora >= 21 && hora <= 6 && minutos >= 00 && minutos <= 59) {

                precioMinuto = tiempo * 0.50F + 0.05F;

                System.out.println("El total seria de " + precioMinuto);

            } else if (uso == 'S') {

                precioMinuto = tiempo * 0.50F + 5;

                System.out.println("El total seria de " + precioMinuto);

            } else {

                precioMinuto = tiempo * 0.50F;

                System.out.println("El total seria de " + precioMinuto);
            }

        } else if (tiempo < 120) {

            if (hora >= 21 && hora <= 6 && minutos >= 00 && minutos <= 59) {

                precioMinuto = tiempo * 0.45F;

                System.out.println("El total seria de " + precioMinuto);

            } else if (uso == 'S') {
                precioMinuto = tiempo * 045F + 5;

                System.out.println("El total seria de " + precioMinuto);
            } else {

                precioMinuto = tiempo * 0.45F;

                System.out.println("El total seria de " + precioMinuto);

            }

        } else {

            if (hora >= 21 && hora <= 6 && minutos >= 00 && minutos <= 59) {

                precioMinuto = tiempo * 0.30F;

                System.out.println("El total seria de " + precioMinuto);

            } else if (uso == 'S') {

                precioMinuto = tiempo * 0.35F + 5;

                System.out.println("El total seria de " + precioMinuto);
            } else {

                precioMinuto = tiempo * 0.35F;

                System.out.println("El total seria de " + precioMinuto);

            }

        }

    }

}
