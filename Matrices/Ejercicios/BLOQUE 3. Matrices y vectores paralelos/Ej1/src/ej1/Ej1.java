/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura
 */
public class Ej1 {

    public static void main(String[] args) {

        String[] nombre = new String[4];
        int[][] sueldos = new int[4][5];
        int[] sueldoTotal = new int[4];
        RellenarEmpleados(nombre);
        RellenarSueldos(sueldos);
        sueldoTotalEmpleados(sueldos, sueldoTotal);

//        for (int i = 0; i < 4; i++) {
//            System.out.println(nombre[i]);
//
//        }
        for (int i = 0; i < 4; i++) {
            System.out.print(nombre[i]);
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + sueldos[i][j] + " ");
            }
            System.out.print(" " + sueldoTotal[i]);

            System.out.println();
        }

    }

    public static String[] RellenarEmpleados(String[] nombres) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Dime los nombres de los empleados: ");
            nombres[i] = entrada.nextLine();
        }

        return nombres;
    }

    public static int[][] RellenarSueldos(int[][] sueldos) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Sueldos de los ultimos 3 meses del empleado " + (i + 1));
            for (int j = 0; j < 3; j++) {
                sueldos[i][j] = entrada.nextInt();

            }
            System.out.println();
        }

        return sueldos;
    }

    public static int[] sumarSueldos3Meses(int[][] sueldo, int[] sueldoTotal) {

        return sueldoTotal;
    }

    public static int[] sueldoTotalEmpleados(int[][] sueldos, int[] sueldoTotal) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                sueldoTotal[i] += sueldos[i][j];
            }
            System.out.println();
        }

        return sueldoTotal;
    }

    public static String[] empleadoConMayorSueldo(String[] nombre) {

        
        
        return null;
    }

}
