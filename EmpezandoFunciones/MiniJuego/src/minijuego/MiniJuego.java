/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minijuego;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Aaron Monterroso Segura y Javi Lopez Lozano
 */
public class MiniJuego {

    public static int vidas;

    public static void main(String[] args) {
        boolean seguirJugando = true;
        while (seguirJugando) {
            VidasDificultad();
            boolean vivo = true;
            int rondas = 4;
            while (vivo && rondas > 0) {
                System.out.println("Ronda: " + (5 - rondas));
                GenerarPantalla();
                vivo = vidas > 0;
                rondas--;
            }
            if (vivo) {
                Victoria();
            } else {
                Derrota();
            }

        }
    }

    public static void VidasDificultad() {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Elige la Dificultad\n1.Facil\n2.Media\n3.Dificil");

        do {
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    vidas = 10;
                    System.out.println("Elegiste la opcion Facil, tienes " + vidas + " vidas");
                    break;
                case 2:
                    vidas = 20;
                    System.out.println("Elegiste la opcion Media, tienes " + vidas + " vidas");
                    break;
                case 3:
                    vidas = 30;
                    System.out.println("Elegiste la opcion Dificil, tienes " + vidas + " vidas");
                    break;
                default:
                    System.out.println("Error,vuelva a elegir");

            }
        } while (opcion < 1 || opcion > 3);

    }

    public static void GenerarPantalla() {

        if (GenerarNumeroAleatorio(0, 1) == 0) {
            PantallaDisparos();
        } else {
            PantallaPuzzle();
        }
    }

    public static int GenerarNumeroAleatorio(int min, int max) {

        Random aleatorio = new Random();

        int numero = aleatorio.nextInt(min = 1, max = 3);

        return numero;

    }

    public static void PantallaDisparos() {
        int malos = 0;
        for (int i = 0; i <= 10; i++) {
            if (GenerarNumeroAleatorio(0, 1) == 0) {
                malos++;
                System.out.println("M");
            } else {
                System.out.println(".");
            }
        }
        System.out.println("Cuantos malos hay");
        Scanner entrada = new Scanner(System.in);
        int respuesta = entrada.nextInt();
        if (respuesta < 0) {
            System.out.println("Te han dados todos");
            vidas -= malos;
        } else if (respuesta > malos) {
            System.out.println("has gastado muchas balas");
            vidas = vidas - malos;
        }
    }

    public static void PantallaPuzzle() {
        int respuesta = GenerarNumeroAleatorio(1, 25);
        System.out.println("Cuanto es la raiz cuadrada de " + respuesta * respuesta);

        Scanner entrada = new Scanner(System.in);
        if (respuesta == entrada.nextInt()) {
            System.out.println("Correcto");
        } else {
            System.out.println("Has fallado");
            if (vidas % 2 == 0) {
                vidas /= 2;
            } else {
                vidas = vidas - (vidas / 2 + 1);
            }
            System.out.println("Te quedan " + vidas + " vidas ");
        }
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

    public static void Victoria() {

        System.out.println("Victoria");
    }

    public static void Derrota() {
        System.out.println("Derrota");
    }

}
