/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15extra;

import java.util.Scanner;

/**
 * Ejercicio5- Fer un programa que realitzi la conversió de cm a polzades (on
 * 1cm = 0.39737 polzades).
 *
 *
 * @author Aaron Monterroso Segura 02/10/2022
 */
public class Ejercicio15Extra {

    public static void main(String[] args) {

        double centimetros,polzadas,total;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce los centimetros: ");
        centimetros = entrada.nextDouble();
        
        polzadas = centimetros *0.39737;
        
        System.out.println("El resultado en polzadas es: "+polzadas);
    }

}
