/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej1examenantiguo;

import java.util.Scanner;

/**
 *
 * Escribe un programa que pida números al usuario. El programa pedirá valores
 * numéricos al usuario, y parará cuando lleve 3 números introducidos que sean
 * divisibles por 5. Al terminar, debe mostrar cuántos números has introducido
 * en total, y debe mostrar la suma de los 3 números divisibles por 5.
 *
 * @author Aaron Monterroso Segura 18/11/2022
 */
public class BucleEj1ExamenAntiguo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = 0, divisible5 = 0, total = 0;

        while (divisible5 != 3) {

            System.out.print("Introduce un numero? ");
            numero = entrada.nextInt();

            total++;

            if (numero % 5 == 0) {
                numero += numero;
                divisible5++;

            }
        }
        System.out.println("Has introducido un total de " + total);
        System.out.println("La suma total de los divisibles entre 5 suman " + numero);

    }

}
