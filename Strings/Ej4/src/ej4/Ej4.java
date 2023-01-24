/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura
 */
public class Ej4 {

    public static void main(String[] args) {

        String nombre;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime tu nombre");
        nombre = entrada.nextLine();

        System.out.println(nombre.toUpperCase().charAt(0)+nombre.substring(1));
        
        
        
        
        
    }
    
}
