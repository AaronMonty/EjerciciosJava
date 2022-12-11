/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion7;

import java.util.Scanner;

/**
 *
 * Escribe un programa que pida el ancho y alto de un rectángulo y muestre por
 * pantalla su área y su perímetro. Implementa y utiliza las funciones: double
 * perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
 * double areaRectangulo(double ancho, double alto) // Devuelve el área
 *
 * @author Aaron Monterroso Segura 28/11/2022
 */
public class Funcion7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double ancho, alto, area, perimetro;

        System.out.println("Dime la altura del rectangulo");
        alto = entrada.nextDouble();
        System.out.println("Dime el ancho del rectangulo");
        ancho = entrada.nextDouble();

        area = areaRectangulo(ancho, alto);
        perimetro = perimetroRectangulo(ancho, alto);

        System.out.println("El perimetro del rectangulo con ancho de " + ancho + " y altura de " + alto + " es de " + perimetro);

        System.out.println("El perimetro del rectangulo con ancho de " + ancho + " y altura de " + alto + " es de " + area);

    }

    public static double perimetroRectangulo(double ancho, double alto) {

        return (ancho + alto) * 2;

    }

    public static double areaRectangulo(double ancho, double alto) {

        return ancho * alto;

    }

}
