/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patron;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura
 */
public class Patron {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz;
        int N, M;

        System.out.println("Dime N");
        N = entrada.nextInt();

        System.out.println("Dime M");
        M = entrada.nextInt();

        matriz = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if ((i + j) % 2 == 0) {

                }
            }
        }

    }

}
