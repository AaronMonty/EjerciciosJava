/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9extra;

import java.util.Scanner;

/**
 * Ejercicio9- Obtenir el pes donat en quilos d'una persona en grams, lliures i
 * tones.
 *
 *
 * @author Aaron Monterroso Segura 02/10/2022
 */
public class Ejercicio9Extra {

   
    public static void main(String[] args) {
        
        double kilos,gramos,libras,toneladas;
        
      
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu peso en kg: ");
        kilos = entrada.nextDouble();
        
         gramos = kilos * 1000;
        
         libras = kilos * 2.204;
         
         toneladas = kilos / 1000;
         
         System.out.println("Tu peso en gramos es: "+gramos);
    
         System.out.println("Tu peso en llibras es: "+libras);
    
         System.out.println("Tu peso en toneladas es: "+toneladas);
    }

}
