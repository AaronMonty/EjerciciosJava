/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2a;

/**
 *
 * @author Prueba
 */
public class EJ2A {
    
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        
        MostrarMatriz(rellenarMatriz(matriz));
        
    }
    
    public static int[][] rellenarMatriz(int[][] matriz) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (i + 1) * (j + 1);
            }
        }
        return matriz;
    }
    
    public static void MostrarMatriz(int[][] matriz) {
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
}
