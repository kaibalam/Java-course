import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
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
    public static void main(String[] args) {
        //String[] productos = new String[7];
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy","Disco Duro SSD Samsung Externo",
                "Asus notebook", "Macbook Air", "Chromecast 4ta generación","Bicicleta Oxford"};
        int total = productos.length;

        Arrays.sort(productos);

        arregloInverso(productos);
        System.out.println("================usando for ordenando================");
        for (int i = 0; i< total; i++){
            System.out.println("para indice " + i +" después  : " + productos[i]);
        }

        //Collections.reverse(Arrays.asList(productos));

        System.out.println("================usando for inverso================");
        for (int i = 0; i< total; i++){
            System.out.println("para indice " + i +" después  : " + productos[i]);
        }



    }
}
