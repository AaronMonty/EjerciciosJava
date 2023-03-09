/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 13/02/2023
 */
public class Ej3 {

    public static String[] especie;
    public static int[] numeroDeEjemplares;
    public static boolean[] Peligroso;
    public static int N;
    public static int ID;
    public static String nombre;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un tamaño de vector");
        N = entrada.nextInt();
        while (N < 0) {
            System.out.println("Introduciste numeros negativos ");
            N = entrada.nextInt();
        }
        especie = new String[N];
        numeroDeEjemplares = new int[N];
        Peligroso = new boolean[N];
        boolean fin = false;
        while (!fin) {
            System.out.println("1.AñadirEspecie\n2.ModificarEspecie\n3.MostrarTodo\n4.Salir");
            int opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Dime la ID donde rellenar el vector");
                    ID = entrada.nextInt();
                    //Error me falto un ID >=N
                    while (ID < 0 || ID > N) {

                        System.out.println("Introduciste valores incorrectos");
                        ID = entrada.nextInt();
                    }
                    añadirEspecie();
                    break;
                case 2:
                    System.out.println("Dime un nombre de especie");
                    nombre = entrada.nextLine();
                    modificarEspecie();
                    break;
                case 3:
                    mostrarTodo();
                    break;
                case 4:
                    fin = true;
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        }
    }

    public static void añadirEspecie() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime la especie");
        especie[ID] = entrada.nextLine();
        System.out.println("Cuantos ejemplares hay?");
        numeroDeEjemplares[ID] = entrada.nextInt();
        ejemplaresNegativosNo();
        System.out.println("Es peligrosa la especie? (Respeta el siguiente formato (true=Si || false=No)) ");
        entrada.nextLine();
        Peligroso[ID] = entrada.nextBoolean();
    }

    public static void modificarEspecie() {
        Scanner entrada = new Scanner(System.in);
        
        //Error me falto un for y cambiar los id por la i del for 
        if (especie[ID].equals(nombre)) {
            System.out.println("Cuantos ejemplares hay ahora?");
            numeroDeEjemplares[ID] = entrada.nextInt();
            ejemplaresNegativosNo();
            System.out.println("Es peligrosa la especie? (Respeta el siguiente formato (true=Si || false=No))");
            Peligroso[ID] = entrada.nextBoolean();
        } else {
            System.out.println("No se ha encontrado");
        }
    }

    public static void mostrarTodo() {
        for (int i = 0; i < especie.length; i++) {
            System.out.print(especie[i] + " " + numeroDeEjemplares[i]);
            if (Peligroso[i]) {
                System.out.print(" Si");
            } else {
                System.out.print(" No");
            }
            System.out.println();
        }
    }

    public static void ejemplaresNegativosNo() {
        Scanner entrada = new Scanner(System.in);
        while (numeroDeEjemplares[ID] < 0) {
            System.out.println("No se pueden tener ejemplares negativos");
            numeroDeEjemplares[ID] = entrada.nextInt();
        }
    }
}
