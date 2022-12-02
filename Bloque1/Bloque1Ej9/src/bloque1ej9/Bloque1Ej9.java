/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque1ej9;

/**
 * Ejercicio9-Una persona rep un préstec de 10.000 € d'un banc i desitja saber
 * quant pagarà d'interès, si el banc li cobra una taxa del 27% anual i ha de
 * retornar el préstec en 2 anys.
 *
 *
 * @author Aaron Monterroso Segura 06/10/2022
 */
public class Bloque1Ej9 {

    public static void main(String[] args) {

        int prestamo = 10000;

        float tasa = 0.27F, tasatotal, totalinteres, totalapagar;

        tasatotal = tasa * 2;

        totalinteres = prestamo * tasatotal;

        System.out.println("La tasa total es de " + totalinteres);

        totalapagar = prestamo + totalinteres;

        System.out.println("La cantidad total a pagar mas intereses es de " + totalapagar);

    }

}
