/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque2ej10;

import java.util.Scanner;

/**
 * Ejercicio10-Desenvolupa un programa que demani 10 números i digui quin és el
 * major i quin és el menor.
 *
 * (PENDIENTE)
 *
 * @author Aaron Monterroso Segura 11/10/2022
 */
public class Bloque2Ej10 {

    public static void main(String[] args) {

        int num1, num2, num3, num4, num5, num6,
                num7, num8, num9, num10;

        
        
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        num1 = entrada.nextInt();
        
        int max=num1;
        int min=num1;
        
        System.out.println("Introduce el segundo numero");
        num2 = entrada.nextInt();
        
        if (num2>max) {
            max=num2;
        }
        if (num2<min) {
            min=num2;
        }
        
        System.out.println("Introduce el tercer numero");
        num3 = entrada.nextInt();
        
         if (num3>max) {
            max=num3;
        }
        if (num3<min) {
            min=num3;
        }
        
        System.out.println("Introduce el cuarto numero");
        num4 = entrada.nextInt();
        
         if (num4>max) {
            max=num4;
        }
        if (num4<min) {
            min=num4;
        }
        
        System.out.println("Introduce el quinto numero");
        num5 = entrada.nextInt();
        
         if (num5>max) {
            max=num5;
        }
        if (num5<min) {
            min=num5;
        }
        
        System.out.println("Introduce el sexto numero");
        num6 = entrada.nextInt();
        
         if (num6>max) {
            max=num6;
        }
        if (num6<min) {
            min=num6;
        }
        
        System.out.println("Introduce el septimo numero");
        num7 = entrada.nextInt();
        
         if (num7>max) {
            max=num7;
        }
        if (num7<min) {
            min=num7;
        }
        
        System.out.println("Introduce el octavo numero");
        num8 = entrada.nextInt();
        
         if (num8>max) {
            max=num8;
        }
        if (num8<min) {
            min=num8;
        }
        
        System.out.println("Introduce el noveno numeros");
        num9 = entrada.nextInt();
        
         if (num9>max) {
            max=num9;
        }
        if (num9<min) {
            min=num9;
        }
        
        
        System.out.println("Introduce el decimo numeros");
        num10 = entrada.nextInt();
        
         if (num10>max) {
            max=num10;
        }
        if (num10<min) {
            min=num10;
        }

        
        System.out.println("El numero mas enano es "+min);
        System.out.println("El numero mas grande es "+max);
        
        
        
        
    }

}
