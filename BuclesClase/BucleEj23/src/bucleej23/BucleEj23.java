/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej23;

import java.util.Scanner;

/**
 *
 * Realiza un programa que pida un numero entero N. El programa dibujara
 * patrones de n*n
 *
 * @author Aaron Monterroso Segura 17/11/2022
 */
public class BucleEj23 {

    public static void main(String[] args) {
        int N;
        Scanner entrada = new Scanner(System.in);
        N = entrada.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((i + j) % 2 != 0) {
                    System.out.print("[X]");
                } else {
                    System.out.print("[]");
                }
                System.out.println();
            }

        }

    }

}
