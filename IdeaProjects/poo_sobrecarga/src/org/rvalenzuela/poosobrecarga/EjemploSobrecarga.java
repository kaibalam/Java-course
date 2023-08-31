package org.rvalenzuela.poosobrecarga;
import static org.rvalenzuela.poosobrecarga.Calculadora.*;
public class EjemploSobrecarga {
    public static void main(String[] args) {
        
        System.out.println("Sumar int: "+ sumar(10,5));
        System.out.println("Sumar float: "+ sumar(10.0F, 5F));
        System.out.println("Sumar float int: " + sumar(10F, 5));
        System.out.println("Sumar int float: "+ sumar(10, 5.0));
        System.out.println("Sumar double: "+ sumar(10.0,5.0));
        System.out.println("Sumar String: "+ sumar("10","5"));
        System.out.println("Sumar tres int: "+ sumar(23,53,23));
        System.out.println("Sumar variable ints: "+ sumar(23,53,23,34,45,45));
        System.out.println("Sumar float + n ints: "+ sumar(23F,53,45,45,23,23,12,23,5));
        System.out.println("Sumar n doubles: "+ sumar(23d,23d,12.3,34.5,56,78));

        System.out.println("Sumar long: "+ sumar(10L, 5L));
        System.out.println("Sumar int: "+ sumar(10,'@'));
        System.out.println("Sumar float int: "+ sumar(10F, '@'));
    }
}
