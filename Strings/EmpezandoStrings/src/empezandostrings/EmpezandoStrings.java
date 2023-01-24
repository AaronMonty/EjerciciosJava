/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empezandostrings;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura
 */
public class EmpezandoStrings {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String palabra = "Una lista de palabras";
        String pregunta = entrada.nextLine();
        System.out.println(palabra.charAt(2));
        System.out.println(palabra.indexOf('l')); //Para buscar una letra
        System.out.println(palabra == pregunta);
        System.out.println(pregunta.length());

        String palabra2 = "2";
        String palabra3 = "abc";
        String palabra4 = palabra2 + palabra3;
        System.out.println("palabra: " + palabra);
        System.out.println("palabra4: " + palabra4);
        
        if (palabra.equals(palabra4)) {
            System.out.println("Es correcto");
        } else {
            System.out.println("INCORRECTO");
        }
        
    }
    
}
