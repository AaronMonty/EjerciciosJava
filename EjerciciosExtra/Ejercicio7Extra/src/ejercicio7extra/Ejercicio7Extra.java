/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7extra;

import java.util.Scanner;

/**
 * Ejercicio7- Calcular el nou salari d'un obrer si va obtenir un increment del
 * 25% sobre el seu salari anterior.
 *
 *
 * @author Aaron Monterroso Segura 01/10/2022
 */
public class Ejercicio7Extra {

    public static void main(String[] args) {

        double salarioant, nuevosalario, incremento;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Cual es tu salario anterior: ");
        salarioant = entrada.nextDouble();

        incremento = salarioant * 0.25;

        nuevosalario = salarioant + incremento;

        System.out.println("Tu nuevo salario con el 25% incrementado es de: " + nuevosalario);
    }

}
