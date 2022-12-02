/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicando;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 23/10/2022
 */
public class Practicando {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion, mes, any, fortuna = 0;

        char moneda;

        String deseo;

        System.out.println("Introduce una moneda (Formato: S/N)");
        moneda = entrada.next().charAt(0);

        switch (moneda) {
            case 'S':
                //Titulo
                System.out.println("Zoltar Habla!");
                System.out.println("1. Pide un deseo");
                System.out.println("2. Abre una galleta de la suerte");
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Pide tu deseo: ");
                        entrada.nextLine();
                        break;
                    case 2:
                        System.out.println("Introduce tu fecha de nacimiento (Formato: mes/any)");
                        mes = entrada.nextInt();
                        any = entrada.nextInt();

                        if (any < 0 || mes < 0) {

                            System.out.println("Solo se pueden numeros positivos ");

                        } else {
                            switch (mes) {
                                case 1:

                                    System.out.println("Tu signo zodiacal es Acuario");
                                    fortuna = any + 1;
                                    break;
                                case 2:

                                    System.out.println("Tu signo zodiacal es Piscis");
                                    fortuna = any + 2;
                                    break;
                                case 3:

                                    System.out.println("Tu signo zodiacal es Aries");
                                    fortuna = any + 3;
                                    break;
                                case 4:

                                    System.out.println("Tu signo zodiacal es Tauro");
                                    fortuna = any + 4;
                                    break;
                                case 5:

                                    System.out.println("Tu signo zodiacal es Geminis");
                                    fortuna = any + 5;
                                    break;
                                case 6:

                                    System.out.println("Tu signo zodiacal es Cancer");
                                    fortuna = any + 6;
                                    break;
                                case 7:

                                    System.out.println("Tu signo zodiacal es Leo");
                                    fortuna = any + 7;
                                    break;
                                case 8:

                                    System.out.println("Tu signo zodiacal es Virgo");
                                    fortuna = any + 8;
                                    break;
                                case 9:

                                    System.out.println("Tu signo zodiacal es Libra");
                                    fortuna = any + 9;
                                    break;
                                case 10:

                                    System.out.println("Tu signo zodiacal es Escorpion");
                                    fortuna = any + 10;
                                    break;
                                case 11:

                                    System.out.println("Tu signo zodiacal es Sagitario");
                                    fortuna = any + 11;
                                    break;
                                case 12:

                                    System.out.println("Tu signo zodiacal es Capricornio");
                                    fortuna = any + 12;
                                    break;
                            }

                            switch (fortuna % 5) {
                                case 4:
                                    System.out.println("Fortuna: Enfrentar la verdad con dignidad");
                                    break;
                                case 3:
                                    System.out.println("Fortuna: Te espera una emocionante aventura");
                                    break;
                                case 2:
                                    System.out.println("No esperes a que llegue el exito ves a buscarlo");
                                    break;
                                case 1:
                                    System.out.println("Fortuna: Persigue tus sueños con vigor");
                                    break;
                                case 0:
                                    System.out.println("Fortuna: Cuidate primero. Entonces ayuda a los demas");
                                    break;

                            }

                        }
                        break;
                    default:
                        System.out.println("Introduciste una opcion no valida ");
                        break;
                }
                break;

            case 'N':
                System.out.println("Vuelva pronto");
                break;
            default:
                System.out.println("Error no introduciste S o N");
                break;
        }

    }

}
