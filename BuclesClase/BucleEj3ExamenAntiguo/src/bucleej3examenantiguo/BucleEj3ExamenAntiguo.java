/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej3examenantiguo;

import java.util.Scanner;

/**
 *
 * Ejercicio 3. Pintar habitaciones de una casa (3,5pts) Escribe un programa que
 * calcule el número de botes de pintura necesarios para pintar una habitación y
 * el número óptimo de botes que debe comprar. Tiene que preguntar por: la
 * altura, el largo y el ancho de la habitación. La habitación es rectangular.
 * Tiene que pintar las paredes y el techo pero no el suelo. No hay ventanas ni
 * tragaluces. Puede comprar botes de pintura de los siguientes tamaños. ● El
 * bote de 5 litros cuesta 15€ y es suficiente para pintar 250 m2 . ● El bote de
 * 1 litro cuesta 4€ y es suficiente para pintar 50 m2 . El programa pedirá
 * cuántas habitaciones va a pintar y mostrará por pantalla para cada habitación
 * su resultado y el total: Ejemplo de salida en pantalla:
 *
 *
 * @author Aaron Monterroso Segura 18/11/2022
 */
public class BucleEj3ExamenAntiguo {

    public static void main(String[] args) {

        float longitud, anchura;
        float area = 0; // VARIABLE ACUMULADORA
        char continuar = 'S'; // VARIABLE CENTINELA
        int contador = 0; // VARIABLE CONTADORA
        
        Scanner lector = new Scanner(System.in);
        
        while (continuar == 'S') {
            contador++;
            System.out.println("ESTANCIA " + contador);
            System.out.print("Introduce la longitud: ");
            longitud = lector.nextFloat();

            System.out.print("Introduce la anchura: ");
            anchura = lector.nextFloat();

            area = area + longitud * anchura;

            System.out.print("¿Quieres introducir otra estancia (S/N)?: ");
            continuar = lector.next().charAt(0);
        }
        
        System.out.println("Espacio total de la casa: " + area);
        System.out.println("Número de estancias: " + contador);
        
        
    }

}
