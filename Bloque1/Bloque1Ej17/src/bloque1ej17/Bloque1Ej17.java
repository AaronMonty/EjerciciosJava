/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque1ej17;

import java.util.Scanner;

/** Ejercicio20-Llegir 3 nombres enters d'un dígit i emmagatzemar-los en una sola variable que contingui a aquests tres dígits. Per exemple si A=5 i B=6 i C=2, llavors X=562.

 *
 * @author Aaron Monterroso Segura 07/10/2022
 */
public class Bloque1Ej17 {

    public static void main(String[] args) {

        int numero1, numero2, numero3, numeroTotal;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Intoduce el primer numero: ");
        numero1 = entrada.nextInt();

        System.out.println("Introduce el segundo numero: ");
        numero2 = entrada.nextInt();

        System.out.println("Introduce el tercer numero: ");
        numero3 = entrada.nextInt();

        numeroTotal = (numero1 * 100) + (numero2 * 10) + (numero3);

        System.out.println("El numero es " + numeroTotal);

    }

}
