/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque1ej1;

import java.util.Scanner;

/**
 * Ejercicio1-Escriu un programa que demani a l'usuari el nom i l'edat. Després
 * ha de mostrar per pantalla: 'Hola (nom), la teva edat és (edat)';
 *
 *
 * @author Aaron Monterroso Segura
 */
public class Bloque1Ej1 {

    public static void main(String[] args) {

        String nombre;
        int edad;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        nombre = entrada.nextLine();

        System.out.println("Introduce tu edad: ");
        edad = entrada.nextInt();

        System.out.println("Te llamas " + nombre + "y tu edad es " + edad);

    }

}
