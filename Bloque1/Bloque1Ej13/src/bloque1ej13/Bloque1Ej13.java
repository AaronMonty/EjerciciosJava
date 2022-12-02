/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque1ej13;

import java.util.Scanner;

/**
 * Ejercicio13-En un hospital existeixen 3 àrees: Urgències, Pediatria i
 * Traumatologia. El pressupost anual de l'hospital es reparteix de la següent
 * manera: 
 * - Urgències 37% 
 * - Pediatria 42% 
 * - Traumatologia 21% 
 * Obtenir la quantitat de diners que rebrà cada àrea per a qualsevol 
 * suma de pressupost.
 *
 * @author Aaron Monterroso Segura 07/10/2022
 */
public class Bloque1Ej13 {

   
    public static void main(String[] args) {
       
        float presupuesto,urgencias=0.37F,pediatria=0.42F,traumatologia=0.21F;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("De cuanto es el presupuesto ");
        presupuesto=entrada.nextFloat();
        
        System.out.println("A urgencias le corresponde un "+presupuesto*urgencias);
        System.out.println("A pediatria le corresponde un "+presupuesto*pediatria);
        System.out.println("A traumatologia le corresponde un "+presupuesto*traumatologia);
    }

}
