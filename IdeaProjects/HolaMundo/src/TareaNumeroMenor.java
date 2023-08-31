import java.util.Scanner;

public class TareaNumeroMenor {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in);
        boolean count = false;
        int menor = 0;
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese un número entero: "+ (i+1));
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length-1; i++){
            //System.out.println("numeros = " + numeros[i]);
            int a = numeros[i];
            if(count){
                if (menor < a){
                    a = menor;
                } else {
                    menor = a;
                }
            }
            for (int j = 0; j < numeros.length-1; j++) {
                int b = numeros[j];
                menor = Math.min(a,b);
                System.out.println("a = " + a + " - b =" + b);
                count = true;
            }

        }
        if(menor >= 10){
            System.out.println("El número menor es = " + menor);
            System.out.println("El número es menor es igual o mayor a 10!");
        } else {
            System.out.println("El número menor es = " + menor);
            System.out.println("El número menor es menor que 10!");
        }
    }
}
