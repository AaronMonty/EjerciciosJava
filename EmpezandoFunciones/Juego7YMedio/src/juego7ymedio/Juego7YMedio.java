/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego7ymedio;
import java.util.Random;
/**
 *
 * @author Aaron Monterroso Segura 09/01/2022
 */
public class Juego7YMedio {

    public static void main(String[] args) {

        numero_carta_aleatorio(0,10);
        
    }

    public static int numero_carta_aleatorio(int carta) {

        Random aleatorio = new Random();
        
        carta=aleatorio.nextInt(0,10);
        
        return carta;
        
    }

}
