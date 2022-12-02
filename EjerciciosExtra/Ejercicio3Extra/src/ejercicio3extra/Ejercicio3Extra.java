/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3extra;

import java.util.Scanner;

/**
 * Ejercicio3- Un venedor rep un sou base més un 10% extra per comissió de les
 * seves vendes. El venedor desitja saber quant diners obtindrà per concepte de
 * comissions per les 3 vendes que realitza en el mes i el total que rebrà en el
 * mes prenent en compte el seu sou base i comissions.
 *
 * @author Aaron Monterroso Segura 01/10/2022
 */
public class Ejercicio3Extra {

    public static void main(String[] args) {

        double venta1, venta2, venta3, comision, sueldo, salariototal;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce las 3 ventas: ");
        venta1 = entrada.nextDouble();
        venta2 = entrada.nextDouble();
        venta3 = entrada.nextDouble();

        System.out.println("Introduce tu sueldo base: ");
        sueldo = entrada.nextDouble();

        comision = (venta1 + venta2 + venta3) * 0.10;

        salariototal = comision + sueldo;

        System.out.println("El sueldo base es: " + sueldo);

        System.out.println("Las comisiones por las 3 ventas es: " + comision);

        System.out.println("El sueldo total con las comisiones añadidas es de:" + salariototal);

    }

}
