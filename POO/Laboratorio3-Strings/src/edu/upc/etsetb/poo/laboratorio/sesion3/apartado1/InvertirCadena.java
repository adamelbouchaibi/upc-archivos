/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.laboratorio.sesion3.apartado1;

/**
 *
 * @author adam.el.bouchaibi
 */
public class InvertirCadena {
    public static void main (String[] args){
        String frase ="Escola Tècnica Superior Enginyeria Telecomunicació de Barcelona";
        
        String invertido="";
        StringBuilder invertBuilder = new StringBuilder();
        
        System.out.println("El String inicial es: \n"+ frase);
        for(int i=frase.length()-1;i>=0;i--){
            invertido=invertido+frase.charAt(i);
        }
        
        System.out.println("El String invertido es: \n"+invertido.toLowerCase());
        
        for (int i=frase.length()-1;i>=0;i--){
            invertBuilder.append(frase.charAt(i));
        }
        
        System.out.println("El string invertido con StringBuilder es: \n"+invertBuilder.toString().toLowerCase());
    }
}
