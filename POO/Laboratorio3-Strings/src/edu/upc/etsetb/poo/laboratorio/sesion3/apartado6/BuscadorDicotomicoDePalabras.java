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
        
        int primera = 0, ultima = arrayPalabras.length-1 ; 
        String ref;
        
        boolean trobat = false;
        while(primera<=ultima && !trobat){
            int centro = (ultima+primera)/2;
            ref=arrayPalabras[centro];
            
            if ( ref.equals(aBuscar) ){
                trobat = true;
            } 
            
            if (ref.compareTo(aBuscar)<0){
                primera = centro +1;
            } else {
                
                ultima = centro -1;
            }
        }
        
        if(trobat) System.out.println("S'ha trobat");
        if(!trobat) System.out.println("No s'ha trobat");
        
    }
    
}
