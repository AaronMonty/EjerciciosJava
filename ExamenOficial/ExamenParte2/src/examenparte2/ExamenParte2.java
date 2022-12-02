/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenparte2;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 24/10/2022
 */
public class ExamenParte2 {

    public static void main(String[] args) {

        //Declarando Variables 
        int dias = 0, assistencia;
        char respuesta;
        String nombre;
        float examen1, examen2, examen3, notaPrimerExamen, notaSegundoExamen, notaTercerExamen, media = 0;
        //Pidiendo al usuario que introduzca los datos 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cual es tu nombre");
        nombre = entrada.nextLine();
        System.out.println("Cual es la nota del primer examen");
        notaPrimerExamen = entrada.nextFloat();
        System.out.println("Cual es la nota del segundo examen");
        notaSegundoExamen = entrada.nextFloat();
        System.out.println("Cual es la nota del tercer examen");
        notaTercerExamen = entrada.nextFloat();
        //Comprobando errores
        if (notaPrimerExamen < 0 || notaPrimerExamen > 10 || notaSegundoExamen < 0
                || notaSegundoExamen > 10 || notaTercerExamen < 0 || notaTercerExamen > 10) {
            System.out.println("Error no se pueden notas negativas");
            //Calculando las notas
        } else {
            examen1 = notaPrimerExamen * 0.1F;
            examen2 = notaSegundoExamen * 0.6F;
            if (notaPrimerExamen < 5) {
                examen3 = notaTercerExamen * 0.4F;
            } else {
               examen3 = notaTercerExamen * 0.3F;
            }
            media = examen1 + examen2 + examen3;
            if (media > 4.4 || media < 5) {
                System.out.println("Hiciste el trabajo opcional? (Formato: (S=Si/N=No))");
                respuesta = entrada.next().charAt(0);
                if (respuesta == 'S') {
                    media = 5;
                } else if (respuesta == 'N') {
                    media = media;
                } else {
                    System.out.println("Opcion incorrecta (Formato: Si=S/No=N)");
                }
            }
            System.out.println("Cuantos dias has ido a clase ");
            dias = entrada.nextInt();
            if (dias < 0 || dias > 90) {
                System.out.println("Introduce valores correctos");
            } else {
                assistencia = dias / 90 * 100;
                if (assistencia < 0.1) {
                    media = 1;
                }
            }
        }
        System.out.println("Tu nota final es " + media);
    }
}
