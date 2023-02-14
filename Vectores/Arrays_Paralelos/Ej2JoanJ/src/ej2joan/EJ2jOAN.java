/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2joan;

import java.util.Scanner;

/**
 * VECTORES PARALELOS: Crea un vector con los nombres de 10 alumnos, crea otro
 * vector con las notas de M03 de esos 10 alumnos, crea otro vector con las
 * notas de M02. Imprime por pantalla cada vector, y en otro vector almacena la
 * media de la nota de M02 y M03 de cada alumno.
 *
 *
 * @author Aaron Monterroso Segura 08/02/2023
 */
public class EJ2jOAN {

    public static void main(String[] args) {

        String[] Alumnos = new String[10];

        float[] NotasM03 = new float[10];

        float[] NotasM02 = new float[10];

        InicializarDatos(Alumnos, NotasM03, NotasM02);

        mostrarAlumnos(Alumnos);

        mostrarNotasM02(NotasM02, Alumnos);

        mostrarNotasM03(NotasM03, Alumnos);

        mostrarMedia(hacerMedia(NotasM02, NotasM02), Alumnos);

    }

    public static void InicializarDatos(String[] Alumnos, float[] NotasM03, float[] NotasM02) {
        Scanner entrada = new Scanner(System.in);
        int N = Alumnos.length;
        if (N != Alumnos.length || N != NotasM02.length || N != NotasM03.length) {
            System.out.println("Error, vectores distinto tama�o");
        } else {
            for (int i = 0; i < N; i++) {
                System.out.println("Dame el nombre del alumno: " + i);
                Alumnos[i] = entrada.next();
                System.out.println("Dame la nota de M02 del alumno: " + i);
                NotasM02[i] = entrada.nextFloat();
                System.out.println("Dame la nota de M03 del alumno: " + i);
                NotasM03[i] = entrada.nextFloat();

            }
        }

    }

    public static float[] hacerMedia(float[] NotasM02, float[] NotasM03) {

        float[] media = new float[10];

        for (int i = 0; i < NotasM02.length; i++) {

            media[i] = (NotasM02[i] + NotasM03[i]) / 2;

        }

        return media;

    }

    public static void mostrarMedia(float[] media, String[] Alumnos) {

        for (int i = 0; i < media.length; i++) {

            System.out.println("La media del alumno " + Alumnos[i] + " es: " + media[i] + " ");

        }

    }

    public static void mostrarAlumnos(String[] Alumnos) {

        for (int i = 0; i < Alumnos.length; i++) {

            System.out.println(Alumnos[i] + " ");

        }

    }

    public static void mostrarNotasM03(float[] NotasM03, String[] Alumnos) {

        for (int i = 0; i < NotasM03.length; i++) {

            System.out.println("La nota de M03 de " + Alumnos[i] + " es: " + NotasM03[i] + " "
            );

        }

    }

    public static void mostrarNotasM02(float[] NotasM02, String[] Alumnos) {

        for (int i = 0; i < NotasM02.length; i++) {

            System.out.println("La nota de M02 de " + Alumnos[i] + " es: " + NotasM02[i] + " ");

        }

    }

}
