/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 22/01/2023
 */
public class Ej5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase;

        System.out.println("Dime una frase palindroma");
        frase = entrada.nextLine();
        esPalindroma(frase);
    }

    public static void esPalindroma(String p) {
        String fraseReversa = "";
        String frase = p.toLowerCase().trim().replace(" ", "")
                .replace(".", "").replace(",", "").replace("á", "a")
                .replace("é", "e").replace("í", "i").replace("ó", "o")
                .replace("ú", "u");

        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseReversa += frase.charAt(i);
        }

        if (frase.equals(fraseReversa)) {
            System.out.println("la frase es palindroma");
        } else {
            System.out.println("la frase no es palindroma");
        }
    }
}
