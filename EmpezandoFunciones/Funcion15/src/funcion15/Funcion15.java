/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion15;

/**
 *
 * @author Aaron Monterroso Segura
 */
public class Funcion15 {

    public static void main(String[] args) {

        int[] array = new int[100];
        double contenedor;
        contenedor = calcularMediaArray(array);

        System.out.println("La suma es de "+contenedor);
    }

    public static double calcularMediaArray(int[] a) {
        double total = 0.0;

        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }

        return total / a.length;
    }

}
