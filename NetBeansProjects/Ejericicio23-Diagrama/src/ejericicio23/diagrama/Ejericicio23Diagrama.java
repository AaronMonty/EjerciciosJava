/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericicio23.diagrama;

import java.util.Scanner;

/**
 * Ejercici23-. Augmentarem la dificultat, donant l’opció que si tens més de
 * 3000 cartes, et deixa triar entre el Ejercito de esqueletos, o el Gigante, en
 * lloc de les cartes anteriors, si no superes les 3000 et seguirà preguntant
 * per les opcions de l'exercici anterior
 *
 * @author Aaron Monterroso Segura 03/10/2022
 */
public class Ejericicio23Diagrama {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int copas;

        char cartas;

        System.out.println("Cuantas copas tienes?");

        copas = entrada.nextInt();

        if (copas <= 1999) {

            System.out.println("Elige entre estas 2 cartas (M=Mago Electrico || E=Esbirro)");
            cartas = entrada.next().charAt(0);

            if (cartas == 'M' || cartas == 'm') {
                System.out.println("Elegiste al Mago Electrico");
            } else if (cartas == 'E' || cartas == 'e') {
                System.out.println("Elegiste al Esbirro");
            } else {
                System.out.println("No elegiste ni al Mago Electrico ni al Esbirro");
            }

        } else if (copas >= 2000 || copas <= 2999) {
            System.out.println("Elige entre estas 2 cartas (C=Caballero || B=Bandida)");
            cartas = entrada.next().charAt(0);

            if (cartas == 'C' || cartas == 'c') {
                System.out.println("Elegiste al Caballero");
            } else if (cartas == 'B' || cartas == 'b') {
                System.out.println("Elegiste a la Bandida");
            } else {
                System.out.println("Error no elegiste ni el Caballero ni la Bandida");
            }

            if (copas > 3000) {
                System.out.println("Elige entre estas 2 cartas (E=Ejercito De Esqueletos || G=Gigante)");
                cartas = entrada.next().charAt(0);

                if (cartas == 'E' || cartas == 'e') {
                    System.out.println("Elegiste al Ejercito De Esqueletos");
                } else {
                    System.out.println("Elegiste al Gigante");
                }

            }

        }

    }

}
