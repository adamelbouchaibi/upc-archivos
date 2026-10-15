/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author adamelbouchaibi
 */
public class TestAulaPOO {
    
    public static void main (String[] args){
        
        AulaPOO aula = new AulaPOO(10);
        
        AlumnePOO alumne = new AlumnePOO("Adam", "60233980Q");
        
        aula.matriculaAlumne(alumne);
        
    }
    
}
