/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author adamelbouchaibi
 */
public class Producte {
    // Definició d'atributs
    
    private int identificador; 
    private String nom;
    private static int productesCreats = 0;
    
    public Producte(String nom){
        
        this.nom=nom;
        Producte.productesCreats++;
        this.identificador=Producte.productesCreats;
        
        
    }
}
