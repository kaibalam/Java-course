import java.util.Scanner;

public class TareaMultiplicarDosNumeros {
    public static void main(String[] args) {
        int a = 0, b = 0, res = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        a = sc.nextInt();
        System.out.println("Ingrese un número entero");
        b = sc.nextInt();
        res = Math.multiplyExact(a,b);
        System.out.println("El resultado de la multiplicación es: " + res);

    }
}
