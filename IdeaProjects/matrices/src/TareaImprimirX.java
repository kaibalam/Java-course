import java.util.Scanner;

public class TareaImprimirX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero entre 5 y 6");
        int n = sc.nextInt();

        if (n == 0) {
            System.err.println("ERROR");
        }

        String[][] equis = new String[n][n];
        for (int i = 0; i < equis.length; i++) {
            for (int j = 0; j < equis[i].length; j++) {
                if (i == j || i == n - 1 + j || i == equis.length - j - 1) {
                    equis[i][j] = "X";
                } else {
                    equis[i][j] = "_";
                }
                equis[j][i] = equis[i][j];

            }
        }

        for (int i = 0; i < equis.length; i++) {
            for (int j = 0; j < equis[i].length; j++) {
                System.out.print(equis[i][j]);
            }
            System.out.println();
        }
    }
}
