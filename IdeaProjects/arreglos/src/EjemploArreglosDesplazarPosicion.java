import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<a.length; i++){
            System.out.print("ingrese un numero: ");
            a[i] = sc.nextInt();
        }
        int ultimo = a[a.length-1];


        System.out.println("\r\n============Normal============");
        for (int i = 0; i < a.length; i++){
            System.out.println("Arrego normal indice "+i+" = a valor:  " + a[i]);
        }



        System.out.println("============Desplazado============");


        for (int i = a.length-2; i >= 0; i--){
            a[i+1]=a[i];
        }

        a[0] = ultimo;

        for (int i =0; i<a.length; i++){
            System.out.println("Arrego desplazado indice "+i+" = a valor: " + a[i]);
        }
    }
}
