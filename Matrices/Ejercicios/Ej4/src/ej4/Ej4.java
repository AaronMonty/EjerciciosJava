/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4;

import java.util.Scanner;

/**
 *
 * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
 * “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las
 * notas por teclado y luego el programa mostrará la nota mínima, máxima y media
 * de cada alumno
 *
 * @author Aaron Monterroso Segura
 */
public class Ej4 {

    public static int NUM_ALUMNOS = 4, NUM_ASIGNATURAS = 5;
    public static double[][] notas;
    public static double min, max, sum, media;

    public static void main(String[] args) {

        crearMatrizConTamaño();
        llenarMatrizConValores();
        Imprimir();

    }

    public static double[][] crearMatrizConTamaño() {

        return notas = new double[NUM_ALUMNOS][NUM_ASIGNATURAS];

    }

    public static double[][] llenarMatrizConValores() {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            System.out.println("Notas del alumno " + (i + 1) + ":");
            for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                System.out.print("Introduce la nota de la asignatura " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();

                //Control de errores para que no hayan notas negativas
                while (notas[i][j] < 0) {
                    System.out.println("Nota incorrecta, introduzca la nota de la asignatura " + (j + 1) + " : ");
                    notas[i][j] = scanner.nextDouble();

                }
            }
        }

        return notas;
    }

    public static void Imprimir() {

        for (int i = 0; i < NUM_ALUMNOS; i++) {
            min = notas[i][0];
            max = notas[i][0];
            sum = 0;
            for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                if (notas[i][j] < min) {
                    min = notas[i][j];
                }
                if (notas[i][j] > max) {
                    max = notas[i][j];
                }
                sum += notas[i][j];
            }
            media = sum / NUM_ASIGNATURAS;
            System.out.println("Notas del alumno " + (i + 1) + ": ");
            System.out.println("Nota minima: " + min);
            System.out.println("Nota maxima: " + max);
            System.out.println("Nota media: " + media);
        }

    }

}
