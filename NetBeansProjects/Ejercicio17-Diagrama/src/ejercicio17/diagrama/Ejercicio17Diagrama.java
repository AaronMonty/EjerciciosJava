/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17.diagrama;

import java.util.Scanner;


public class Ejercicio17Diagrama {

    
    public static void main(String[] args) {
       
        
         int segundos, minutos, horas;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una hora expressada en segundos minutos y segundos: ");

        System.out.println("Introduce los segundos: ");
        segundos = entrada.nextInt();

        System.out.println("Introduce los minutos");
        minutos = entrada.nextInt();

        System.out.println("Introduce las horas: ");
        horas = entrada.nextInt();

        if (segundos>=59) {
            segundos = 00;
            minutos = minutos + 1;
        } else if (segundos <= 58) {
            segundos = segundos + 1;
        }else if(minutos>=59){
            minutos = 00;
            horas = horas +1;
        }else if(minutos <=58){
            minutos = minutos+1;
        }else if(horas>=23){
            horas =00;
            
        }else{
            horas = horas+1;
        }

        System.out.println("La hora es:" + horas + ":" + minutos + ":" + segundos);
        
    }
    
}
