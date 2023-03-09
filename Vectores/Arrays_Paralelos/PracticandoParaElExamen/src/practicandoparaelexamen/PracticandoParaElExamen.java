/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicandoparaelexamen;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura 09/02/2023
 */
public class PracticandoParaElExamen {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int N;

        System.out.println("Dime el tamaño de todos los vectores");
        N = entrada.nextInt();

        while (N <= 0) {

            System.out.println("Porfavor introduce un numero valido para seguir con el programa");
            N = entrada.nextInt();
        }

        String[] CodigoAula = new String[N];
        String[] NombreProfe1 = new String[N];
        String[] NombreProfe2 = new String[N];
        int[] NumAula = new int[N];
        int[] DNIProfe1 = new int[N];
        int[] DNIProfe2 = new int[N];
        boolean[] OcupadaTurnoM = new boolean[N];
        boolean[] OcupadaTurnoT = new boolean[N];

        boolean end = false;

        while (!end) {
            System.out.println("1.AñadirAula\n2.MostrarContenido\n3.MostrarProfesoresAula\n4.MostrarAulasOcupadas\n5.MostrarAulasProfeDni\n6.Salir");
            int opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:

                    añadirAula(CodigoAula, NombreProfe1,
                            NombreProfe2, DNIProfe1, DNIProfe2,
                            NumAula, OcupadaTurnoM, OcupadaTurnoT);

                    break;
                case 2:
                    mostrarContenido(CodigoAula, NombreProfe1,
                            NombreProfe2, DNIProfe1, DNIProfe2,
                            NumAula, OcupadaTurnoM, OcupadaTurnoT);
                    break;
                case 3:
                    int aula;
                    System.out.println("Dime un numero de aula");
                    aula = entrada.nextInt();
                    mostrarProfesor(NombreProfe1, NombreProfe2, NumAula, aula);
                    break;
                case 4:
                    char letra;
                    System.out.println("Dime un turno y te mostrare las aulas que estan ocupadas (M=Mañana o T=Tarde o A=Ambos)");
                    letra = entrada.nextLine().charAt(0);

                    while (letra != 'M' || letra != 'T' || letra != 'A') {
                        System.out.println("Te equivocaste de letra o la pusiste en minuscula el formato es este (M=Mañana o T=Tarde o A=Ambos)");
                        letra = entrada.nextLine().charAt(0);

                    }

                    break;
                case 5:
                    int dni;
                    System.out.println("Dime el dni y te dire todas las aulas donde esta asignado ese profe con el dni");
                    dni = entrada.nextInt();
                    break;
                case 6:
                    end = true;
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        }
    }

    public static void añadirAula(String[] CodigoAula,
            String[] NombreProfe1, String[] NombreProfe2,
            int[] DNIProfe1, int[] DNIProfe2, int[] NumAula,
            boolean[] OcupadaTurnoM, boolean[] OcupadaTurnoT) {

        for (int i = 0; i < CodigoAula.length; i++) {

            Scanner entrada = new Scanner(System.in);
            System.out.println("Dime el codigo del aula ");
            CodigoAula[i] = entrada.nextLine();
            System.out.println("Dime el numero del aula ");
            NumAula[i] = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Dime el nombre del professor 1");
            NombreProfe1[i] = entrada.nextLine();
            System.out.println("Dime su dni ");
            DNIProfe1[i] = entrada.nextInt();
            System.out.println("Dime el nombre del professor 2");
            entrada.nextLine();
            NombreProfe2[i] = entrada.nextLine();
            System.out.println("Dime su dni");
            DNIProfe2[i] = entrada.nextInt();

            System.out.println("El aula esta ocupada por la mañana? (true=Si || false=No)");
            OcupadaTurnoM[i] = entrada.nextBoolean();
            System.out.println("El aula esta ocupada por la tarde?  (true=Si || false=No)");
            OcupadaTurnoT[i] = entrada.nextBoolean();

        }

    }

    public static void mostrarContenido(String[] CodigoAula,
            String[] NombreProfe1, String[] NombreProfe2,
            int[] DNIProfe1, int[] DNIProfe2, int[] NumAula,
            boolean[] OcupadaTurnoM, boolean[] OcupadaTurnoT) {

        for (int i = 0; i < CodigoAula.length; i++) {

            System.out.println(CodigoAula[i] + " " + NumAula[i] + " " + NombreProfe1[i] + " " + DNIProfe1[i] + " " + NombreProfe2[i] + " " + DNIProfe2[i] + " " + OcupadaTurnoM[i] + " " + OcupadaTurnoT[i]);

        }

    }

    public static void mostrarProfesor(String[] NombreProfe1, String[] NombreProfe2, int[] NumAula, int aula) {

        for (int i = 0; i < NombreProfe1.length; i++) {

            if (NumAula[i] == aula) {

                System.out.println(NombreProfe1[i] + " " + NombreProfe2[i]);

            } else {
                System.out.println("No se ha encontrado");
            }

        }

    }

    public static void aulasOcupadas(String[] CodigoAula, boolean[] OcupadaTurnoM, boolean[] OcupadaTurnoT, char letra) {

        for (int i = 0; i < CodigoAula.length; i++) {

            if (true) {

            }

        }

    }

//    public static void mostrarAulas() {
//
//        for (int i = 0; i < 10; i++) {
//            if (DNIProfe1==DNI || DNIProfe2==DNI) {
//                
//            }
//        }
//        
//    }

}
