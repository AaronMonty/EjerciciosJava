/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13extra;

import java.util.Scanner;

/**
 * Ejercicio13- Fer un programa que permet ingressar-li el preu i la quantitat
 * d'un article a comprar. Calcular el total a pagar. (Considerar l'IVA 21%).
 *
 *
 * @author Aaron Monterroso Segura 02/10/2022
 */
public class Ejercicio13Extra {

   
    public static void main(String[] args) {
      
        double precio,cantidad,total,iva,totalconiva;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantos quieres comprar?");
        cantidad = entrada.nextDouble();
        
        System.out.println("Cual es el precio?");
        precio=entrada.nextDouble();
        
        total = cantidad * precio;
        
        iva = total * 0.21;
        
        totalconiva = iva + total;
        
        System.out.println("El precio total sin iva seria de: "+total);
        
        System.out.println("El precio total con el iva incluido seria de: "+totalconiva);
        
    }

}
