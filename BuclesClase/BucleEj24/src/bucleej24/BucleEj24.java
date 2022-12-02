/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej24;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura
 */
public class BucleEj24 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int N = entrada.nextInt();
        int D = entrada.nextInt();

        for (int i = 0; i < N; i++) {

            if (i%(D+1)== 0) {
                System.out.print("Y");
            } 
            else {
                System.out.print(".");
            }

        }
//            System.out.println("Y");
//            System.out.print(".");

    }
}
