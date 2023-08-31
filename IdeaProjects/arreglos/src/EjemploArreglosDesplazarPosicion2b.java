import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2b {
    public static void main(String[] args) {
        int[] a = new int[10];
        int elemento,posicion, ultimo;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<a.length; i++){
            System.out.print("ingrese un numero: ");
            a[i] = sc.nextInt();
        }
        System.out.println("indicar posición donde colocar el nuevo elemento de 0 a 9");
        int position = sc.nextInt();
        System.out.println("indicar numero nuevo a cambiar");
        int newNumber = sc.nextInt();

        ultimo = a[a.length-1];

        System.out.println("\r\n============Normal============");
        for (int i = 0; i < a.length; i++){
            System.out.println("Arrego normal indice "+i+" = a valor:  " + a[i]);
        }

        System.out.println("============Desplazado============");
        for (int i = a.length-1; i >= position; i--){
            a[i]=a[i-1];
        }

        int[] b = new int[a.length+1];
        System.arraycopy(a,0,b,0,a.length);



        b[position] = newNumber;
        b[b.length -1] = ultimo;

        for (int i =0; i<b.length; i++){
            System.out.println("Arrego desplazado indice "+i+" = a valor: " + b[i]);
        }
    }
}