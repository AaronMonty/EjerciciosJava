/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploarraysparalelos;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 06/02/2023
 */
public class EjemploArraysParalelos {

    public static void main(String[] args) {

        //Nombre [Strings]
        //Apellidos (Strings)
        //Notas1rExamen(floats)
        //MayorEdad (Boolean)
        //Sexo (char)
        Scanner entrada = new Scanner(System.in);
        String[] Nombre = new String[50];
        String[] Apellidos = new String[50];
        float[] Notas1rExamen = new float[50];
        boolean[] MayorEdad = new boolean[50];
        char[] Sexo = new char[50];
        boolean end = false;

        System.out.println("1.InicializarDatos\n2.InformacionAlumnoX\n3.AñadirInformacionAlumno(ID)\n4.VerTodo\n5.Salir");
        int opcion = entrada.nextInt();
        while (!end) {
            switch (opcion) {
                case 1:

                    break;
                case 2:
                    
                    break;
            }
        }
    }

    public static void InicializarDatos(String[] Nombre, String[] Apellidos, boolean[] MayorEdad, char[] Sexo) {

        int N = Nombre.length;

        if (N != Apellidos.length || N != MayorEdad.length || N != Sexo.length) {

            System.out.println("Error, vectores distino tamaño");

        } else {

            for (int i = 0; i < N; i++) {

                Scanner entrada = new Scanner(System.in);
                System.out.println("Dame el nombre del alumno: " + i);
                Nombre[i] = entrada.nextLine();
                System.out.println("Dame el apellido del alumno: " + i);
                Apellidos[i] = entrada.nextLine();
                System.out.println("¿Eres Mayor de edad? S/N");

                char mayorEdad = entrada.nextLine().charAt(i);

                while (mayorEdad != 'S' && mayorEdad != 'N') {
                    System.out.println("Introduce valor correcto S/N");
                    mayorEdad = entrada.nextLine().charAt(i);
                }

                if (mayorEdad == 'S') {
                    MayorEdad[i] = true;
                } else {
                    MayorEdad[i] = false;
                }

                char sexo;
                System.out.println("Introduce tu sexo H/M");
                sexo = entrada.nextLine().charAt(i);

            }

        }

    }

    public static void ImprimirVector(char[] vector) {

        for (int i = 0; i < vector.length; i++) {

        }

    }

}
