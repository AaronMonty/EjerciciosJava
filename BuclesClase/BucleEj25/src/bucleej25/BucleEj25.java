/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleej25;

import java.util.Scanner;

/**
 *
 * @author Prueba
 */
public class BucleEj25 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1;

        System.out.println("Dime un numero para que te diga la tabla de multiplicar");
        numero1=entrada.nextInt();
        
        System.out.println("Tabla de Multiplicar de "+numero1);
        for (int i = 0; i <=10; i++) {
            
            System.out.println(numero1+"*"+i+"="+numero1*i);
            
            
        }

        
    }

}
