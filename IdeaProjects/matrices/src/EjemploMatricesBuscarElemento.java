public class EjemploMatricesBuscarElemento {
    public static void main(String[] args) {
        int[][] matrixEneros = {
                {35,90,3,1978},
                {15,2020,10,5},
                {677, 127,32767,1999}
        };
        int elementoBuscar = 32767;
        boolean encontrado = false;
        int i =0;
        int j =0;
        buscar: for (i=0; i<matrixEneros.length; i++){
            for ( j=0; j<matrixEneros[i].length;j++){
                if (matrixEneros[i][j] == elementoBuscar){
                    encontrado = true;
                    break buscar;
                }
            }
        }
        if (encontrado){
            System.out.println("Encontrado elemento a buscar \""+elementoBuscar+"\" en las coordenadas: "+ i + ", " +j);
        } else {
            System.out.println("Elemento a buscar = "+elementoBuscar+" no se encontro en la matriz");
        }
    }
}
