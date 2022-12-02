/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17extra;

import java.util.Scanner;

/**
 * Ejercicio17-Desenvolupa un programa que demani dos números a l'usuari i
 * posteriorment escrigui els dos números ordenats de manera creixent (de menor
 * a major). Ex: Si els números són 3 i 2 => el resultat serà 2 3
 *
 *
 * @author Aaron Monterroso Segura 02/10/2022
 */
public class Ejercicio17Extra {

    public static void main(String[] args) {

        int numero1,numero2;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        numero1 = entrada.nextInt();
        
        System.out.println("Introduce el segundo numero: ");
        numero2 = entrada.nextInt();
        
        if (numero1 > numero2) {
            System.out.println("El orden es " + numero2 + " y " + numero1);
        } else {
            System.out.println("El orden es " + numero1 + " y " + numero2);
        }
        
    }

}
