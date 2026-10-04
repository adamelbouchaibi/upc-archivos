/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.laboratorio.sesion1.apartado2;

/**
 *
 * @author adamelbouchaibi
 */
public class MaxComDivisorMainIterativo {

    public static void main(String[] args) {

        int m = 8, n = 16, dividendo, divisor, resto;

        if (m > n) {
            dividendo = m;
            divisor = n;
        } else {
            dividendo = n;
            divisor = m;
        }

        resto = dividendo % divisor;

        while (resto != 0) {
            dividendo = divisor;
            divisor = resto;
            resto = dividendo % divisor;
        }

        System.out.println("El MCD es: " + divisor);
    }
}