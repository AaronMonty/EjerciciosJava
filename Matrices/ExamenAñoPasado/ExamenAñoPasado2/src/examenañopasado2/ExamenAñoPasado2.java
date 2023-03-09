/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenañopasado2;

/**
 *
 * @author Aaron Monterroso Segura
 */
import java.util.Random;

public class ExamenAñoPasado2 {

    public static void main(String[] args) {
        int[] numeros = createArray();
        imprimirArray(numeros);
        remplazarTodos(numeros, 5, 0);
        imprimirArray(numeros);
        remplazarPrimero(numeros, 5, 0);
        imprimirArray(numeros);
    }

    public static int[] createArray() {
        int[] numeros = new int[20];
        Random aleatorio = new Random();
        for (int i = 0; i < 20; i++) {
            numeros[i] = aleatorio.nextInt(11);
        }
        return numeros;
    }

    public static void remplazarTodos(int[] numeros, int antiguoValor, int nuevoValor) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == antiguoValor) {
                numeros[i] = nuevoValor;
            }
        }
    }

    public static void remplazarPrimero(int[] numeros, int antiguoValor, int nuevoValor) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == antiguoValor) {
                numeros[i] = nuevoValor;
            }
        }
    }

    public static void imprimirArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
}
