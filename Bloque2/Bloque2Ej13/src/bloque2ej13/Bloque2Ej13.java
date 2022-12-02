/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque2ej13;

import java.util.Scanner;

/**
 * Ejercicio13-Desenvolupa un programa que demani 2 números del 1 al 5 i digui
 * si els 2 nombres introduïts són primers.
 *
 *
 * @author Aaron Monterroso Segura 12/10/2022
 */
public class Bloque2Ej13 {

    public static void main(String[] args) {

        int numero, numero2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 5:");
        numero = entrada.nextInt();

        System.out.println("Introduce otro numero del 1 al 5:");
        numero2 = entrada.nextInt();

        if (numero < 0 || numero > 5) {

            System.out.println("Error no operamos con esos numeros");

        } else if (numero == 4) {
            System.out.println("El numero "+numero+" no es primo ");
        } else if(numero == 1 || numero == 2 || numero == 3 || numero == 5) {
            System.out.println("El numero "+numero+" es primo");
        }
        
        if (numero2 < 0 || numero2 > 5) {

            System.out.println("Error no operamos con esos numeros");

        } else if (numero2 == 4) {
            System.out.println("El numero "+numero2+" no es primo ");
        } else if(numero2 == 1 || numero2 == 2 || numero2 == 3 || numero2 == 5) {
            System.out.println("El numero "+numero2+" es primo");
        }
        
       

    }

}
