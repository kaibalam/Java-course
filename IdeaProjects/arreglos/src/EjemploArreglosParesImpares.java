import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {
        int[] a, pares, impares;
        int totalPares =0, totalImpares =0;
        a = new int[10];
        System.out.println("ingrese diez números");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        for (int i = 0; i<a.length; i++){
            if(a[i]%2==0){
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        pares = new int[totalPares];
        impares = new int[totalImpares];
        int j = 0;
        int k = 0;
        for (int i = 0;i < a.length; i++){
            if (a[i]%2==0){
                pares[j++] = a[i];
            } else {
                impares[k++] =a[i];
            }
        }
        System.out.println("=============Numeros pares=============");
        for (int i =0; i<pares.length;i++){
            System.out.print(pares[i]+" ");
        }
        System.out.println("\n=============Numeros impares=============");
        for (int i =0; i<impares.length;i++){
            System.out.print(impares[i]+" ");
        }

    }
}
