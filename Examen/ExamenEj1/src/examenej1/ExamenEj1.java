/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenej1;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura
 */
public class ExamenEj1 {

    public static void main(String[] args) {

        int dia;
        float precioMinuto,minutos;
        char turno;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cual es tu turno (M=Mañana o T=Tarde)");
        turno = entrada.next().charAt(0);

        System.out.println("De cuantos minutos es la llamada");
        minutos = entrada.nextFloat();

        System.out.println("Que dia de la semana es");
        dia = entrada.nextInt();

        if (minutos < 0) {

            System.out.println("Error no se pueden minutos negativos");

        } else if (turno != 'M' && turno != 'T' && turno != 't' && turno != 'm') {

            System.out.println("Error introduce (M=Mañana o T=Tarde)");

        } else if (dia <= 0 || dia >= 8) {

            System.out.println("Error pusiste un numero de la semana que no existe");

        } else if (minutos >= 0 && minutos <= 5) {

            precioMinuto = minutos * 1;

            System.out.println("El precio de la llamada seria de " + precioMinuto);

        } else if (minutos >= 6 && minutos <= 8) {

            precioMinuto = minutos * 0.80F;

            System.out.println("El precio de la llamada seria de " + precioMinuto);

        } else if (minutos >= 9 && minutos <= 10) {

            precioMinuto = minutos * 0.70F;

            System.out.println("El precio de la llamada seria de " + precioMinuto);

        } else if (minutos >= 11) {

            precioMinuto = minutos * 0.50F;

            System.out.println("El precio de la llamada seria de " + precioMinuto);
        } else if (dia == 7) {

            precioMinuto = minutos * 0.03F;

            System.out.println("Los impuestos de la llamada serian de " + precioMinuto);

        }  
        if (turno == 'M' || turno == 'm') {

            precioMinuto = minutos * 0.15F;

            System.out.println("Los impuestos por el Mati seran de " + precioMinuto);

        } else if (turno == 'T' || turno == 't') {

            precioMinuto = minutos * 0.10F;

            System.out.println("Los impuestos por la Tarde seran de " + precioMinuto);

        }

    }

}
