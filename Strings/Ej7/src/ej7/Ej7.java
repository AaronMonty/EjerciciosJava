/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso
 */
public class Ej7 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
//        String palabra=entrada.nextLine();
            int contador=0;
            String palabra="AAAXAAXA";
    
            for (int i = 0; i < palabra.length(); i++) {
            
                if (palabra.charAt(i)=='A' && palabra.charAt(i-1)!='A') {
                    
                    contador++;
                   
                }
                
        }
            
    }
    
}
