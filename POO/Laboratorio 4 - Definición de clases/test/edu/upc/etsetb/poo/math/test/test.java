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

    public static void main(String[] args) {

        // Pruebas de constructores y toString
        Complex c1 = new Complex(3.0, 4.0);
        Complex c2 = new Complex(4.0, -5.5);
        Complex c3 = new Complex(c1);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3 (copia de c1): " + c3);

        // Probar getters y setters
        c3.setReal(-2.0);
        c3.setIm(-5.0);
        System.out.println("c3 modificado: " + c3.getReal() + " / " + c3.getIm());

        // Operaciones
        System.out.println("Suma: " + c1.add(c2));
        System.out.println("Resta: " + c1.resta(c2));
        System.out.println("Multiplicacion: " + c1.mult(c2));
        System.out.println("Division: " + c1.divide(c2));

        // Modulo y fase
        System.out.println("Modulo c1: " + c1.getModulo());
        System.out.println("Fase c1: " + c1.getFase());

        // Comprobacion de reales = 0 (fases verticales)
        Complex cEjePos = new Complex(0, 5);
        Complex cEjeNeg = new Complex(0, -5);
        System.out.println("Fase (0+5j): " + cEjePos.getFase());
        System.out.println("Fase (0-5j): " + cEjeNeg.getFase());
    }
}