/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque2extra3;

import java.util.Scanner;

/**
 * Ejercicio3-Codifica un programa que lea un número del 1 al 12 y escriba el
 * nombre del mes correspondiente, "enero", "febrero", ..., "diciembre". Si el
 * número leído no está en el intervalo previsto escribirá "error".
 *
 *
 *
 * @author Aaron Monterroso Segura 14/10/2022
 */
public class Bloque2Extra3 {

    public static void main(String[] args) {

        int numero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero del 1 al 12");
        numero = entrada.nextInt();

        switch (numero) {
            case 1:
                System.out.println("El mes es Enero");
                break;
            case 2:
                System.out.println("El mes es Febrero");
                break;
            case 3:
                System.out.println("El mes es Marzo");
                break;
            case 4:
                System.out.println("El mes es Abril");
                break;
            case 5:
                System.out.println("El mes es Mayo");
                break;
            case 6:
                System.out.println("El mes es Junio");
                break;
            case 7:
                System.out.println("El mes es Julio");
                break;
            case 8:
                System.out.println("El mes es Agosto");
                break;
            case 9:
                System.out.println("El mes es Septiembre");
                break;
            case 10:
                System.out.println("El mes es Octubre");
                break;
            case 11:
                System.out.println("El mes es Noviembre");
                break;
            case 12:
                System.out.println("El mes es Diciembre");
                break;
            default:
                System.out.println("Introduciste un numero que no corresponde a nada");
                
        }

    }

}
