package ejjoanarreglado;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjJoanArreglado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Nombre (Strings)
        //Apellidos (Strings)
        //Notas1rExamen(floats)
        //MayorEdad(boolean)
        //Sexo (char)
        Scanner lector = new Scanner(System.in);
        String[] Nombre = new String[3];
        String[] Apellidos = new String[3];      //MISMO TAMA�O
        float[] Notas1rExamen = new float[3];
        boolean[] MayorEdad = new boolean[3];
        char[] Sexo = new char[3];
        boolean end = false;
        while (!end) {
            System.out.println("1.InicializarDatos\n2.InformacionAlumnoX\n3.A�adirInformacionAlumno(ID)\n4.VerTodo\n5.Salir");
            int opcion = lector.nextInt();
            lector.nextLine();
            switch (opcion) {
                case 1:
                    InicializarDatos(Nombre, Apellidos, MayorEdad, Sexo);
                    break;
                case 2:
                    System.out.println("Dame el nombre del alumno a buscar");
                    String AlumnoABuscar = lector.nextLine();
                    InfoAlumno(Nombre, Apellidos, Notas1rExamen, MayorEdad, Sexo, AlumnoABuscar);
                    break;
                case 3:
                    System.out.println("Dame el ID");
                    int ID = lector.nextInt();
                    lector.nextLine();
                    AddInfoAlumno(Nombre, Apellidos, Notas1rExamen, MayorEdad, Sexo, ID);
                    break;
                case 4:
                    ImprimirVector(Nombre);
                    ImprimirVector(Apellidos);
                    ImprimirVector(MayorEdad);
                    ImprimirVector(Sexo);
                    //ImprimirVector(Notas1rExamen);
                    break;
                case 5:
                    end = true;
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        }
    }

    public static void InfoAlumno(String[] Nombre, String[] Apellidos, float[] Notas1rExamen, boolean[] MayorEdad, char[] Sexo, String AlumnoABuscar) {
        boolean encontrado = false;
        for (int i = 0; i < Nombre.length && !encontrado; i++) {
            if (Nombre[i].equals(AlumnoABuscar)) {
                System.out.println(Nombre[i] + " " + Apellidos[i] + " " + Notas1rExamen[i] + " ");
                if (MayorEdad[i]) {
                    System.out.print("EsMayorEdad ");
                } else {
                    System.out.print("EsMenorEdad ");
                }
                System.out.print(Sexo[i] + "\n");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado");
        }
    }

    public static void AddInfoAlumno(String[] Nombre, String[] Apellidos, float[] Notas1rExamen, boolean[] MayorEdad, char[] Sexo, int ID) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dame el nombre del alumno ");
        Nombre[ID] = lector.nextLine();
        System.out.println("Dame el apellido del alumno ");
        Apellidos[ID] = lector.nextLine();
        System.out.println("�Eres mayor edad? S/N");
        char mayorEdad = lector.nextLine().charAt(0);
        while (mayorEdad != 'S' && mayorEdad != 'N') {
            System.out.println("Introduce valor correcto S/N");
            mayorEdad = lector.nextLine().charAt(0);
        }
        if (mayorEdad == 'S') {
            MayorEdad[ID] = true;
        } else {
            MayorEdad[ID] = false;
        }

        char sexo;
        System.out.println("Introduce tu sexo H/M");
        sexo = lector.nextLine().charAt(0);
        while (sexo != 'H' && sexo != 'M') {
            System.out.println("Introduce valor correcto H/M");
            sexo = lector.nextLine().charAt(0);
        }
        Sexo[ID] = sexo;
        System.out.println("Dame la nota del 1rExamen");
        Notas1rExamen[ID] = lector.nextFloat();
    }

    public static void InicializarDatos(String[] Nombre, String[] Apellidos, boolean[] MayorEdad, char[] Sexo) {
        int N = Nombre.length;
        if (N != Apellidos.length || N != MayorEdad.length || N != Sexo.length) {
            System.out.println("Error, vectores distinto tama�o");
        } else {
            for (int i = 0; i < N; i++) {
                Scanner lector = new Scanner(System.in);
                System.out.println("Dame el nombre del alumno " + i);
                Nombre[i] = lector.nextLine();
                System.out.println("Dame el apellido del alumno " + i);
                Apellidos[i] = lector.nextLine();
                System.out.println("�Eres mayor edad? S/N");
                char mayorEdad = lector.nextLine().charAt(0);
                while (mayorEdad != 'S' && mayorEdad != 'N') {
                    System.out.println("Introduce valor correcto S/N");
                    mayorEdad = lector.nextLine().charAt(0);
                }
                if (mayorEdad == 'S') {
                    MayorEdad[i] = true;
                } else {
                    MayorEdad[i] = false;
                }

                char sexo;
                System.out.println("Introduce tu sexo H/M");
                sexo = lector.nextLine().charAt(0);
                while (sexo != 'H' && sexo != 'M') {
                    System.out.println("Introduce valor correcto H/M");
                    sexo = lector.nextLine().charAt(0);
                }
                Sexo[i] = sexo;
            }
        }

    }

    public static void ImprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    public static void ImprimirVector(float[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    public static void ImprimirVector(String[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    public static void ImprimirVector(char[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    public static void ImprimirVector(boolean[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
            
            //Mio
//             if (vector[i]) {
//
//                System.out.print("Si es mayor de edad ");
//
//            } else {
//
//                System.out.print("No es mayor de edad ");
//
//            }
        }
        System.out.println();
    }

}
