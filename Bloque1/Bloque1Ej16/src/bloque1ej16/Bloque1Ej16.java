/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque1ej16;

import java.util.Scanner;

/**
 * Ejercicio16-Calcular el nou salari d'un empleat si se li descompta el 20% del
 * seu salari actual.
 *
 *
 * @author Aaron Monterroso Segura 07/10/2022
 */
public class Bloque1Ej16 {

    public static void main(String[] args) {

        float salarioActual, salarioNuevo, descuenta = 0.20F, parteRestante;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuanto has cobrado este mes");
        salarioActual = entrada.nextFloat();

        parteRestante = salarioActual * descuenta;

        salarioNuevo = salarioActual - parteRestante;

        System.out.println("Tu nuevo salario es de " + salarioNuevo);

    }

}
