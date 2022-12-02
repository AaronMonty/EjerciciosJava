/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3.diagrama;

import java.util.Scanner;

/**
 * Ejercicio3-Calcule el área de un cuadrado cuyo lado se introduce por teclado
 * @author aamo3180
 */
public class Ejercicio3Diagrama {

    public static void main(String[] args) {
        double area,lado;

        System.out.println("Introduce uno de los lados del cuadrado");
        Scanner entrada = new Scanner(System.in);
        lado = entrada.nextDouble();
        area = lado * lado;

        
        System.out.println("El area del cuadrado es: " + area);
    }

}

