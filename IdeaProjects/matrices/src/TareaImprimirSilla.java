import java.util.Scanner;

public class TareaImprimirSilla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un número para la matriz de n X n");
        int n = sc.nextInt();
        int[][] silla = new int[n][n];

        if(n == 0){
            System.err.println("ERROR");
            System.exit(-1);
        }

        for(int i = 0; i< silla.length; i++){
            for(int j = 0; j<silla[i].length; j++){
                if (j == 0 || i == silla.length/2 || (j == (silla[i].length)-1 && i >= silla.length/2)){
                    silla[i][j] = 1;
                } else {
                    silla[i][j] = 0;
                }
            }
        }

        for (int i=0; i<silla.length; i++){
            for(int j=0; j<silla[i].length; j++){
                System.out.print(silla[i][j]);
            }
            System.out.println();
        }
    }
}
