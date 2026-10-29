/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.math.test;
import edu.upc.etsetb.poo.math.Complex;
import static java.lang.Math.*;
/**
 *
 * @author adam.el.bouchaibi
 */
public class test {
    
    public static void main (String[] args){
        Complex c1 = new Complex(2,2);
        
        Complex c2 = new Complex(4,5);
//        
//        System.out.println(c2.toString());
//        System.out.println(c2.getIm());
//        
//        c2.setReal(12);

          System.out.println(c1.add(c2).toString());
          System.out.println(c1.resta(c2).toString());
          System.out.println(c1.mult(c2).toString());
          
          System.out.println(c1.getFase()*2);
    }
    
   
    
}
