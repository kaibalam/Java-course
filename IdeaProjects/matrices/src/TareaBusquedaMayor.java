public class TareaBusquedaMayor {
    public static void main(String[] args) {
        int[][] a = {
                {1,11,13,2},
                {7,12,8,10,4,6},
                {3,1,11,14}
        };
        int maxCard = 0;
        int aux =0;
        for (int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length -1; j++){
                System.out.println("fila = "+i+  " columna: " + j +" : "+ a[i][j]);
                aux = Math.max(a[i][j],a[i][j+1]);
                maxCard = Math.max(aux,maxCard);
            }
        }
        System.out.println("La carta mayor es: "+ maxCard);


    }
}
