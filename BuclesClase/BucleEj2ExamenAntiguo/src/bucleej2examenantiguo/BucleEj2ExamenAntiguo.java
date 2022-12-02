/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej2examenantiguo;

import java.util.Scanner;

/**
 * Si el usuario elige una opción no correcta deberá aparecer el mensaje:
 * “Opción No Válida”. (0,25 pts) ● Opción 0 el programa acabará y dará las
 * gracias (0,5 pt). ● Opción 1 escribir 15 veces: (0,5pt) Deberá escribir 15
 * veces en pantalla: “A clase se viene a trabajar”, mostrando cada frase en una
 * línea diferente y con el número delante: 1 A clase se viene a trabajar 2 A
 * clase se viene a trabajar 3 A clase se viene a trabajar … 10 A clase se viene
 * a trabajar ● Opción 2. Cuenta atrás gong: muestra por pantalla, en la misma
 * línea, una cuenta atrás de 10 hasta 0 y al acabar escribirá “GOONNGGGG!!!!!”
 * en la misma línea. (0,75 pts) 10 9 8 7 6 5 4 3 2 1 0 GOONNGGGG!!!!! ● Opción
 * 3. Números impares entre dos valores: el programa te pedirá dos números y
 * mostrará por pantalla los números impares que hay entre los dos (del más
 * pequeño al más grande).(1,5pts)
 *
 *
 * @author Aaron Monterroso Segura 18/11/2022
 */
public class BucleEj2ExamenAntiguo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion = 0;

        System.out.println("****** MENU ******");
        System.out.println("0-Salir");
        System.out.println("1-Escribir 15 Veces");
        System.out.println("2-Cuenta atras GONG");
        System.out.println("3-Numero Impares entre 2 valores");
        System.out.println("Elige tu opcion: ");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 0:
                System.out.println("Gracias ");
                break;
            case 1:
                for (int i = 1; i <=15; i++) {
                    System.out.println(i + " A clase se viene a trabajar");
                }
                break;
            case 2:
                for (int i = 10; i >= 0; i--) {
                    System.out.print(i + " ");
                }
                System.out.println("GOONNGGG!!!!");
                break;
            case 3:
                int numeroA = 0,
                 numeroB = 0;

                System.out.println("Introduce un numero");
                numeroA = entrada.nextInt();

                System.out.println("Introduce otro numero");
                numeroB = entrada.nextInt();

                for (int i = numeroA; i <= numeroB; i++) {

                    if (i % 2 == 1) {

                        System.out.print(i + " ");

                    }

                }

                break;

            default:
                System.out.println("Opcion no valida");
        }

    }

}
