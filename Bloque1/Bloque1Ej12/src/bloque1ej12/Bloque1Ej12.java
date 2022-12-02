/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque1ej12;

import java.util.Scanner;

/**
 * Ejercicio12-Calcular el nou salari d'un empleat si va obtenir un increment
 * del 8% sobre el seu salari actual i un descompte de 2,5% per serveis.
 *
 *
 * @author Aaron Monterroso Segura 06/10/2022
 */
public class Bloque1Ej12 {

    public static void main(String[] args) {

        float salarioActual, salarioNuevo,salarioNuevoTotal, incremento = 0.08F,descensoTotal, descenso = 0.25F;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu salario actual: ");
        salarioActual = entrada.nextFloat();

        salarioNuevo = (salarioActual + (salarioActual * incremento));

        System.out.println("Tu salario nuevo es de " + salarioNuevo);

        descensoTotal = ((salarioNuevo * descenso) / 100);

        salarioNuevoTotal=salarioNuevo-descensoTotal;
        
        System.out.println("Tu salario nuevo con los servicios incluidos es de "+salarioNuevoTotal);
        
        
        
    }

}
