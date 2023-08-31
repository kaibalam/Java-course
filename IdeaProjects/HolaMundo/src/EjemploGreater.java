import java.util.Arrays;
import java.util.List;

public class EjemploGreater {


    public static void main(String[] args) {
        int[] A = {34, 23, 1, 24, 75, 33, 54, 8};
        int K = 60;
        int S = 0;
        int[] B = new int[A.length];
        int aux = 0;
        primer:
        for (int i = 0; i < A.length; i++) {
            //System.out.println("A[i] = " + A[i]);
            for (int j = 0; j < A.length; j++) {
                S = A[i] + A[j];

                if ((Math.abs(K - S) <= 10 && S <= K)) {
                    System.out.println("El número mas cercano es el = " + S);
                    B[aux++] = S;
                }
            }
            break;
        }

        int max = 0;
        for (int i = 0; i < B.length; i++) {
            //System.out.println("B[i] = " + B[i]);
            max = (B[max] > B[i])? max : i;

        }

        System.out.println("max es = " + B[max]);

    }
}
