/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author adamelbouchaibi
 */
public class TestAlumnePOO {
    public static void main (String args[]){
        
        AlumnePOO a = new AlumnePOO("Adam El Bouchaibi Charrout","60233980Q");
        a.setNotaFinal(7.0);
        a.setNotaParcial(6.0);
        a.setNotaLab(8.0);
        
        System.out.println("La nota de la assignatura del alumne "+getNom()+" "+ a.avalua());
        
    }
}
