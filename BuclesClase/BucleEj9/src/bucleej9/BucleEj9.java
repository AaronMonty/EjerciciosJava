/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej9;

/**
 *
 * Realiza un programa que calcule y escriba la suma y el producto de los 10
 * primeros números naturales.
 *
 * @author Aaron Monterroso Segura 05/11/2022
 */
public class BucleEj9 {

    public static void main(String[] args) {

        int acumuladorSuma = 0, acumuladorMult = 1;

        for (int i = 1; i <= 10; i++) {

            acumuladorSuma = acumuladorSuma + i;
            acumuladorMult = acumuladorMult * i;
        }

        System.out.println("El total de la suma es " + acumuladorSuma);
        System.out.println("El total de la multiplicacion es " + acumuladorMult);
    }

}
