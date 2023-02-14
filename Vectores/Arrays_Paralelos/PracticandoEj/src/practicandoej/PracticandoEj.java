/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicandoej;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura
 */
public class PracticandoEj {

    public static String[] CodigoAula;
    public static String[] NombreProfe1;
    public static String[] NombreProfe2;
    public static int[] NumAula;
    public static int[] DNIProfe1;
    public static int[] DNIProfe2;
    public static boolean[] OcupadaTurnoM;
    public static boolean[] OcupadaTurnoT;
    public static int aula;
    public static int ID;
    public static int DNI;
    public static char letra;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N;

        System.out.println("Dime un tamaño de vector");
        N = entrada.nextInt();

        while (N < 1) {

            System.out.println("Introduciste 0 o numeros negativos ");
            N = entrada.nextInt();
        }

        CodigoAula = new String[N];
        NombreProfe1 = new String[N];
        NombreProfe2 = new String[N];
        NumAula = new int[N];
        DNIProfe1 = new int[N];
        DNIProfe2 = new int[N];
        OcupadaTurnoM = new boolean[N];
        OcupadaTurnoT = new boolean[N];

        boolean end = false;

        while (!end) {
            System.out.println("1.AñadirAula\n2.MostrarContenido\n3.MostrarProfesoresAula\n4.MostrarAulasOcupadas\n5.MostrarAulasProfeDni\n6.Salir");
            int opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:

                    System.out.println("Dime la posicion donde rellenar el vector");
                    ID = entrada.nextInt();

                    while (ID < 0 || ID > N) {

                        System.out.println("Introduciste valores incorrectos");
                        ID = entrada.nextInt();
                    }

                    añadirAula();

                    break;
                case 2:
                    mostrarContenido();
                    break;
                case 3:
                    System.out.println("Dime un numero de aula");
                    aula = entrada.nextInt();

                    while (aula < 0) {

                        System.out.println("No se pueden numeros negativos");
                        aula = entrada.nextInt();
                    }

                    mostrarProfesor();

                    break;
                case 4:
                    System.out.println("Dime un turno y te mostrare las aulas que estan ocupadas (M=Mañana o T=Tarde o A=Ambos)");
                    letra = entrada.nextLine().charAt(0);

                    while (letra != 'M' && letra != 'T' && letra != 'A') {
                        System.out.println("Te equivocaste de letra o la pusiste en minuscula el formato es este (M=Mañana o T=Tarde o A=Ambos)");
                        letra = entrada.nextLine().charAt(0);

                    }

                    break;
                case 5:

                    System.out.println("Dime el dni y te dire todas las aulas donde esta asignado ese profe con el dni");
                    DNI = entrada.nextInt();

                    while (DNI <= 0 || DNI > 99999999) {

                        System.out.println("Introduciste DNI incorrecto el formato es este(Min=1 Max=99999999)");

                    }

                    mostrarAulas();

                    break;
                case 6:
                    end = true;
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        }
    }

    public static void añadirAula() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime el codigo del aula ");
        CodigoAula[ID] = entrada.nextLine();
        System.out.println("Dime el numero del aula ");
        NumAula[ID] = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Dime el nombre del professor 1");
        NombreProfe1[ID] = entrada.nextLine();
        System.out.println("Dime su dni ");
        DNIProfe1[ID] = entrada.nextInt();
        System.out.println("Dime el nombre del professor 2");
        entrada.nextLine();
        NombreProfe2[ID] = entrada.nextLine();
        System.out.println("Dime su dni");
        DNIProfe2[ID] = entrada.nextInt();

        System.out.println("El aula esta ocupada por la mañana? (true=Si || false=No)");
        OcupadaTurnoM[ID] = entrada.nextBoolean();
        System.out.println("El aula esta ocupada por la tarde?  (true=Si || false=No)");
        OcupadaTurnoT[ID] = entrada.nextBoolean();
        
        
        

    }

    public static void mostrarContenido() {
        for (int i = 0; i < CodigoAula.length; i++) {

            System.out.println(CodigoAula[i] + " " + NumAula[i] + " " + NombreProfe1[i] + " " + DNIProfe1[i] + " " + NombreProfe2[i] + " " + DNIProfe2[i] + " " + OcupadaTurnoM[i] + " " + OcupadaTurnoT[i]);

        }

    }

    public static void mostrarProfesor() {

        for (int i = 0; i < NombreProfe1.length; i++) {

            if (NumAula[i] == aula) {

                System.out.println(NombreProfe1[i] + " " + NombreProfe2[i]);

            } else {
                System.out.println("No se ha encontrado");
            }

        }

    }

    public static void mostrarAulas() {

        for (int i = 0; i < DNIProfe1.length; i++) {
            if (DNIProfe1[i] == DNI || DNIProfe2[i] == DNI) {

                System.out.println(NumAula[i]);

            }
        }

    }

    public static void aulasOcupadas() {

        for (int i = 0; i < CodigoAula.length; i++) {

            if (letra=='M') {

                System.out.println(CodigoAula[i]);
                
            }

        }

    }
}
