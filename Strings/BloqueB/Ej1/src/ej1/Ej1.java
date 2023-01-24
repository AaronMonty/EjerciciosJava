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

        Scanner entrada = new Scanner(System.in);

        String nombre;

        System.out.println("Dime tu nombre");
        nombre = entrada.nextLine();

        letraAletra(nombre);

    }

    public static void letraAletra(String letra) {

        System.out.println(letra.replace(' ', '\n'));

    }

}
