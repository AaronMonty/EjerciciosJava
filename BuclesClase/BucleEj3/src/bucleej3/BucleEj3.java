/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej3;

/**
 *
 * Realiza un programa que muestre los números pares comprendidos entre el 1 y
 * el 200. Esta vez utiliza un contador sumando de 1 en 1.
 *
 * @author Aaron Monterroso Segura 03/11/2022
 */
public class BucleEj3 {

    public static void main(String[] args) {

        for (int i = 2; i <= 200; i++) {

            if (i % 2 == 0) {

                System.out.println("El numero "+i+" es par ");

            }

        }
        
        

    }

}
