/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19.diagrama;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 03/10/2022
 */
public class Ejercicio19Diagrama {

  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int carta;

        System.out.println("Elige entre 2 cartas: (0=Mago Electrico || 1=Esbirro)");

        carta = entrada.nextInt();

        if (carta ==0) {
            System.out.println("Elegiste al Mago Electrico");
        } else if (carta ==1) {
            System.out.println("Elegiste al Esbirro");
        } else {
            System.out.println("Valor incorrecto");
        } 
        
    }
    
}
