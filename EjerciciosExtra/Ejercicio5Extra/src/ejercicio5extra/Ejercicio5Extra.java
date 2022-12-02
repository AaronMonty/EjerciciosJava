/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5extra;

import java.util.Scanner;

/**
 * Ejercicio5- Un alumne desitja saber com serà la seva qualificació final en la
 * matèria de programació. Aquesta qualificació es compon de tres exàmens
 * parcials i es realitza una mitjana aritmètica.
 *
 *
 * @author Aaron Monterroso Segura 01/09/2022
 */
public class Ejercicio5Extra {

    public static void main(String[] args) {

        double nota1, nota2, nota3, notafinal;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la nota del primer examen: ");
        nota1 = entrada.nextDouble();

        System.out.println("Introduce la nota del segundo examen: ");
        nota2 = entrada.nextDouble();

        System.out.println("Introduce la nota del tercer examen: ");
        nota3 = entrada.nextDouble();

        notafinal = (nota1 + nota2 + nota3) / 3;

        System.out.println("La nota de la materia programacion es: " + notafinal);
    }

}
