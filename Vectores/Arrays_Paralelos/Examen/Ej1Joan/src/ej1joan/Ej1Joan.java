/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1joan;

/**
 *
 * @author Aaron Monterroso Segura 
 */
public class Ej1Joan {

    
    public static void main(String[] args) {
    }
    
    public static boolean es_semisuma(int[] vector){
        
        int N=vector.length;
        if (N%2==0) {
            
            int suma1aMitad=0,suma2aMitad=0;
            for (int i = 0; i < N/2; i++) {
                suma1aMitad+=vector[i];
            }
            for (int i=N/2; i <N; i++) {
                suma2aMitad+=vector[i];
            }
            if (suma1aMitad==suma2aMitad) {
                return true;
            }
            
        }else return false;
        return false;
        
    }
    
    
}
