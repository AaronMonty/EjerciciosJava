/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10.diagrama;

import java.util.Scanner;

/**
 * Ejercicio10-que lee dos números, calcula y muestra el valor de su suma,
 * resta, producto y división. (Ten en cuenta la división por cero )
 *
 * @author Aaron Monterroso Segura 25/09/2022
 */
public class Ejercicio10Diagrama {

    public static void main(String[] args) {

        double numero1, numero2, suma, resta, division, producto;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        numero1 = entrada.nextDouble();
        System.out.println("Introduce otro numero: ");
        numero2 = entrada.nextDouble();

        suma = numero1 + numero2;

        System.out.println("La suma es: " + suma);

        resta = numero1 - numero2;

        System.out.println("La resta es: " + resta);

        producto = numero1 * numero2;

        System.out.println("El resultado de la multiplicacion es: " + producto);

        if (numero2 == 0) {
            System.out.println("No se puede dividir entre 0");

        } else {
            division = numero1 / numero2;
            System.out.println("La division es: " + division);
        }

    }

}
