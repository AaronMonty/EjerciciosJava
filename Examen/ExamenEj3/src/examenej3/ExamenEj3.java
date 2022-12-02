/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenej3;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura
 */
public class ExamenEj3 {

    public static void main(String[] args) {

        int l1, l2, l3, mayor,suma;
        
        String tipoTriangulo;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer lado");
        l1 = entrada.nextInt();

        System.out.println("Introduce el segundo lado");
        l2 = entrada.nextInt();

        System.out.println("Introduce el tercer lado");
        l3 = entrada.nextInt();

        mayor = l1;

        if (l2 > mayor) {
            mayor = l2;
        } 

        if (l3 > mayor) {
            mayor = l3;
        }
        
        suma=l1+l2+l3-mayor;

        if (mayor<suma) {
            
            if ((l1==l2)&&(l2==l3)) {
               tipoTriangulo="Triangulo Equilatero"
            }
            
        }
        
    }

}
