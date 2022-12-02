/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solucionej1;

import java.util.Scanner;

/**
 *
 * @author aamo3180
 */
public class SolucionEj1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        boolean salir = false;

        do {

            System.out.println("Menu Principal");

            System.out.println("1.Refresco\n2.Cafe\n3.Snacks\n4.Salir");
            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("1.Agua\n2.CocaCola\n3.Fanta\n4.RedBull");
                    
                    break;
                case 2:
                    System.out.println("1.Agua\n2.CocaCola\n3.Fanta\n4.RedBull");

                    break;
                case 3:
                    System.out.println("1.Agua\n2.CocaCola\n3.Fanta\n4.RedBull");

                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }

        } while (salir);

    }

}
