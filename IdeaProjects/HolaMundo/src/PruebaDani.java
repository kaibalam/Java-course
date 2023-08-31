import java.util.Scanner;

public class PruebaDani {
    public static void main(String[] args) {
        int a = 0;
        int b =0;

        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa un numero a:");

        a = sc.nextInt();

        System.out.println("ingresa un numero b:");

        b = sc.nextInt();

        int suma = a + b;
        System.out.println("la suma de a + b = " + suma);
    }
}
