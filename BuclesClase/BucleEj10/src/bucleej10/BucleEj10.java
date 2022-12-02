/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej10;

import java.util.Scanner;

/**
 * Realiza un programa que lea una secuencia de notas (con valores que van de 0
 * a 10) que termina con el valor -1 y nos dice si hubo o no alguna nota con
 * valor 10.
 *
 *
 * @author Aaron Monterroso Segura 06/11/2022
 */
public class BucleEj10 {

    public static void main(String[] args) {

        float nota = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce notas y cuando quieras acabar introduce -1");
        boolean encontrado = false;
        do {

            nota = entrada.nextFloat();
            if (nota <= -2 || nota > 10) {

                System.out.println("Notas incorrectas (Para cerrar el programa ponga -1)");

            } else if (nota == 10) {

                encontrado = true;
            }

        } while (nota != -1);

        if (encontrado) {

            System.out.println("Encontre notas con valor igual a 10");

        } else {

            System.out.println("No encontre notas igual a 10");
        }

    }

}
