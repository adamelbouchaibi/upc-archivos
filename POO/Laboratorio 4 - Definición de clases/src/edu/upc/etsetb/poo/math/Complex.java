/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.math;
import static java.lang.Math.*;
/**
 *
 * @author adam.el.bouchaibi
 */
public class Complex {
    
    private double real;
    private double imaginary;
    
    public Complex(double real, double imaginary){
      this.real=real;
      this.imaginary=imaginary;
    }
    
   public Complex(Complex c){
       this.real=c.real;
       this.imaginary=c.imaginary;
   }
   
    @Override
   public String toString(){
       String cadena ="";
       if(this.imaginary<0){
           cadena+=this.real+""+this.imaginary+"j";
       }else cadena+=this.real+"+"+this.imaginary+"j";
       
       return cadena;
   }
   
   public double getReal(){
       return this.real;
   }
   
   public double getIm(){
       return this.imaginary;
   }
   
   public void setReal(double real)
   {
       this.real=real;
   }
   
   public void setIm(double imaginary){
       this.imaginary=imaginary;
   }
   
  public Complex add(Complex c){
      Complex C = new Complex (this.real+c.real, this.imaginary+c.imaginary);
      return C;
  }
  
  public Complex resta(Complex c){
      
      return new Complex(this.real-c.real,this.imaginary-c.imaginary);
  }
  
  public Complex mult(Complex c){
      
      double realMult = this.real*c.real-this.imaginary*c.imaginary;
      double imMult = this.imaginary*c.real+this.real*c.real;
      
    return new Complex(realMult,imMult);
      
  }
  
  public double getModulo(){
      return sqrt(this.imaginary*this.imaginary+this.real*this.real);
  }
  
  public double getFase(){
      double fase = 0;
      if (this.real>0 && this.imaginary>=0){
        fase=Math.atan(this.imaginary/this.real);  
      } else if (this.real<0 && this.imaginary>=0){
          fase=PI-Math.atan(-this.imaginary/this.real);   
      } else if (this.real<0 && this.imaginary<=0){
          fase=PI+Math.atan(this.imaginary/this.real);
          
      }else if (this.real>0 && this.imaginary<=0){
          fase=2*PI-atan(-this.imaginary/this.real);
      }
      
    return fase;
      } 
  
  public Complex divide(Complex c){
      Complex dividendo = new Complex(this.real,this.imaginary);
      
      double moduloR = dividendo.getModulo() / c.getModulo();
      double faseR = dividendo.getFase()-c.getFase();
      
      while (faseR<0){ faseR+=2*PI;}
      
      return new Complex(moduloR*Math.cos(faseR),moduloR*Math.sin(faseR));
      
  }
  
  }