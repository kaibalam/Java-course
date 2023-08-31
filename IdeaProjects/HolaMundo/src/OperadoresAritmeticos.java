import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5,j = 4, suma = i + j, resta = i - j, multi =  i * j, div = i /j;

        System.out.println("suma = " + suma);
        System.out.println("i + j = " + (i + j));
        System.out.println("resta = " + resta);
        System.out.println("(i - j) = " + (i - j));
        System.out.println("multi = " + multi);
        System.out.println("div = " + div);

        float div2 = (float) i /j;
        System.out.println("div2 = " + div2);

        int resto = i%j;
        System.out.println("resto = " + resto);

        resto = 8%5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número!"));
        if(numero % 2 == 0){
            System.out.println("numero es par " + numero);
        } else {
            System.out.println("numero es impar " + numero);
        }

        double latitud = 0.0;
        double lonitud = 0.0;

        latitud = -12.24;
        lonitud = 25.43;

        System.out.println("latitud = " + latitud);
        System.out.println("lonitud = " + lonitud);

    }
}
