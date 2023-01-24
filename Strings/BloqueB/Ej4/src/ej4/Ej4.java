/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura
 */
public class Ej4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase;
        System.out.println("Dime una frase y te contare todas las vocales");
        frase = entrada.nextLine();
        decirVocales(frase);

//        //Parte Joan
//        String fraseJoan = entrada.nextLine();
//        int conA = 0, conE = 0, conI = 0, conO = 0, conU = 0;
//        for (int i = 0; i < fraseJoan.length(); i++) {
//            char letra = frase.charAt(i);
//
//            switch (letra) {
//                case 'A':
//                case 'a':
//                    conA++;
//                    break;
//                case 'E':
//                case 'e':
//                    conE++;
//                    break;
//                case 'I':
//                case 'i':
//                    conI++;
//                    break;
//                case 'O':
//                case 'o':
//                    conO++;
//                    break;
//                case 'U':
//                case 'u':
//                    conU++;
//                    break;
//            }
//
//        }
    }

    public static void decirVocales(String frase) {
        int a = 0, e = 0, I = 0, o = 0, u = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letraActual = frase.charAt(i);
            switch (letraActual) {
                case 'A':
                case 'a':
                    a++;
                    break;
                case 'E':
                case 'e':
                    e++;
                    break;
                case 'I':
                case 'i':
                    I++;
                    break;
                case 'O':
                case 'o':
                    o++;
                    break;
                case 'U':
                case 'u':
                    u++;
                    break;
            }
        }
        System.out.println("Hay Numero de A's: " + a + "\nHay numero de E's: " + e + "\nHay Numero de I's: " + I + "\nHay Numero de O's: " + o + "\nHay Numero de U's:" + u);
    }
}
