package edu.upc.etsetb.poo.laboratorio.sesion1.apartado4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adamelbouchaibi
 */
public class MaxComDivisorFuncionRecursivo {

    public static void main(String[] args) {

        int m = 40, n = 16;

        MaxComDivisorFuncionRecursivo obj = new MaxComDivisorFuncionRecursivo();
        int res = obj.mcd(m, n);
        System.out.println("El máximo común divisor entre " + m + " y " + n + " es: " + res);
    }

    public int mcd(int dividendo, int divisor) {

        if (divisor == 0) {
            return dividendo;
        } else {
            return mcd(divisor, dividendo % divisor);
        }
    }
}