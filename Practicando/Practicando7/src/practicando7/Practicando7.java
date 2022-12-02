/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicando7;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 24/10/2022
 */
public class Practicando7 {

    public static void main(String[] args) {
        //Declarando Variables
        int dia, mes, any;

        Scanner entrada = new Scanner(System.in);

        //Pidiendo datos al usuario 
        System.out.println("Dime tu fecha de nacimiento");
        System.out.println("El dia");
        dia = entrada.nextInt();
        System.out.println("El mes");
        mes = entrada.nextInt();
        System.out.println("El any");
        any = entrada.nextInt();

        //Comprobando Errores
        if (dia < 0 || dia > 31 || mes < 0 || mes > 12 || any < 0 || any < 1900) {

            System.out.println("Porfavor introduce los valores correctos, no se puede esta fecha" + dia + "/" + mes + "/" + any);

        } else {

            //Comparando cada caso
            switch (mes) {
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    if (dia >= 1 && dia <= 31) {
                        System.out.println("FECHA CORRECTA");
                    } else {
                        System.out.println("FECHA INCORRECTA");
                    }
                }
                case 4, 6, 9, 11 -> {
                    if (dia >= 1 && dia <= 30) {
                        System.out.println("FECHA CORRECTA");
                    } else {
                        System.out.println("FECHA INCORRECTA");
                    }
                }
                case 2 -> {
                    if (any % 4 == 0 && any % 100 != 0 || any % 400 == 0) {
                        if (dia >= 1 && dia <= 29) {
                            System.out.println("FECHA CORRECTA");
                        } else {
                            System.out.println("FECHA INCORRECTA");
                        }
                    }
                }
            }

        }

    }

}
