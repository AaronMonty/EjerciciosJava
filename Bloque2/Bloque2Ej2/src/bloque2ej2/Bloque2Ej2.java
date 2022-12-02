/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque2ej2;

import java.util.Scanner;

/**
 * Ejercicio2-Desenvolupa un programa que demani un mes i un any, i escrigui el
 * mes anterior i el mes següent. Ex: Si l’usuari introdueix el mes 10 i l'any
 * 2017, el resultat serà mes anterior: 9/2017 i el mes posterior 11/2017
 *
 *
 * @author Aaron Monterroso Segura 10/10/2022
 */
public class Bloque2Ej2 {

    public static void main(String[] args) {

        int mes, any;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un any");
        any = entrada.nextInt();

        System.out.println("Introduce el mes");
        mes = entrada.nextInt();

        if (mes>12 || mes<1) {
            System.out.println("Valores incorrectos");
        } else if (mes==12) {
            System.out.println("La fecha anterior es "+(mes-1)+"/"+any);
            System.out.println("La fecha posterior es "+(mes-11)+"/"+(any+1));
        }else if(mes==1){
            System.out.println("La fecha anterior es "+(mes+11)+"/"+(any-1));
            System.out.println("La fecha posterior es "+(mes+1)+"/"+any);
        }else{
            System.out.println("la fecha anterior es "+(mes-1)+"/"+any);
            System.out.println("La fecha posterior es "+(mes+1)+"/"+any);
        }

    }

}
