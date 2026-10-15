/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package main;
import java.util.LinkedList;
import java.util.Iterator;

/**
 *
 * @author adamelbouchaibi
 */
public interface Paraules {
    
    public static void main(String[] args){
        
        LinkedList<String> llista = new LinkedList<>();
        
        
        System.out.println("Nombre de paraules guardades " + llista.size());
        
        llista.add("UPC");
        llista.add("ETSETB");
        llista.add("POO");
        llista.add(0,"TELECOS");
        
        System.out.println("Nombre de paraules guardades " + llista.size());
        
        Iterator<String> it = llista.iterator();
        
        while(it.hasNext()){
            
            //String paraula=it.next();
            System.out.print("\n" + it.next());
            
        }
        
    }
    
}
