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
        
        System.out.println("La nota de la assignatura del alumne "+a.getNom()+" és "+ a.avalua());
        System.out.println("Nom: "+a.getNom());
        System.out.println("NIF: "+a.getNif());
        System.out.println("Nota lab: "+a.getNotaLab());
        System.out.println("Nota parcial: "+a.getNotaParcial());
        System.out.println("Nota final: "+a.getNotaFinal());
        System.put.println("\n");
        System.out.println(a.toString());
    }
}
