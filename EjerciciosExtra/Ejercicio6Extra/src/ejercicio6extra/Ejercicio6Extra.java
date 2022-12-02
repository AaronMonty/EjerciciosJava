/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6extra;

import java.util.Scanner;

/**
 * Ejercicio6- Un alumne desitja saber com serà la seva qualificació final en la
 * matèria de programació. Aquesta qualificació es compon de tres exàmens
 * parcials i es realitza una mitjana aritmètica.
 *
 *
 * @author Aaron Monterroso Segura 01/09/2022
 */
public class Ejercicio6Extra {

    public static void main(String[] args) {

        double mujeres, hombres, porhombres, pormujeres;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce cuantas mujeres hay: ");
        mujeres = entrada.nextDouble();

        System.out.println("Introduce cuantos hombres hay: ");
        hombres = entrada.nextDouble();

        porhombres = hombres / (mujeres + hombres) * 100;
        pormujeres = mujeres / (mujeres + hombres) * 100;

        System.out.println("El porcentaje de hombres que hay es: " + porhombres);

        System.out.println("El porcentaje de mujeres que hay es: " + pormujeres);
    }

}
