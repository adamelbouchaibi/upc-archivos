/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author adamelbouchaibi
 */
public class AlumnePOO {
    // Definició dels atributs de la classe
    private String nom,nif;
    private double notaLab, notaParcial, notaFinal;
    
    //Implementacio de mètode(s) constructor(s)
    
    public AlumnePOO(String nom, String nif){
        this.nom=nom;
        this.nif=nif;
        this.notaLab=0.0;
        this.notaFinal=0.0;
        this.notaParcial=0.0;
    }
    
    //Implementació de mètodes: getters, setters, avulua()

    public String getNom(){
        return this.nom;
    }
    
    public String getNif(){
        return this.nif;
    }
    
    public double getNotaLab(){
        return this.notaLab;
    }
    
    public double getNotaParcial(){
        return this.notaParcial;
    }
    
    public double getNotaFinal(){
        return this.notaLab;
    }
    
    public void setNotaLab(double notaLab){
        this.notaLab=notaLab;
    }
    public void setNotaParcial(double notaParcial){
        this.notaParcial=notaParcial;
    }
    public void setNotaFinal(double notaFinal){
        this.notaFinal=notaFinal;
    }
    
    public double avalua(){
        if(this.notaParcial>=this.notaFinal){
            return 0.25*this.notaLab+0.2*this.notaParcial+0.55*this.notaFinal;
        } else return 0.25*this.notaLab+0.75*this.notaFinal;
    }
    
    //@Override
    /*public String toString(){
       String s = "Nom: "+this.nom+"\n";
       s+="NIF: "+this.nif+ "\n";
       s+="Nota lab: "+this.notaLab + "\n";
       s+="Nota parcial: "+this.notaParcial +"\n";
       s+="Nota final: "+this.notaFinal +"\n";
       s+="Nota final POO: "+this.avalua();
       
    return s;
    }*/
}
