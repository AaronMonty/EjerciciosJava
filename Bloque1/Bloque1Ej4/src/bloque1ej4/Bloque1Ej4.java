/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque1ej4;

import java.util.Scanner;

/**
 * Ejercicio4-Donades la base i l'altura d'un rectangle per part de l'usuari,
 * crea un programa que calculi la seva àrea (Àrea = Base * Altura).
 *
 *
 * @author Aaron Monterroso Segura 06/10/2022
 */
public class Bloque1Ej4 {

    public static void main(String[] args) {

        float altura, base, area;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la altura: ");
        altura = entrada.nextFloat();

        System.out.println("Introduce la base: ");
        base = entrada.nextFloat();

        area = base * altura;

        System.out.println("El area del rectangulo es " + area);
    }

}
