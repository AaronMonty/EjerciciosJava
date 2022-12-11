/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion20;

import java.util.Scanner;

/**
 * Escribe un programa que imprima las tablas de multiplicar del 1 al 10.
 * Implementa una función que reciba un número entero como parámetro e imprima
 * su tabla de multiplicar
 *
 *
 * @author Aaron Monterroso Segura 01/12/2022
 */
public class Funcion20 {

    public static void main(String[] args) {

        decirTabla(0);

    }

    public static void decirTabla(int numero) {

        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + " * " + i + " = " + j * i);
            }
        }

    }

}
