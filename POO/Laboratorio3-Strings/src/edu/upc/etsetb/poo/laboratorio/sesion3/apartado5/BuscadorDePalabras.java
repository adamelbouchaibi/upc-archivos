/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.laboratorio.sesion3.apartado5;
import java.util.Scanner;

/**
 *
 * @author adam.el.bouchaibi
 */
public class BuscadorDePalabras {
    public static void main (String[] args){
        System.out.println("Escribe el texto base: ");
        Scanner lector = new Scanner(System.in);
        String textoBase= lector.nextLine();
        
        System.out.println("Introduce la palabra a buscar");
        
        String textoBusqueda = lector.next();
        
        
        String[] fragmentos= textoBase.split(" ");
        
        
        
        
       boolean trobat= false;
       int i=0;
       while(!trobat &&  i<fragmentos.length){
           
           if(fragmentos[i].equals(textoBusqueda)){
               trobat=true;
               System.out.println("Se ha encontrado la palabra "+ textoBusqueda + " en la posicion " + (i+1));
           } else i++;
           
       }
       
       if(!trobat) System.out.println("No se ha encontrado la palabra dentro del string");
       
    }
}
