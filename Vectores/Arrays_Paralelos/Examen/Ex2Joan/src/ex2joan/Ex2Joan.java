/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2joan;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 16/02/2023
 */
public class Ex2Joan {

    public static void main(String[] args) {
        String frase;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime una frase");
        frase = entrada.nextLine();
        System.out.println("Dime una letra para remplazar");
        char letra = entrada.nextLine().charAt(0);
        System.out.println("Dime una letra nueva para poner");
        char letra2 = entrada.nextLine().charAt(0);

        System.out.println(remplazar(letra, letra2, frase));

    }

    public static String remplazar(char oldChar, char newChar, String s) {

        String resultado = "";
        int contador = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == oldChar) {
                if (contador == 2) {
                    resultado += s.charAt(i);
                } else {
                    resultado += newChar;
                    contador++;
                }
            } else {

                resultado += s.charAt(i);

            }
        }

        return resultado;
    }

}
