/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej12;

import java.util.Scanner;

/**
 *
 * Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer uso
 * del operador de potencia (^), siendo A y B valores introducidos por teclado,
 * y luego muestre el resultado por pantalla.
 *
 *
 * @author Aaron Monterroso Segura 06/11/2022
 */
public class BucleEj12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double base;
        int exponente;
        double resultado;

        // Pedimos datos al usuario
        System.out.print("Introduce la base de la potencia: ");
        base = scanner.nextDouble();
        do {
            System.out.print("Introduce el exponente (entero positivo) de la potencia: ");
            exponente = scanner.nextInt();
            if (exponente < 0) {
                System.out.println("Error, el exponente debe ser un entero positivo.");
            }
        } while (exponente < 0);

        resultado = base;

        // Realizamos bucle para repetir la multiplicación de la base consigo misma hasta obtener el resultado de la potencia.
        for (int i = 1; i < exponente; i++) {
            resultado = (resultado * base);
        }
        // Mostramos el resultado
        System.out.println("El resultado de la potencia es " + resultado);

    }

}
