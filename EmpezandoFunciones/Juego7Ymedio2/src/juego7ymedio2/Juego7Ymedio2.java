/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego7ymedio2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso
 */
public class Juego7Ymedio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero_jugador, palo_jugador, numero_banca, palo_banca, bancaquierejugar = 0;
        char jugar;

        float puntuacion_jugador, puntuacion_banca;

        numero_jugador = numero_carta_aleatorio();

        palo_jugador = palo_de_carta_aleatori();

        numero_banca = numero_carta_aleatorio();

        palo_banca = palo_de_carta_aleatori();

        Imprimir_carta(numero_jugador, palo_jugador);

        Imprimir_carta(numero_banca, palo_banca);

        puntuacion_jugador = punts_carta(numero_jugador);

        puntuacion_banca = punts_carta(numero_banca);

        

            System.out.println("Quieres seguir jugando ? (S/N)");
            jugar = entrada.nextLine().charAt(0);
            bancaquierejugar = banca_pide_carta(numero_jugador, numero_banca);
            while (jugar != 'S' && jugar != 'N') {

                System.out.println("Te equivocaste, introduzca S o N");
                jugar = entrada.nextLine().charAt(0);
            }

            if (jugar == 'S' && bancaquierejugar == 1) {

                int carta_jugador, carta_banca;

                carta_jugador = numero_carta_aleatorio();

                carta_banca = numero_carta_aleatorio();

                numero_jugador += carta_jugador;
                numero_banca += numero_jugador;

            }
        
        if (jugar == 'N' || bancaquierejugar == 0) {

            System.out.println("Hola");

        }

    }

    public static int numero_carta_aleatorio() {

        Random aleatorio = new Random();

        int carta = aleatorio.nextInt(1, 11);

        return carta;

    }

    public static int palo_de_carta_aleatori() {

        Random aleatorio = new Random();

        int palo = aleatorio.nextInt(1, 5);

        return palo;
    }

    public static void Imprimir_carta(int carta, int pal) {
        String tipo = "0";
        switch (pal) {
            case 1:
                tipo = "OROS";
                break;
            case 2:
                tipo = "BASTOS";
                break;
            case 3:
                tipo = "ESPADAS";
                break;
            case 4:
                tipo = "COPAS";
                break;

        }

        System.out.println("Carta: " + carta + " de " + tipo);

    }

    public static float punts_carta(int carta) {
        float puntuacion = 0;
        switch (carta) {
            case 1:
                puntuacion = 1;
                break;
            case 2:
                puntuacion = 2;

                break;
            case 3:
                puntuacion = 3;

                break;
            case 4:
                puntuacion = 4;

                break;
            case 5:
                puntuacion = 5;

                break;
            case 6:
                puntuacion = 6;

                break;
            case 7:
                puntuacion = 7;

                break;
            case 8:
                puntuacion = 0.5F;

                break;
            case 9:
                puntuacion = 0.5F;

                break;
            case 10:
                puntuacion = 0.5F;

                break;

        }

        return puntuacion;
    }

    public static int banca_pide_carta(int puntosjugador, int puntosbanca) {

        if (puntosjugador <= 7.5 && puntosbanca < puntosjugador || puntosbanca < 5) {
            return 1;
        } else {
            return 0;
        }

    }

    public static int guanya_jugador(int puntosjugador, int puntosbanca) {

        if (puntosjugador <= 7.5 && puntosjugador > puntosbanca || puntosbanca > 7.5) {
            return 1;
        } else {
            return 0;
        }

    }

}
