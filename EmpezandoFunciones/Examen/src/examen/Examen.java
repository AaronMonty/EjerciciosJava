/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Aaron Monterroso Segura 19/22/2022
 */
public class Examen {

    public static int puntosJ1;
    public static int puntosMaquina;

    public static void main(String[] args) {
        puntosJ1 = 0;
        puntosMaquina = 0;
        boolean seguirJugando = true;
        while (seguirJugando) {

            while (puntosJ1 < 3 && puntosMaquina < 3) {

                boolean respuesta, ganador;
                int dedosJugador, dedosMaquina;
                respuesta = preguntarParesONones(true);
                dedosJugador = turnoJugador();
                dedosMaquina = turnoMaquina(6);
                System.out.println("Los dedos que saco el ordenador son " + dedosMaquina);
                ganador = decidirGanador(dedosJugador, dedosMaquina, respuesta);
                if (ganador == true) {
                    puntosJ1++;
                } else {
                    puntosMaquina++;
                }
                System.out.println("Tus puntos son " + puntosJ1);
                System.out.println("Los puntos del ordenador son " + puntosMaquina);
                if (puntosJ1 == 3) {
                    mostrarPantallaVictoria();
                } else {
                    mostrarPantallaDerrota();
                }

            }

        }

    }

    public static boolean preguntarParesONones(boolean paresONones) {
        Scanner entrada = new Scanner(System.in);
        int resultado;
        System.out.println("Pares o Nones? (Pares=1 || Nones=2)");
        resultado = entrada.nextInt();

        while (resultado != 1 && resultado != 2) {

            System.out.println("Opcion incorrecta\nVuelva a elegir (1-Pares 2-Nones)");
            resultado = entrada.nextInt();
        }
        if (resultado == 1) {
            paresONones = true;
        } else if (resultado == 2) {
            paresONones = false;
        }
        return paresONones;
    }

    public static int turnoJugador() {
        int dedos;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantos dedos has escondido con 1 mano? (Del 1 al 5)");
        dedos = entrada.nextInt();
        while (dedos != 1 && dedos != 2 && dedos != 3 && dedos != 4 && dedos != 5) {

            System.out.println("Incorrecto\nVuelva a elegir entre (1 al 5)");
            dedos = entrada.nextInt();
        }
        return dedos;

    }

    public static int turnoMaquina(int numAleatorio) {

        Random aleatorio = new Random();

        numAleatorio = aleatorio.nextInt(0, 6);

        return numAleatorio;

    }

    public static void mostrarPantallaVictoria() {

        System.out.println("Enhorabuena has Ganado");

    }

    public static void mostrarPantallaDerrota() {

        System.out.println("Has Perdido");

    }

    public static boolean decidirGanador(int dedosJ1, int dedosMaquina, boolean paresONones) {

        int sumaDedos;
        sumaDedos = dedosJ1 + dedosMaquina;
        boolean resultado;
        if (sumaDedos % 2 == 0) {
            if (paresONones == true) {
                resultado = true;

            } else {
                resultado = false;
            }
        } else {
            if (paresONones == true) {
                resultado = false;
            } else {

                return resultado = true;
            }
        }
        return resultado;
    }

    public static boolean seguirJugando(boolean jugar) {
        char letra;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quieres seguir jugando ? S/N");
        letra = entrada.nextLine().charAt(0);

        if (letra == 'S') {
            jugar = true;
        } else if (letra == 'N') {
            jugar = false;
        }

        return jugar;
    }

}
