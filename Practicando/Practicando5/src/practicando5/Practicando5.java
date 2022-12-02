/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicando5;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 21/10/2022
 */
public class Practicando5 {

    public static void main(String[] args) {

        int lado1 = 0, lado2 = 0, lado3 = 0, suma;
        int mayor = 0;
        String tipoTriangulo;

        mayor = lado1;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduceme el primer lado");
        lado1 = entrada.nextInt();

        System.out.println("Introduceme el segundo lado");

        lado2 = entrada.nextInt();

        System.out.println("Introduceme el tercer lado");
        lado3 = entrada.nextInt();

        if (lado2 > mayor) {
            mayor = lado2;
        }
        if (lado3 > mayor) {
            mayor = lado3;
        }

        suma = lado1 + lado2 + lado3 - mayor;

        if (mayor < suma) {

            if ((lado1 == lado2) && (lado2 == lado3)) {

                tipoTriangulo = "Triangulo Equilatero";

            } else {

                if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {

                    tipoTriangulo = "Triangulo Isoceles";

                } else {

                    tipoTriangulo = "Triangulo escaleno";

                }

            }

        } else {

            tipoTriangulo = "No es no triangulo";

        }

        System.out.println("El tipo de triangulo es " + tipoTriangulo);

    }

}
