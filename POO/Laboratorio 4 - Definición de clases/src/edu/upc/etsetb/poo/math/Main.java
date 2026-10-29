package edu.upc.etsetb.poo.math;

import java.util.Scanner;

/**
 * Calculadora interactiva de números complejos para consola.
 * 
 * @author adam.el.bouchaibi
 */
public class Main {

    /**
     * Convierte un String con formato "(r,im)" en un objeto Complex.
     */
    public Complex createComplex(String strComplex) {
        // Elimina los paréntesis inicial y final: "(3,4)" -> "3,4"
        String sinParentesis = strComplex.substring(1, strComplex.length() - 1);
        
        // Separa la parte real de la imaginaria por la coma
        String[] partes = sinParentesis.split(",");
        
        double r = Double.parseDouble(partes[0]);
        double im = Double.parseDouble(partes[1]);
        
        return new Complex(r, im);
    }

    public void procesarSuma(String strC1, String strC2) {
        Complex c1 = createComplex(strC1);
        Complex c2 = createComplex(strC2);
        System.out.println("Resultado: " + c1.add(c2));
    }

    public void procesarResta(String strC1, String strC2) {
        Complex c1 = createComplex(strC1);
        Complex c2 = createComplex(strC2);
        System.out.println("Resultado: " + c1.resta(c2));
    }

    public void procesarMultiplicacion(String strC1, String strC2) {
        Complex c1 = createComplex(strC1);
        Complex c2 = createComplex(strC2);
        System.out.println("Resultado: " + c1.mult(c2));
    }

    public void procesarDivision(String strC1, String strC2) {
        Complex c1 = createComplex(strC1);
        Complex c2 = createComplex(strC2);
        System.out.println("Resultado: " + c1.divide(c2));
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Main app = new Main();
        boolean salir = false;

        System.out.println("--- Calculadora de Números Complejos ---");
        System.out.println("Formato: [operador] (r1,im1) (r2,im2)  |  Ejemplo: + (3,4) (4,-5.5)");
        System.out.println("Introduce 'F' o 'f' para salir.\n");

        while (!salir) {
            System.out.print("> ");
            String linea = lector.nextLine().trim();

            // Verificación de salida
            if (linea.equalsIgnoreCase("F")) {
                salir = true;
                System.out.println("Programa finalizado.");
            } else if (!linea.isEmpty()) {
                String[] partes = linea.split(" ");
                
                if (partes.length == 3) {
                    String op = partes[0];
                    String c1Str = partes[1];
                    String c2Str = partes[2];

                    switch (op) {
                        case "+":
                            app.procesarSuma(c1Str, c2Str);
                            break;
                        case "-":
                            app.procesarResta(c1Str, c2Str);
                            break;
                        case "*":
                            app.procesarMultiplicacion(c1Str, c2Str);
                            break;
                        case "/":
                            app.procesarDivision(c1Str, c2Str);
                            break;
                        default:
                            System.out.println("Operador no reconocido. Usa +, -, * o /.");
                    }
                } else {
                    System.out.println("Formato incorrecto. Ejemplo de uso: + (3,4) (4,-5.5)");
                }
            }
        }
    }
}