/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.ordenacion;

/**
 *
 * @author adamelbouchaibi
 */
public class OrdenaInsercion {
    
    public static void main (String args[]){
        /*INSERTAR aquí el código que declara, crea e inicializa convenientemente el array de enteros
            {30, 15, 2, 21, 44, 8}*/
        
        System.out.print("[ ");
        int arrayEnteros[]={30, 15, 2, 21, 44, 8};
        
        for (int i=0; i<arrayEnteros.length;i++){
            
            System.out.print(arrayEnteros[i]+ ", ");
        }
        System.out.print("]");
        
        for(int i=1;i<arrayEnteros.length-1;i++){
            
            int ref=arrayEnteros[i];
            int j =i-1, aux;
            
            while(j<=0 && arrayEnteros[j]>ref){
                
                aux=arrayEnteros[j+1];
                arrayEnteros[j+1]=arrayEnteros[j];
                arrayEnteros[j]=aux;
                
                j=j-1;   
            }
            
            arrayEnteros[j+1]=ref;
        
        }
    }
}
