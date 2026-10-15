/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.ordenacion;

/**
 *
 * @author adam.el.bouchaibi
 */
public class OrdenaBurbuja {
    
    
    public static void main (String[] args){
        int arrayEnteros[]={10, 3, 7, 6, 9, 8, 7, 1};
        int aux;
        boolean  intercambios=true;
        
        System.out.print("\nEl array sin ordenar es \n[ ");
        
        for (int i=0; i<arrayEnteros.length;i++){
            
            System.out.print(arrayEnteros[i]+ " ");
        }
        System.out.print("]");
        
        
        
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
