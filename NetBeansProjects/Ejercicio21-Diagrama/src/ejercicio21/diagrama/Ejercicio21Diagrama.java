/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21.diagrama;

import java.util.Scanner;

/**
 * Ejercicio21- Realitza el mateix que el programa anterior però si escrius la
 * lletra amb majúscula o amb minúscula te l’ha d’acceptar
 *
 * @author Aaron Monterroso Segura
 */
public class Ejercicio21Diagrama {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String carta;

        System.out.println("Elige entre 2 cartas: (M=Mago Electrico || E=Esbirro)");

        carta = entrada.nextLine();

        if (carta.equalsIgnoreCase("m")) {
            System.out.println("Elegiste al Mago Electrico");
        } else if (carta.equalsIgnoreCase("e")) {
            System.out.println("Elegiste al Esbirro");
        } else {
            System.out.println("Valor incorrecto");
        }

    }

}
