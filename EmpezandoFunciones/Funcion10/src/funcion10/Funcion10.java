/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion10;

import java.util.Scanner;

/**
 * Realiza un programa que lea una fecha introduciendo el día, mes y año por
 * separado y nos diga si la fecha es correcta o no. Supondremos que todos los
 * meses tienen 30 días. Se debe crear una función donde le pasemos los datos y
 * devuelva si es correcta o no.
 *
 *
 * @author Aaron Monterroso Segura 28/11/2022
 */
public class Funcion10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int dia, mes, año;

        String resultadoFinal;

        System.out.println("Introduce el dia");
        dia = entrada.nextInt();

        System.out.println("Introduce el mes");
        mes = entrada.nextInt();

        System.out.println("Introduce el any");
        año = entrada.nextInt();

        resultadoFinal = fecha(dia, mes, año);

        System.out.println(resultadoFinal);

    }

    public static String fecha(int dia, int mes, int año) {

        String incorrecta, correcta;

        //Comparando Dias
        if (dia < 0 || dia > 30) {

            incorrecta = "Los dias son incorrectos";
            return incorrecta;

            //Comparando los Meses
        } else if (mes < 0 || mes > 12) {

            incorrecta = "Los meses son incorrectos";
            return incorrecta;

            //Comparando años
        } else if (año < 0) {

            incorrecta = "Los años son incorrectos";
            return incorrecta;
        } else {

            correcta = "Fecha correcta";
            return correcta;
        }

    }

}
