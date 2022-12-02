/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenej2;

import java.util.Scanner;

/**
 *
 * @author Aaron Monterroso Segura
 */
public class ExamenEj2 {

    public static void main(String[] args) {

        int adultos, infantil, personas, precioAdult, precioInfan;

        float totalDesc, total;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantos personas sois?");
        personas = entrada.nextInt();

        System.out.println("Y cuantos menores hay");
        infantil = entrada.nextInt();

        adultos = personas - infantil;

        precioAdult = adultos * 20;
        precioInfan = infantil * 10;

        total = precioAdult + precioInfan;

        
        if (personas <0 || infantil<0) {
            System.out.println("Error introduce valores correctos");
        }
        else if (personas > 1 && personas <= 9) {

            System.out.println("El precio por las entradas seria de " + total);

        } else if (personas >= 10 && personas <= 24) {

            totalDesc = total * 0.25F;

            totalDesc = total - totalDesc;

            System.out.println("El precio por las entradas mas el 25% de descuento es de " + totalDesc);

        } else if (personas >= 25) {

            adultos=adultos-1;
            
            totalDesc=total*0.25F;
            
            totalDesc=total-totalDesc;
            
            System.out.println("El precio por las entradas mas el 25% de descuento es de "+totalDesc+" y por superar las 25 personas 1 entradas es gratuita");
            
        }

    }

}
