/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.laboratorio.sesion3.apartado2;

/**
 *
 * @author adam.el.bouchaibi
 */
public class StringVsStringBuilder {
   
  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    
    String str = "";
    for (int i = 0; i < 10000; i++) {
      str += "a";
    }
    
    long endTime = System.currentTimeMillis();
    System.out.println("String Time: " + (endTime - startTime) + " ms");
  } 

  /*public static void main(String[] args) {
    long startTime = System.currentTimeMillis();

    StringBuilder str = new StringBuilder();
    for (int i = 0; i < 10000; i++) {
      str.append("a");
    }

    long endTime = System.currentTimeMillis();
    System.out.println("String Time: " + (endTime - startTime) + " ms");
  }*/
  
}
