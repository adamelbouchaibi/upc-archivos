/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.laboratorio.sesion3.apartado3;
import java.util.Scanner;
/**
 *
 * @author adam.el.bouchaibi
 */
public class SaludarNombre {
   
    public static void main (String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.print("Com et dius? ");
        String text = lector.nextLine();
        System.out.println("Hola " +  text +"!");
    }
    
}
