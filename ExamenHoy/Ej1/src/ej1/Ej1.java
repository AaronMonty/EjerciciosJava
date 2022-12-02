/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 21/11/2022
 */
public class Ej1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        float dinero, precio = 0, devolver;
        boolean arriba = false;
        do {

            do {
                //Creamos el primer Menu con las categorias 
                System.out.println("MENU PRINCIPAL: ");

                System.out.println("1. REFRESCOS");
                System.out.println("2. CAFE");
                System.out.println("3. SNACKS");
                System.out.println("4. SALIR");
                System.out.println("Elige una opcion");
                opcion = entrada.nextInt();

                //El primer switch con las opciones
                switch (opcion) {
                    case 1:
                        //Dentro del switch creamos otro menu con los distintos tipos de refrescos
                        System.out.println("MENU REFRESCOS");

                        System.out.println("1. Agua");
                        System.out.println("2. CocaCola");
                        System.out.println("3. Fanta");
                        System.out.println("4. Monster");
                        System.out.println("5. RedBull");
                        System.out.println("6. Salir");
                        System.out.println("Elige una opcion");
                        opcion = entrada.nextInt();

                        //Mandamos un mensaje de interaccion al usuario corresponiendo con lo que ha pedido
                        switch (opcion) {
                            case 1:
                                System.out.println("Elegiste Agua");
                                break;
                            case 2:
                                System.out.println("Elegiste CocaCola");
                                break;
                            case 3:
                                System.out.println("Elegiste Fanta");
                                break;
                            case 4:
                                System.out.println("Elegiste Monster");
                                break;
                            case 5:
                                System.out.println("Elegiste RedBull");
                                break;
                            case 6:
                                System.out.println("Volviendo al menu principal");
                                break;
                            default:
                                System.out.println("Elegiste una opcion incorrecta");
                        }
                        break;
                    case 2:
                        //Creamos el segundo menu de la categoria cafe
                        System.out.println("MENU CAFE");

                        System.out.println("1. Cafe Solo");
                        System.out.println("2. Cafe con Leche");
                        System.out.println("3. Cafe con Hielo");
                        System.out.println("4. Cafe Descafeinado");
                        System.out.println("5. Cafe Negro");
                        System.out.println("6. Salir");
                        System.out.println("Elige una opcion");
                        opcion = entrada.nextInt();

                        //Ponemos mensajes interaccion para el usuario diciendo que cafe escogio
                        switch (opcion) {
                            case 1:
                                System.out.println("Elegiste Cafe Solo");
                                break;
                            case 2:
                                System.out.println("Elegiste Cafe con Leche");
                                break;
                            case 3:
                                System.out.println("Elegiste Cafe con hielo");
                                break;
                            case 4:
                                System.out.println("Elegiste Cafe Descafeinado");
                                break;
                            case 5:
                                System.out.println("Elegiste Cafe Negro");
                                break;
                            case 6:
                                System.out.println("Volviendo al menu principal");
                                break;
                            default:
                                System.out.println("Elegiste una opcion incorrecta");
                        }
                        break;
                    case 3:
                        //Creamos el menu de snacks 
                        System.out.println("MENU SNACKS");

                        System.out.println("1. Doritos");
                        System.out.println("2. Pringles");
                        System.out.println("3. Fantasmitos");
                        System.out.println("4. Lays");
                        System.out.println("5. PapaDeltas");
                        System.out.println("6. Salir");
                        System.out.println("Elige una opcion");
                        opcion = entrada.nextInt();

                        //Ponemos mensajes interaccion para el usuario diciendo que snack escogio
                        switch (opcion) {
                            case 1:
                                System.out.println("Elegiste Doritos");
                                break;
                            case 2:
                                System.out.println("Elegiste Pringles");
                                break;
                            case 3:
                                System.out.println("Elegiste Fantasmitos");
                                break;
                            case 4:
                                System.out.println("Elegiste Lays");
                                break;
                            case 5:
                                System.out.println("Elegiste PapaDeltas");
                                break;
                            case 6:
                                System.out.println("Volviendo al menu principal");
                                break;
                            default:
                                System.out.println("Elegiste una opcion incorrecta");
                        }
                        break;
                    case 4:
                        System.out.println("Adios, vuelva cuando quiera");
                        break;
                    default:
                        System.out.println("Error,elige una opcion de 1 al 3 para elegir menu, y 4 para salir");
                }
                //Si la opcion es la incorrecta volvera al principio poniendo un mensaje de interaccion
            } while (opcion < 1 || opcion > 5);

            //Calculamos el precio de los productos sumando la i de 2 en 2 y despues multiplicando la opcion por 2
            for (int i = 0; i <= opcion; i = i + 2) {

                precio = opcion * 2;
            }
            //Mostramos el precio del producto que escogio el usuario
            System.out.println("El precio a pagar es de " + precio + " euros ");

            //Le pedimos al usuario que introduzca el dinero
            System.out.println("Introduzca el dinero");
            dinero = entrada.nextFloat();

            //Comparamos el dinero con el precio del producto si es menor para que lo introduzca de nuevo
            while (dinero < precio) {

                System.out.println("Error, el precio es de " + precio + " euros ");
                dinero = entrada.nextFloat();
            }
            //Hacemos la resta para devolver el cambio
            devolver = dinero - precio;
            System.out.println("Tu cambio es de " + devolver + " euros ");

            arriba = true;
            System.out.println("Gracias por comprar ");
        } while (arriba);
    }

}
