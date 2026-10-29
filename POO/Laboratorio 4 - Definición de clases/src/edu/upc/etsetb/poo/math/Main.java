/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.math;

/**
 *
 * @author adamelbouchaibi
 */
/*
public class Main {
    public static void main(String[] args){
        
        System.out.println("=================================================================");
        System.out.println("=== CALCULADORA NUMEROS COMPEJOS ~ Adam El Bouchaibi Charrout ===");
        System.out.println("=================================================================");
        
        System.out.print("\n Introduce la operación \n      > ");
        Scanner lector = new Scanner(System.in);
        String[] componentes;
        String c1,c2;
        
        String pantalla = "1";
        
        
        
        while(!pantalla.equals("F") && !pantalla.equals("f")){
        System.out.print("\n Introduce la siguiente operación \n      > ");
        pantalla=lector.nextLine();
        componentes = pantalla.split(" ");
        c1=componentes[1];
        c2=componentes[2];
        if(componentes[0].equals("+")){
            
        }
            
        }
    }
    
    public Complex createComplex(String strComplex){
        String s= strComplex.substring(1,strComplex.length());
        String[] s1=s.split(",");
    
        return new Complex(Double.parseDouble(s1[0]),Double.parseDouble(s1[1]));
    }
}
