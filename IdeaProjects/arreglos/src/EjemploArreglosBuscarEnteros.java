import java.util.Scanner;

public class EjemploArreglosBuscarEnteros {
    public static void main(String[] args) {
        int[] a = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i =0; i<a.length; i++){
            System.out.print("Ingrese un número: ");
            a[i] = sc.nextInt();
        }


        System.out.println("\r\ningrese un numero a buscar: ");
        int num = sc.nextInt();

       int i = 0;
       for (;i < a.length && a[i] != num;i++){}
       /*
        while (i < a.length && a[i] != num){
            i++;
        }*/
        if (i == a.length){
            System.out.println("No se encontró el número");
        } else if (a[i]== num) {
            System.out.println("Se entontró en la posición: "+ i    );
        }
    }
}
