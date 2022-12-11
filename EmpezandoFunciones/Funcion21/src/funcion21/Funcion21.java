/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion21;

import java.util.Scanner;

/**
 *
 * . Escribe un programa que muestre un menú con 2 opciones: “1.Circunferencia”
 * y “2.Área”. En ambas se le pedirá al usuario que introduzca un radio y luego
 * se le mostrará el cálculo oportuno. Implementa las funciones: int menu() //
 * Muestra el menú y devuelve el número elegido double pideRadio() // Pide que
 * se introduzca el radio y lo devuelve double circunferencia(double r) //
 * Calcula la circunferencia y la devuelve double area(double r) // Calcula el
 * área y la devuelve Modifica el programa añadiendo otra opción llamada
 * “Volumen”, permitiendo que el usuario también pueda solicitar el cálculo del
 * volumen. Añade la función: double volumen(double r) // Calcula el volumen y
 * lo devuelve Modifica el programa añadiendo otra opción llamada “Todas” en la
 * que se pida el radio una sola vez y se muestren los tres cálculos posibles
 * (circunferencia, área y volumen). Modifica el programa anterior de modo que
 * el proceso se repita una y otra vez (mostrar menú -> realizar el cálculo ->
 * volver a mostrar menú). Añade una opción más llamada “Salir” que terminará el
 * programa si es elegida.
 *
 *
 *
 * @author Aaron Monterroso Segura 01/12/2022
 */
public class Funcion21 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Menu ");

        System.out.println("1.Circuferencia\n2.Area");
        opcion = entrada.nextInt();
        menu(opcion);
        
        
    }

    public static int menu(int opcion) {

        if (opcion == 1) {
            return 1;
        } else {
            return 2;
        }

    }

}
