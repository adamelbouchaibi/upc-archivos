/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package main;
import java.util.LinkedList;

/**
 *
 * @author adamelbouchaibi
 */
public interface Paraules {
    
    public static void main(String[] args){
        
        LinkedList<String> llista = new LinkedList<>();
        
        llista.add("UPC");
        llista.add("ETSETB");
        llista.add("POO");
        
        System.out.println(llista.get(0));
        
    }
    
}
