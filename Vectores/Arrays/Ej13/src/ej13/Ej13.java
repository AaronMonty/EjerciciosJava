/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej13;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 01/02/2023
 */
public class Ej13 {

    public static void main(String[] args) {
        int vini, inc, n;

        //pedimos valor inicial, incremento y cuántos números
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor inicial: ");
        vini = entrada.nextInt();
        System.out.print("Incremento: ");
        inc = entrada.nextInt();
        System.out.print("Cuántos números: ");
        n = entrada.nextInt();

        mostrarSequencia(n, crearSequencia(n, vini, inc));
    }

    public static int[] crearSequencia(int n, int vini, int inc) {
        //Creamos el vector con la secuencia
        int[] secuencia = new int[n];
        for (int i = 0; i < n; i++, vini *= inc) {
            secuencia[i] = vini;

        }

        return secuencia;
    }

    public static void mostrarSequencia(int n, int[] secuencia) {

        //Mostramos la secuencia
        System.out.print("Secuencia: ");
        for (int i = 0; i < n; i++) {
            System.out.print(secuencia[i] + " ");
        }
    }
}
