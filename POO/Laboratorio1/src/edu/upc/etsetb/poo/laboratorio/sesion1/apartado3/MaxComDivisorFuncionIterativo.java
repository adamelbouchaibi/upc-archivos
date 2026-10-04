/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.laboratorio.sesion1.apartado3;

/**
 *
 * @author adamelbouchaibi
 */

public class MaxComDivisorFuncionIterativo {

    public static void main(String[] args) {

        int m = 40, n = 16;

        MaxComDivisorFuncionIterativo obj = new MaxComDivisorFuncionIterativo();
        int res = obj.mcd(m, n);
        System.out.println("El máximo común divisor entre " + m + " y " + n + " es: " + res);
    }

    public int mcd(int dividendo, int divisor) {
        int m = dividendo, n = divisor, resto;

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

        return divisor;
    }
}