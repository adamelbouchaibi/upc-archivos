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
    }
}
