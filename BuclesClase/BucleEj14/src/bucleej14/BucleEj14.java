/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej14;

import java.util.Scanner;

/**
 *
 * Realiza un programa que dada una cantidad de euros que el usuario introduce
 * por teclado (múltiplo de 5 €) mostrará los billetes de cada tipo que serán
 * necesarios para alcanzar dicha cantidad (utilizando billetes de 500, 200,
 * 100, 50, 20, 10 y 5). Hay que indicar el mínimo de billetes posible. Por
 * ejemplo, si el usuario introduce 145 el programa indicará que será necesario
 * 1 billete de 100 €, 2 billetes de 20 € y 1 billete de 5 € (no será válido por
 * ejemplo 29 billetes de 5, que aunque sume 145 € no es el mínimo número de
 * billetes posible).
 *
 *
 * @author Aaron Monterroso Segura 06/11/2022
 */
public class BucleEj14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int dinero, billete500 = 0, billete200 = 0, billete100 = 0, billete50 = 0, billete20 = 0, billete10 = 0, billete5 = 0;

        //Creamos un do while para cuando nos introduzca una cantidad de dinero sea si o si un multiplo de 5 
        do {

            System.out.println("Cuanto dinero tienes");

            dinero = entrada.nextInt();

        } while (dinero % 5 != 0);

        // Aqui creamos un bucle que se repetira hasta que dinero sea 0
        while (dinero != 0) {

            if (dinero >= 500) {

                billete500 = dinero / 500;
                dinero = dinero % 500;

            } else if (dinero >= 200) {

                billete200 = dinero / 200;
                dinero = dinero % 200;

            } else if (dinero >= 100) {

                billete100 = dinero / 100;
                dinero = dinero % 100;

            } else if (dinero >= 50) {

                billete50 = dinero / 50;
                dinero = dinero % 50;

            } else if (dinero >= 20) {

                billete20 = dinero / 20;
                dinero = dinero % 20;

            } else if (dinero >= 10) {

                billete10 = dinero / 10;
                dinero = dinero % 10;

            } else {

                billete5 = dinero / 5;
                dinero = dinero % 5;
            }

        }

        //Mostramos los Billetes al usuario
        System.out.println("Son " + billete500 + " billetes de 500");
        System.out.println("Son " + billete200 + " billetes de 200");
        System.out.println("Son " + billete100 + " billetes de 100");
        System.out.println("Son " + billete50 + " billetes de 50");
        System.out.println("Son " + billete20 + " billetes de 20");
        System.out.println("Son " + billete10 + " billetes de 10");
        System.out.println("Son " + billete5 + " billetes de 5");

    }
}
