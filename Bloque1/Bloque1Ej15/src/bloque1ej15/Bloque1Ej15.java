/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque1ej15;

import java.util.Scanner;

/**
 * Ejercicio15-Escriu un programa on s'ingressi el temps necessari per a un cert
 * procés en hores, minuts i segons. Es calcula el cost total del procés sabent
 * que el cost per segon és de 0,25€.
 *
 *
 * @author Aaron Monterroso Segura 07/10/2022
 */
public class Bloque1Ej15 {

    public static void main(String[] args) {

        int horas,minutos,segundos,horasASegs,minutosASegs;
        float total,costesegundo=0.25F;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce las horas: ");
        horas=entrada.nextInt();
        
        System.out.println("Introduce los minutos: ");
        minutos=entrada.nextInt();
        
        System.out.println("Introduce los segundos ");
        segundos=entrada.nextInt();
        
        horasASegs=3600*horas;
        
        minutosASegs=60*minutos;
        
       
        total= (horasASegs*costesegundo)+(minutosASegs*costesegundo)+(segundos*costesegundo);
        
        System.out.println("El proceso te costara "+total+" euros");
    }

}
