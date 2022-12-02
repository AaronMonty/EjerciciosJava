/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloque2extra2;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura
 */
public class Bloque2Extra2 {

   
    public static void main(String[] args) {
       
        
        float sueldoActual, aumento, sueldoNuevo, antiguedad;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Cual es tu sueldo actual?");
        sueldoActual = entrada.nextFloat();

        System.out.println("Quants anys portes a l'empresa?");
        antiguedad = entrada.nextFloat();

        if (antiguedad >= 10) {

            aumento = sueldoActual * 0.20F;

            sueldoNuevo = aumento + sueldoActual;

            System.out.println("Tu nuevo salario es de " + sueldoNuevo);
        } else if (antiguedad >= 5 && antiguedad < 10) {
            aumento = sueldoActual * 0.15F;

            sueldoNuevo = aumento + sueldoActual;

            System.out.println("Tu nuevo salario es de " + sueldoNuevo);
        } else if (antiguedad >= 2 && antiguedad < 5) {

            aumento = sueldoActual * 0.10F;

            sueldoNuevo = aumento + sueldoActual;

            System.out.println("Tu nuevo salario es de " + sueldoNuevo);

        } else if (antiguedad >= 1 && antiguedad < 2) {
            aumento = sueldoActual * 0.07F;
            sueldoNuevo = aumento + sueldoActual;

            System.out.println("Tu nuevo salario es de " + sueldoNuevo);
        } else if (antiguedad >0 && antiguedad <1) {
            aumento = sueldoActual * 0.05F;
            sueldoNuevo = aumento + sueldoActual;
            
            System.out.println("Tu nuevo salario es de "+sueldoNuevo);
            
        }else{
            System.out.println("Introduciste valores incorrectos");
        }
        
    }
    
}
