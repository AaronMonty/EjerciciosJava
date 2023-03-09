/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5;

import java.util.Scanner;

/**
 * Necesitamos crear un programa para registrar sueldos de hombres y mujeres de
 * una empresa y detectar si existe brecha salarial entre ambos. El programa
 * pedirá por teclado la información de N personas distintas (valor también
 * introducido por teclado). Para cada persona, pedirá su género (0 para varón y
 * 1 para mujer) y su sueldo. Esta información debe guardarse en una única
 * matriz. Luego se mostrará por pantalla el sueldo medio de cada género.
 *
 *
 *
 * @author Aaron Monterroso Segura 20/02/2023
 */
public class Ej5 {

    public static int N, cantidadHombres = 0, cantidadMujeres = 0;
    public static int[][] personas;
    public static double sueldoHombres = 0, sueldoMujeres = 0, sueldoMedioHombre, sueldoMedioMujer;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantas personas quieres registrar en tu empresa");
        N = entrada.nextInt();

        //Control de errores para que no se puedan poner numeros negativos
        while (N < 0) {
            System.out.println("No puedes registrar a personas negativas");
            N = entrada.nextInt();

        }

        creamosMatrizContamaño();
        rellenamosMatrizConDatos();
        imprimir();
    }

    public static int[][] creamosMatrizContamaño() {

        return personas = new int[N][2];
    }

    public static int[][] rellenamosMatrizConDatos() {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            System.out.println("Introduce el genero de la persona (0 es hombre || 1 es mujer)");
            personas[i][0] = entrada.nextInt();

            //Control de errores para que eliga si o si (0 o 1)
            while (personas[i][0] != 0 && personas[i][0] != 1) {

                System.out.println("Incorrecto, elige 0 para hombre o 1 para mujer");
                personas[i][0] = entrada.nextInt();

            }

            System.out.println("Ingrese el sueldo de la persona: ");
            personas[i][1] = entrada.nextInt();

            //Control de errores para que no haya saldo negativo
            while (personas[i][1] < 0) {
                System.out.println("No se puede poner un saldo negativo");
                personas[i][1] = entrada.nextInt();

            }

        }

        return personas;

    }

    public static void imprimir() {

        for (int i = 0; i < N; i++) {
            if (personas[i][0] == 0) {
                sueldoHombres += personas[i][1];
                cantidadHombres++;
            } else {
                sueldoMujeres += personas[i][1];
                cantidadMujeres++;
            }
        }

        sueldoMedioHombre = sueldoHombres / cantidadHombres;
        sueldoMedioMujer = sueldoMujeres / cantidadMujeres;

        System.out.println("El sueldo  medio de los hombres es: " + sueldoMedioHombre);
        System.out.println("El sueldo medio de las mujeres es: " + sueldoMedioMujer);

        if (sueldoMedioHombre > sueldoMedioMujer) {

            System.out.println("Existe una brecha salarial de " + (sueldoMedioMujer - sueldoMedioHombre) + "entre hombres y mujeres");
        } else if (sueldoMedioHombre < sueldoMedioMujer) {

            System.out.println("Existe una brecha salarial de " + (sueldoMedioMujer - sueldoMedioHombre) + " entre hombres y mujeres");
        } else {
            System.out.println("No existe ningna brecha salarial entre hombres y mujeres");
        }
    }

}
