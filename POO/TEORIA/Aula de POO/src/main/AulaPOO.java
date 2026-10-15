/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.LinkedList;

/**
 *
 * @author adamelbouchaibi
 */
public class AulaPOO {
    // Definició d'atributs
    private int numGrup;
    private LinkedList<AlumnePOO> matriculats;
    
    // Métode constructor
    
    public AulaPOO(int numGrup){
        this.numGrup=numGrup;
        this.matriculats = new LinkedList<>();
    }
    
    // Resta de mètodes...
    
    public void matriculaAlumne (AlumnePOO alumne){
        this.matriculats.add(alumne);
    }
}
