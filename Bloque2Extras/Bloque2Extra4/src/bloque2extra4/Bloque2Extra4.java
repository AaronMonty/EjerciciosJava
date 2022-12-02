/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque2extra4;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Ejercicio4-Diseña y codifica un programa que, dado el año, nos diga si es
 * bisiesto. Un año es bisiesto si es divisible por 4 pero no lo es por 100 a no
 * ser que sea divisible por 400. Por ejemplo, el 2000 y el 2004 fueron
 * bisiestos pero el 2100, 2200 y 2300 no lo serán. El 2400 volverá a ser
 * bisiesto.
 *
 * @author Aaron Monterroso Segura 14/10/2022
 */
public class Bloque2Extra4 {

    public static void main(String[] args) {

        int anio;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el anio");

        anio = entrada.nextInt();

        GregorianCalendar calendar = new GregorianCalendar();

        if (calendar.isLeapYear(anio)) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No lo es");
        }

    }

}
