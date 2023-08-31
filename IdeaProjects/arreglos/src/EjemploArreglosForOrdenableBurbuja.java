import java.util.Random;

public class EjemploArreglosForOrdenableBurbuja {
    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;

        for (int i = 0; i < total/2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
        }



    }

    public static  void sortBurbuja(Object[] arreglo,boolean orden){
        int total = arreglo.length;
        int contador = 0;
        /*
        Se utiliza la bandera ordenen para definir el mismo si es ascendente orden = true o
        descendentes orden = false.
        * */

        if (orden){
            //Orden ascendente
            for (int i= 0; i< total ; i++){

                for (int j = 0; j <total -1 -i; j++){
                    if ( ((Comparable)arreglo[j+1]).compareTo(arreglo[j]) < 0){
                        Object aux = arreglo[j];
                        arreglo[j] = arreglo[j+1];
                        arreglo[j+1] = aux;
                    }
                    contador++;
                }
            }
        } else {
            //Orden descendente
            for (int i= 0; i< total ; i++){

                for (int j = 0; j <total -1 -i; j++){
                    if ( ((Comparable)arreglo[j+1]).compareTo(arreglo[j]) > 0){
                        Object aux = arreglo[j];
                        arreglo[j] = arreglo[j+1];
                        arreglo[j+1] = aux;
                    }
                    contador++;
                }
            }
        }

        System.out.println("contador primer for = " + contador);
        
    }
    public static void main(String[] args) {
        //String[] productos = new String[7];
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy","Disco Duro SSD Samsung Externo",
                "Asus notebook", "Macbook Air", "Chromecast 4ta generación","Bicicleta Oxford"};
        int total = productos.length;
        sortBurbuja(productos, true);

        System.out.println("================usando for ordenando producto burbuja ascendente================");
        for (int i = 0; i< total; i++){
            System.out.println("para indice " + i +" después  : " + productos[i]);
        }
        sortBurbuja(productos, false);

        System.out.println("================usando for ordenando producto burbuja descendente================");
        for (int i = 0; i< total; i++){
            System.out.println("para indice " + i +" después  : " + productos[i]);
        }


/*        for (int i= 0; i< total ; i++){
            for (int j = 0; j <total; j++){
                if (productos[i].compareTo(productos[j]) < 0){
                    String aux = productos[i];
                    productos[i] = productos[j];
                    productos[j] = aux;
                }
            }
        }*/
        System.out.println("================generando array de enteros para numeros================");

        Integer[] numeros = new Integer[4];
        int numTotal = numeros.length;
        Random objRand =new Random();
        for (int k = 0; k<numTotal;k++){
            numeros[k] = objRand.nextInt(100+1);
            System.out.println("arreglo = " + numeros[k]);
        }

        sortBurbuja(numeros, true);
        System.out.println("================usando for ordenando burbuja ascendente================");
        for (int i = 0; i< numTotal; i++){
            System.out.println("para indice " + i +" después  : " + numeros[i]);
        }

        sortBurbuja(numeros, false);
        System.out.println("================usando for ordenando burbuja descendente================");
        for (int i = 0; i< numTotal; i++){
            System.out.println("para indice " + i +" después  : " + numeros[i]);
        }

    }
}
