/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5.diagrama;

import java.util.Scanner;

/**
 * Ejercicio5- que toma como dato de entrada un número que corresponde a la
 * longitud de un radio y nos escribe la longitud de la circunferencia, el área
 * del círculo y el volumen de la esfera que corresponden con dicho radio.
 *
 * @author Aaron Monterroso Segura 25/09/2022
 */
public class Ejercicio5Diagrama {

    public static void main(String[] args) {

        double longitudr, longitudc, area, volumen;
        double P = 3.14;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la longitud del radio");
        longitudr = entrada.nextFloat();

        longitudc = 2 * P * longitudr;
        area = P * Math.pow(longitudr, 2);
        volumen = 4 / 3 * Math.pow(longitudr, 3);
        System.out.println("La longitud de la circuferencia es: " + longitudc);
        System.out.println("El area de la circuferencia es: " + area);
        System.out.println("El volumen de la esfera es: " + volumen);
    }

}
