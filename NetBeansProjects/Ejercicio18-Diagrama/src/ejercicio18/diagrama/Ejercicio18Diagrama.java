/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18.diagrama;

import java.util.Scanner;

/**
 * Ejercicio18- a que calcula el salario neto semanal de un trabajador en
 * función del número de horas trabajadas y la tasa de impuestos de acuerdo a
 * las siguientes hipótesis: • Las primeras 35 horas se pagan a tarifa normal. •
 * Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal. • Las tasas
 * de impuestos son: • Los primeros 500 euros son libres de impuestos. • Los
 * siguientes 400 tienen un 25% de impuestos. • Los restantes un 45% de
 * impuestos. Escribir nombre, salario bruto, tasas y salario neto.
 *
 * @author Aaron Monterroso Segura 30/09/2022
 */
public class Ejercicio18Diagrama {

    public static void main(String[] args) {

        double SalarioHora, SalarioNeto, SalarioBruto, Impuestos, Impuestos1, Impuestos2;
        int HorasTrabajadas, HorasExtra;
        String nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        nombre = entrada.next();

        System.out.println("Cuanto cobras la hora");
        SalarioHora = entrada.nextDouble();

        System.out.println("Cuantas horas has trabajado");
        HorasTrabajadas = entrada.nextInt();

        if (HorasTrabajadas>35) {
             HorasExtra = 35 - HorasTrabajadas;
            SalarioBruto = (HorasExtra * 1.5) + (HorasTrabajadas * SalarioHora);
        } else {
            SalarioBruto = HorasTrabajadas * SalarioHora;
        }

        if (SalarioBruto > 900) {
            Impuestos1 = 400 * 0.25;
            Impuestos2 = SalarioBruto - 500;
            Impuestos2 = Impuestos2 * 0.45;
            Impuestos = Impuestos1 + Impuestos2;
            SalarioNeto = SalarioBruto - Impuestos;

        } else {
            Impuestos = 0;
            SalarioNeto = SalarioBruto - Impuestos;
        }

        System.out.println("El nombre es " + nombre + " el salario bruto es " 
                + SalarioBruto + " los impuestos son " + Impuestos + 
                " el salario neto es " + SalarioNeto);

    }

}
