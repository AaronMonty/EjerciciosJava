/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probandocosas2;

import java.util.Scanner;

/**
 *
 * @author Prueba
 */
public class ProbandoCosas2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int precio = 0;
        int contador = 0;

        System.out.println("Cuantos productos ");
        int cantidadproductos = entrada.nextInt();

        for (int i = 0; i < cantidadproductos; i++) {

            System.out.println("Introduce el precio del producto Nº" + (i + 1));
            precio = entrada.nextInt();
            contador = contador + precio;
        }

        System.out.println("El precio medio de los productos es de " + contador / cantidadproductos);

    }

}
