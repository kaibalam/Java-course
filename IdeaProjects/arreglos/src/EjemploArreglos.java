import java.util.Arrays;
import java.util.Random;

public class EjemploArreglos {
    public static void main(String[] args) {
        String[] productos = new String[7];
        int total = productos.length;
        for (int i = 0; i< total; i++){
            System.out.println("para indice " + i +" : " + productos[i]);
        }
        productos[0]="Kingston Pendrive 64GB";
        productos[1]="Samsung Galaxy";
        productos[2]="Disco Duro SSD Samsung Externo";
        productos[3]="Asus notebook";
        productos[4]="Macbook Air";
        productos[5]="Chromecast 4ta generación";
        productos[6]="Bicicleta Oxford";

        Arrays.sort(productos);
        System.out.println("================usando for================");
        for (int i = 0; i< total; i++){
            System.out.println("para indice " + i +" después  : " + productos[i]);
        }
        System.out.println("================usando foreach================");
        for (String prod: productos
             ) {
            System.out.println("producto por cada iteración = " + prod);
        }
        System.out.println("================Usando while================");
        int i = 0;
        while ( i< total){
            System.out.println("para indice " + i +" después  : " + productos[i]);
            i++;
        }
        System.out.println("================Usando Dowhile================");
        i = 0;
        do {
            System.out.println("para indice " + (i+1) +" después  : " + productos[i]);
            i++;
        } while ( i< total);



        int[] numeros = new int[10];
        int numTotal = numeros.length;
        Random objRand =new Random();
        for (int k = 0; k<numTotal;k++){
            numeros[k] = objRand.nextInt(100+1);
            System.out.println("numeros = " + numeros[k]);
        }


        Arrays.sort(numeros);


    }
}
