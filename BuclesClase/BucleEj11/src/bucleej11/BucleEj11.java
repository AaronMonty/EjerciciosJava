/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej11;

/**
 * Realiza un programa que sume independientemente los pares y los impares de
 * los números comprendidos entre 100 y 200, y luego muestra por pantalla ambas
 * sumas.
 *
 *
 * @author Aaron Monterroso Segura 06/11/2022
 */
public class BucleEj11 {

    public static void main(String[] args) {

        int acumuladorPares = 0, acumuladorImpares = 0;

        for (int i = 100; i <= 200; i++) {

            if (i % 2 == 0) {

                acumuladorPares = acumuladorPares + i;

            } else {

                acumuladorImpares = acumuladorImpares + i;

            }

        }

        System.out.println("La suma de los numeros impares es de " + acumuladorImpares);
        System.out.println("La suma de los numeros pares es de " + acumuladorPares);
    }

}
