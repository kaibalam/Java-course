import java.util.Scanner;

public class EjemploArregloEliminarElemento {
    public static void main(String[] args) {
        int[] a = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++){
            System.out.print("Ingrese un número: ");
            a[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Ingrese una posición para eliminar entre 0 a 9 ");
        int posicion= sc.nextInt();
        for (int i = posicion; i < a.length-1;  i++){
            a[i] = a[i+1];
        }
        for (int i = 0; i < a.length; i++){
            System.out.println("desplazamiento " + i + " : " + a[i]);
        }
        int[] b = new int[a.length-1];
        System.arraycopy(a,0,b,0,b.length);

        for (int i = 0; i < b.length; i++){
            System.out.println("desplazamiento " + i + " : " + b[i]);
        }

    }
}
