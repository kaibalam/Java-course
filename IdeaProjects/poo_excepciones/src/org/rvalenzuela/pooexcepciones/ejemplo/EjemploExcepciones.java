package org.rvalenzuela.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args)  {
        Calculadora calc = new Calculadora();
        String denominador = JOptionPane.showInputDialog("Ingrese un entero denominador: ");
        String divisor = JOptionPane.showInputDialog("Ingrese un entero divisor: ");

        try {
             double division2 = calc.dividir(denominador,divisor);
            System.out.println("division2 = " + division2);
        } catch (ArithmeticException e){
            System.out.println("Capturamos la excepcion en tiempo de ejecución: "+ e.getMessage());
            main(args);
        } catch (NumberFormatException ne){
            System.out.println("Excepción por el tipo de datos ingresado: "+ne.getMessage());
            main(args);
        } catch (DivisionPorCeroException de) {
            System.out.println("Método personalizado de excepción: "+de.getMessage());
            main(args);
        } catch (NumeroFormatoException e) {
            System.out.println("Se detectó una excepción ingrese un número válido "+ e.getMessage());
            e.printStackTrace(System.out);
        } finally {
            System.out.println("Es opcional, pero finally ocurre siempre, con o sin excepción");
        }
        System.out.println("Continuaos con el flujo");

    }
}
