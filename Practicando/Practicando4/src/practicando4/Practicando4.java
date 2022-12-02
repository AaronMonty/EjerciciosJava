/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicando4;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 21/10/2022
 */
public class Practicando4 {

    public static void main(String[] args) {

        int personas, menores;

        float total, descuento, descontado;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantas personas vais a Port Aventura?");
        personas = entrada.nextInt();

        System.out.println("Cuantos menores hay en el grupo?");
        menores = entrada.nextInt();

        if (personas < 0 && menores < 0) {

            System.out.println("No se pueden numeros negativos");

        } else {

            if (personas <= 9) {

                personas = personas - menores;

                total = personas * 20 + menores * 10;

            } else if (personas <= 24) {

                personas = personas - menores;

                total = personas * 20 + menores * 10;

                descuento = total * 0.25F;

                total = total - descuento;

            } else {

                personas = personas - menores;

                total = ((personas - 1) * 20) + menores * 10;

                descuento = total * 0.25F;

                total = total - descuento;

            }

            System.out.println("El precio de la entrada sera de " + total);

        }

    }

}
