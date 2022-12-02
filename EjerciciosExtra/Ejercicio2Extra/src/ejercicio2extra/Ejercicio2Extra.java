/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2extra;

import java.util.Scanner;

/**
 * Ejercicio2- Suposi que un individu desitja invertir el seu capital en un banc
 * i desitja saber quant diners guanyarà després d'un any si el banc paga a raó
 * de 2,5% mensual.
 *
 *
 * @author Aaron Monterroso Segura 01/10/2022
 */
public class Ejercicio2Extra {

    public static void main(String[] args) {

        double inversion,ganancia;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuanta cantidad quieres invertir? ");
        inversion = entrada.nextDouble();
        
        
        ganancia = (inversion * 0.25)*12;
        
        System.out.println("Su gananacia en 1 año seria de "+ganancia);
       
        
    }

}
