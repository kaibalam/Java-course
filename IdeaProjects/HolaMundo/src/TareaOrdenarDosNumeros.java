import java.util.Scanner;

public class TareaOrdenarDosNumeros {
    public static void main(String[] args) {
        int a = 0,b = 0;
        String res = "";


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        a = sc.nextInt();
        System.out.println("Ingrese otro número entero: ");
        b = sc.nextInt();

        res = a > b ? a+" "+b : b+" "+a;
        System.out.println("Respuesta: ".concat(res));

    }
}
