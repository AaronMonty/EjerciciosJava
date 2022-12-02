/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8extra;

import java.util.Scanner;

/** Ejercicio8-Elevar al cub un nombre.
 *
 * @author Aaron Monterroso Segura 01/10/2022
 */
public class Ejercicio8Extra {

   
    public static void main(String[] args) {
        
        double numero,resultado;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = entrada.nextDouble();
        
        resultado = Math.pow(numero,2);
        
        System.out.println("El resultado es: "+resultado);
        
    }
    
}
