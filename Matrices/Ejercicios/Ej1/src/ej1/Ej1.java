/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

/**
 *
 * @author aamo3180
 */
public class Ej1 {

    public static void main(String[] args) {

        //Creamos matriz de 5*5
        int[][] matriz1 = new int[5][5];
        int contador = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz1[i][j] = contador;
                contador++;
            }
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz1[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }

}
