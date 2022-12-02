/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probandocosas1;

import java.util.Scanner;

/**
 *
 * @author Prueba
 */
public class ProbandoCosas1 {

    public static double areaCirculoRadio(int radio) {

        return Math.pow(radio, 2) * Math.PI;

    }

    public static double areaTriangulo(int base, int altura) {

        return (base * altura) / 2;

    }

    public static double areaCuadrado(int lado) {

        return lado * lado;

    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String eleccion;

        double resultado = 0;

        int radio, base, altura, lado;

        System.out.println("Que figura quieres calcular su area? (Circulo && Triangulo && Cuadrado)");
        eleccion = entrada.nextLine();

        switch (eleccion) {
            case "circulo":

                System.out.println("Introduce el radio");
                radio = entrada.nextInt();
                resultado = areaCirculoRadio(radio);

                break;
            case "triangulo":

                System.out.println("Introduce base");
                base = entrada.nextInt();
                System.out.println("Introduce altura");
                altura = entrada.nextInt();

                resultado = areaTriangulo(base, altura);

                break;
            case "cuadrado":

                System.out.println("Introduce lado");
                lado = entrada.nextInt();

                resultado = areaCuadrado(lado);
                break;
            default:
                System.out.println("Introduciste una opcion incorrecta");
                break;
        }

        System.out.println("El area del " + eleccion + " es " + resultado);

    }

}
