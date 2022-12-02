/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicando2;

import java.util.Scanner;

/**
 *
      <1 hora                           ->0'50/min
      >=1 hora && <2 horas              -> 0,45/min
      >=2 horas                         -> 0'30/min
      Empieza entre las 21:00 y 6:00    -> 5%
      Juego online                      -> 5€
 *
 * 
 *
 *
 * @author Aaron Monterroso Segura 20/10/2022
 */
public class Practicando2 {

    public static void main(String[] args) {

        //Declaramos las variables
        float precioMinuto,minutos, total=0,impuestos=0;

        int horaEmpieza, minutosEmpieza;

        boolean juego;

        Scanner entrada = new Scanner(System.in);

        //Preguntamos al usuario los datos
        System.out.println("Cuanto rato has estado en el pc? (Introducelo en minutos 1h=60 Minutos)");
        minutos = entrada.nextFloat();

        System.out.println("A que hora vas a empezar a jugar? (Formato: Horas y Minutos)");
        horaEmpieza = entrada.nextInt();
        minutosEmpieza = entrada.nextInt();

        System.out.println("Vas a jugar a un juego online? (Formato: S/N)");
        // Defininimos la variable juego que si es igual a (S) sea verdadero
        juego = entrada.next().charAt(0) == 'S';
        
   

        if (minutos < 0 || minutosEmpieza < 0 || horaEmpieza < 0 || horaEmpieza > 23 || minutosEmpieza > 59) {

            System.out.println("Introduce valores correctos");

        } else {

            if (minutos < 60) {

                total = minutos * 0.50F;

            }else if (minutos>60 && minutos<120){
            
                            total=minutos*0.45F;

            }else{
            
                total=minutos*0.30F;
                
            }
            
            if (horaEmpieza>=21 || horaEmpieza<6) {
                
                impuestos=minutos*0.5F;
                
            }
            if (juego) {
                
                total+=+5;
                
            }
            
            System.out.println("El total por haber usado el pc es de "+total);
            System.out.println("El total de impuestos por jugar de noche es de "+impuestos);
            if (juego) {
                
                System.out.println("Por haber jugado a juegos online se te suma 5 euros ");
                
            }
            
        }

    }

}
