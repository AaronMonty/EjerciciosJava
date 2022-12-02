/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22.diagrama;

import java.util.Scanner;

/**
 * Ejercicio 22- En aquest cas augmentarem les opcions amb dues eleccions primer
 * et pregunta quantes copes tens:
 *
 * @author Aaron Monterroso Segura
 */
public class Ejercicio22Diagrama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int copas;
        
        char cartas;
        
        System.out.println("Cuantas copas tienes?");
        
        copas = entrada.nextInt();
        
        if (copas <= 1999) {
            
            System.out.println("Elige entre estas 2 cartas (M=Mago Electrico || E=Esbirro)");
            cartas = entrada.next().charAt(0);
            
            if (cartas == 'M' || cartas == 'm') {
                System.out.println("Elegiste al Mago Electrico");
            } else {
                System.out.println("Elegiste al Esbirro");
            }
            
        } else if (copas >= 2000) {
            System.out.println("Elige entre estas 2 cartas (C=Caballero || B=Bandida)");
            cartas = entrada.next().charAt(0);
            
            if (cartas == 'C' || cartas == 'c') {
                System.out.println("Elegiste al Caballero");
            } else {
                System.out.println("Elegiste a la Bandida");
            }
            
        }
        
    }
    
}
