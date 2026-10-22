/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.laboratorio.sesion3.apartado4;
import java.util.Scanner;
/**
 *
 * @author adam.el.bouchaibi
 */
public class GenerarAcronimo {
    
    public static void main (String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.print("Introdueix el nom complet per rebre el seu acronim: ");
        String text = lector.nextLine();
        
        String[] fragments = text.split(" ");
        
        String acronim="";
        
        for (int i=0; i<fragments.length; i++){
            acronim+=fragments[i].charAt(0);
        }
        
        System.out.println("El acronim es: " + acronim.toUpperCase());
        
    }  
}
