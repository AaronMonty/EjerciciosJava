/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7;

import java.util.Scanner;

/**
 *
 * Escribe un programa que pida el ancho y alto de un rectángulo y muestre por
 * pantalla su área y su perímetro. Implementa y utiliza las funciones: double
 * perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
 * double areaRectangulo(double ancho, double alto) // Devuelve el área
 *
 * @author Aaron Monterroso Segura 31/10/2022
 */
public class Ej7 {

    public static double areaRectangulo(double ancho, double alto) {

        return (2 * ancho + 2 * alto);

    }

    public static double perimetroRectangulo(double ancho, double alto) {

        return ancho * alto;

    }

    public static void main(String[] args) {

        double ancho, alto, perimetro, area;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el ancho del rectangulo");
        ancho = entrada.nextDouble();

        System.out.println("Introduce la altura del rectangulo");
        alto = entrada.nextDouble();

        perimetro = perimetroRectangulo(ancho, alto);

        area = areaRectangulo(ancho, alto);

        System.out.println("Perimetro es" + perimetro);

        System.out.println("Area es" + area);

    }

}
