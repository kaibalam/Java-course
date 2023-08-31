import java.util.Scanner;

public class EjemploArreglosBuscarString {
    public static void main(String[] args) {
        String[] a = new String[5];

        Scanner sc = new Scanner(System.in);

        for (int i =0; i<a.length; i++){
            System.out.print("Ingrese un nombre: ");
            a[i] = sc.next();
        }


        System.out.println("\r\ningrese un numero a buscar: ");
        String nombre = sc.next();

       int i = 0;
       for (;i < a.length && !a[i].equalsIgnoreCase(nombre);i++){}
       /*
        while (i < a.length && a[i] != num){
            i++;
        }*/
        if (i == a.length){
            System.out.println("No se encontró el nombre indicado");
        } else if (a[i].toLowerCase().compareTo(nombre.toLowerCase()) == 0) {
            System.out.println("Se entontró en la posición: "+ i    );
        }
    }
}
