/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7.diagrama;

import java.util.Scanner;

/**
 * Ejercicio7- que lea un valor correspondiente a una distancia en millas
 * marinas y escriba la distancia en metros. Sabiendo que una milla marina
 * equivale a 1.852 metros
 *
 * @author Aaron Monterroso Segura 25/09/2022
 */
public class Ejercicio7Diagrama {

    public static void main(String[] args) {

        int millas;
        int metros;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce las millas");
        millas = entrada.nextInt();

        metros = millas * 1852;

        System.out.println("El resultado es: " + metros + " metros");

    }

}
