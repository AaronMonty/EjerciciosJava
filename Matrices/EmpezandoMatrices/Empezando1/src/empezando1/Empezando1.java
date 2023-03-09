/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empezando1;

/**
 *
 * @author Aaron Monterroso Segura
 */
public class Empezando1 {

    public static void main(String[] args) {


        int[][] matriz = new int[2][3];

        //int[] fila= matriz[0];
        matriz[1][1] = 5;
        int N = 2;
        int M = 3;
        int[][] matrizB = {
            {0, 1, 2,3},
            {3, 4, 5,6}

        };

        
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }

}
