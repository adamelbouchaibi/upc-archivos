/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.ordenacion.aleatorio;
import java.util.Random;
/**
 *
 * @author adam.el.bouchaibi
 */
public class OrdenaBurbuja {
    
    public static void main (String[] args){
        
        Random random = new Random();
        int arrayEnteros[]=new int[random.nextInt(10)+1];
        
        for(int i=0;i<arrayEnteros.length;i++){
            arrayEnteros[i]=random.nextInt(40);
        }
        System.out.print("El array sin ordenar es: \n[ ");
        for (int i=0; i<arrayEnteros.length;i++){
            
            System.out.print(arrayEnteros[i]+ " ");
        }
        System.out.print("]");
        int aux;
        boolean  intercambios=true;
        while(intercambios){
            intercambios=false;
            for(int i=0;i<arrayEnteros.length-1;i++){

                if(arrayEnteros[i]>arrayEnteros[i+1]){
                    aux=arrayEnteros[i+1];
                    arrayEnteros[i+1]=arrayEnteros[i];
                    arrayEnteros[i]=aux;
                    intercambios=true;
                }
            }
        }
        System.out.print("\nEl array ordenado es \n[ ");
        
        for (int i=0; i<arrayEnteros.length;i++){
            
            System.out.print(arrayEnteros[i]+ " ");
        }
        System.out.print("]");
        
    }
}
