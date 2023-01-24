/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5joan;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura
 */
public class Ej5Joan {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime una frase palindroma");
        String fraseOriginal = entrada.nextLine();
        fraseOriginal = fraseOriginal.toUpperCase();
        int i = 0;
        int j = fraseOriginal.length() - 1;
        boolean acabado = false;
        boolean palindromo = false;

        while (!acabado) {
            char letraIzquierda = fraseOriginal.charAt(i);
            char letraDerecha = fraseOriginal.charAt(j);
            if (i == j || i > j) {
                acabado = true;
                palindromo = true;
            } else if (letraIzquierda == ' ') {
                i++;
            } else if (letraDerecha == ' ') {
                j--;
            } else if (letraIzquierda != letraDerecha) {
                acabado = true;
                palindromo = false;
            } else {
                i++;
                j--;
            }
        }
        if (palindromo) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }
    }
}
