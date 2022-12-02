/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej13;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el
 * ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo números
 * una y otra vez hasta adivinarlo (el usuario deberá indicarle al ordenador si
 * es mayor, menor o igual al número que ha pensado).
 *
 *
 * @author Aaron Monterroso Segura 06/11/2022
 */
public class BucleEj13 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);
        int numeroUsuario, numeroMinimo = 0, numeroMaximo = 101, mayorMenorIgual;
        boolean acertado = false;

        System.out.println("Piensa un numero del 1 al 100 y intentare adivinarlo");

        do {

            numeroUsuario = aleatorio.nextInt(numeroMinimo, numeroMaximo);
            System.out.println("El numero en el que estas pensando es el " + numeroUsuario);
            System.out.println("El numero que estas pensando es ( 1) mayor || 2) menor || 3) el mismo)");
            mayorMenorIgual = entrada.nextInt();

            switch (mayorMenorIgual) {
                case 1:

                    if (numeroUsuario > numeroMinimo) {

                        numeroMinimo = numeroUsuario;

                    }

                    break;
                case 2:

                    if (numeroUsuario < numeroMaximo) {

                        numeroMaximo = numeroUsuario;

                    }

                    break;
                case 3:
                    acertado = true;
                    System.out.println("Encontre tu numero !");
                    break;
                default:
                    System.out.println("Opcion incorrecta vuelva a elegir");
            }

        } while (!acertado);

    }

}
