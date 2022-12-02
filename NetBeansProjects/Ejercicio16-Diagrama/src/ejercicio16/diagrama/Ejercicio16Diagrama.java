/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16.diagrama;

import java.util.Scanner;

/**
 * Ejercicio16-que lea una calificación numérica entre 0 y 10 y la transforma en
 * calificación alfabética, escribiendo el resultado.
 *  de 0 a <3 Muy Deficiente.
•   de 3 a <5 Insuficiente.
•   de 5 a <6 Bien.
•   de 6 a <9 Notable
•   de 9 a 10 Sobresaliente
 * @author Aaron Monterroso 26/09/2022
 */
public class Ejercicio16Diagrama {

    public static void main(String[] args) {

        float nota;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una nota");
        nota = entrada.nextFloat();

        if (nota <= -0.1) {
            System.out.println("No se pueden numeros negativos");
        } else if (nota <= 3) {
            System.out.println("Tu nota es muy deficiente");
        } else if (nota <= 5) {
            System.out.println("Tu nota es un Insuficiente");
        } else if (nota <= 6) {
            System.out.println("Tu nota es un Bien");
        } else if (nota <= 9) {
            System.out.println("Tu nota es un Notable");
        } else if (nota <= 10) {
            System.out.println("Tu nota es de SobreSaliente");
        } else {
            System.out.println("No se pueden numeros mayores a 10");
        }
        
    }

}
