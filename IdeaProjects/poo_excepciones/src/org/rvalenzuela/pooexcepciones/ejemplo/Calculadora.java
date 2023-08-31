package org.rvalenzuela.pooexcepciones.ejemplo;

public class Calculadora {
    public double dividir(int numerador, int divisor) throws DivisionPorCeroException {
        if (divisor == 0 ){
            throw new DivisionPorCeroException("no se puede dividir por 0");
        }
        return numerador/(double)divisor;
    }

    public double dividir(String numerador, String divisor) throws DivisionPorCeroException, NumeroFormatoException {
        try {
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return this.dividir(num, div);
        } catch (NumberFormatException e){
            throw new NumeroFormatoException("Debe ingresar un número en el númerador y el divisor");
        }
    }
}
