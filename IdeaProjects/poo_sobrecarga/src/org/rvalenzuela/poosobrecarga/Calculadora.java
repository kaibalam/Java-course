package org.rvalenzuela.poosobrecarga;



public class Calculadora {

    private Calculadora() {
    }

    public static int sumar(int... args){
        int total =0;
        for(int i: args){
            total += i;
        }
        return total;
    }

    public static float sumar(float a,int... args){
        float total =0;
        for(int i: args){
            total += i;
        }
        return total;
    }
    public static double sumar(double... varargs){
        double total =0;
        for(double i: varargs){
            total += i;
        }
        return total;
    }

    public static int sumar(int a, int b ){
        return a+b;
    }

    public static float sumar(float x, float y){
        return x + y;
    }

    public static float sumar (int i, float j){
        return i+j;
    }

    public static float sumar (float i, int j){
        return i+j;
    }

    public static double sumar(double a, double b){
        return a+b;
    }

    public static int sumar(String a, String b){
        int resultado;
        try {

            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e){
            resultado = 0;
        }

        return  resultado;
    }

    public static int sumar(int a, int b, int c){
        return a+b+c;
    }


}
