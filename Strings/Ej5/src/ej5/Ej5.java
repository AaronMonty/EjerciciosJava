/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura
 */
public class Ej5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre");
        String nombre = entrada.nextLine();
        String mayus;
        mayus = nombre.toUpperCase();

        for (int i = 0; i < mayus.length(); i++) {

            if (mayus.charAt(i)=='A'||mayus.charAt(i)=='E'||mayus.charAt(i)=='I'||mayus.charAt(i)=='O'||mayus.charAt(i)=='U') {
                
            }else{
            
                
            }
            

        }

    }

    
 

}
