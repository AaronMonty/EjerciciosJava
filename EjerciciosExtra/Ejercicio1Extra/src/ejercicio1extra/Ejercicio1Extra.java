/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1extra;

import java.util.Scanner;

/**
 * Ejercicio1- Obtenir l'edat d'una persona en mesos, si s'ingressa la seva edat
 * en anys i mesos. Exemple: Ingressat 3 anys 4 mesos ha de mostrar 40 mesos.
 *
 * @author Aaron Monterroso 01/10/2022
 */
public class Ejercicio1Extra {

   
    public static void main(String[] args) {
      
        int meses,edad,años;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        años = entrada.nextInt();
        
        System.out.println("Introduce los meses: ");
        meses = entrada.nextInt();
        
        
        años = años*12+meses;
        
        
        System.out.println("Tu edad en meses es: "+años);
        
    }

}
