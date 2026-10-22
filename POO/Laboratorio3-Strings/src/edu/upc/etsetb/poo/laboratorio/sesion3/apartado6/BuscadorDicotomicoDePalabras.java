/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.laboratorio.sesion3.apartado6;

/**
 *
 * @author adamelbouchaibi
 */
public class BuscadorDicotomicoDePalabras {
    
    public static void main (String[] args){
        
        String palabras = "Arbol Barco Casa Decorado Electricidad Formación";
        String aBuscar = "Electricidad";
        
        String[] arrayPalabras = palabras.split(" ");
        
        int primera = 0, ultima = arrayPalabras.length-1 , centro = (ultima+primera)/2;
        System.out.println(primera +" " +  centro +" "+ ultima);
        
    }
    
}
