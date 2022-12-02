/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola.mundo;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 22/09/2022 Este es mi primer programa
 */
public class HolaMundo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.println("Dime tu nombre");
        nombre = entrada.nextLine();

        System.out.println("Bienvenido " + nombre + "\n a la clase de M03");
        
    }

}
