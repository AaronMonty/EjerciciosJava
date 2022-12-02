/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;

/**
 * Ejercicio 20- Realitzarem el mateix programa però per elegir en lloc de ficar
 * una opció numèrica, has de ficar la primera lletra del personatge amb
 * minúscula (m, e)
 *
 * @author Prueba
 */
public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String carta;

        System.out.println("Elige entre 2 cartas: (M=Mago Electrico || E=Esbirro)");

        carta = entrada.nextLine();

        if (carta.equals("m")) {
            System.out.println("Elegiste al Mago Electrico");
        } else if (carta.equals("e")) {
            System.out.println("Elegiste al Esbirro");
        } else {
            System.out.println("Valor incorrecto");
        }

    }

}
