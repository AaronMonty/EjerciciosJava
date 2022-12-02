/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11extra;

import java.util.Scanner;

/**
 * Ejercicio11- Fer un programa que llegeix 3 nombres enters positius i que
 * mostri la suma, la resta i la multiplicació de tots. El resultat ha de ser
 * sempre positiu.
 *
 *
 * @author Aaron Monterroso Segura 02/10/2022
 */
public class Ejercicio11Extra {

    public static void main(String[] args) {

        int numero1, numero2, numero3, suma, resta, multiplicacion;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        numero1 = entrada.nextInt();

        System.out.println("Dime el segundo numero: ");
        numero2 = entrada.nextInt();

        System.out.println("Dime el tercer numero: ");
        numero3 = entrada.nextInt();

        suma = numero1 + numero2 + numero3;

        resta = numero1 - numero2 - numero3;

        multiplicacion = numero1 * numero2 * numero3;

        if (suma < 0) {
            System.out.println("No se pueden resultados negativos");
        }

        if (resta < 0) {
            System.out.println("No se pueden resultados negativos");
        }
        if (multiplicacion < 0) {
            System.out.println("No se pueden resultados negativos");
        }

        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
        
    }

}
