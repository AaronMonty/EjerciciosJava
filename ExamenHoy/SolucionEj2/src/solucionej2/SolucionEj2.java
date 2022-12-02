/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solucionej2;

import java.util.Scanner;

/**
 *
 *
 * @author aamo3180
 */
public class SolucionEj2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numBinario = entrada.nextInt();
        
        int bit = 1;
        
        int resultadoFinal = 0;
        int digitos = 1;
        
        int elevado = 1;
        
        while (numBinario != 0) {

            bit = numBinario % 10;

            resultadoFinal += bit * elevado;
            elevado *= 2;
            numBinario/=10;
        }
        System.out.println(resultadoFinal);
    }

}
