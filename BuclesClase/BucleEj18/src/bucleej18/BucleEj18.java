/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej18;

import java.util.Scanner;

/**
 *
 * Realiza un programa para calcular la suma de los cuadrados de los 5 primeros
 * números naturales.
 *
 * @author Aaron Monterroso Segura 14/11/2022
 */
public class BucleEj18 {

    public static void main(String[] args) {

        int numeros, acumulador = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero");
        numeros = entrada.nextInt();

        for (int i = 2; i < numeros; i++) {

            acumulador += i * i;

        }
        
        System.out.println("la suma es " + acumulador);
                
    }

}
