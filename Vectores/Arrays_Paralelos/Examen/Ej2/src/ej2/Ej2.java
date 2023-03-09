/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 13/02/2023
 */
public class Ej2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String frase;
        char caracter1,caracter2;
        System.out.println("Dime una frase");
        frase=entrada.nextLine();
        
        System.out.println("Ahora dime 1 caracter para cambiarlo");
        caracter1=entrada.nextLine().charAt(0);
        System.out.println("Ahora dime otro caracter para ponerlo donde estaba el anterior");
        caracter2=entrada.nextLine().charAt(0);
        
        System.out.println(remplazar(frase, caracter1, caracter2));
        
    }
    
    public static String remplazar(String frase,char caracter1,char caracter2){
    
        
        return frase = frase.replace(caracter1, caracter2);
        
    }

}
