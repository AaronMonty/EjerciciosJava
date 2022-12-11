/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion18;

import java.util.Scanner;

/**
 * . El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera: Se
 * divide el número de DNI entre 23 y el resto es codificado por una letra según
 * la siguiente equivalencia: 0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6:
 * "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B", 12: "N", 13: "J", 14: "Z", 15:
 * "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E". Escribe
 * un programa que pida el DNI y muestre por pantalla la letra asociada. Para
 * ello se deberá crear una función a la que se le pase el número y devuelva la
 * letra. Ejemplo: para el DNI 56321122 el NIF es ‘X’.
 *
 *
 * @author Aaron Monterroso Segura 30/11/2022
 */
public class Funcion18 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numeroDNI;

        System.out.println("Introduce nuevamente su DNI");
        numeroDNI = entrada.nextInt();

        System.out.println("La letra que corresponde a tu dni es " + dniLetra(numeroDNI));
    }

    public static char dniLetra(int dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        int sobra = dni % 23;

        return letras.charAt(sobra);

    }

}
