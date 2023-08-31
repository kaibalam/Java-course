public class EjemplosMatricesTrasponerMatriz {
    public static void main(String[] args) {
        int[][] a = new int[8][4];
        int[][] b= new int[4][8];

        System.out.println("Matriz original");
        for (int i = 0; i<a.length; i++){
            for (int j=0; j<a[i].length;j++){
                a[i][j] = i+j*3;
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

        //mi forma de hacerlo
       /* for (int i=0; i<b.length;i++){
            for (int j=0; j<b[i].length;j++){
                b[i][j] = a[j][i];
            }
        }*/

        //la forma del profesor
        for (int i=0; i<a.length;i++){
            for (int j=0; j<a[i].length;j++){
                b[j][i] = a[i][j];
            }
        }

        System.out.println("Nueva matriz b traspuesta");
        for (int i = 0; i<b.length; i++){
            for (int j=0; j<b[i].length;j++){
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
