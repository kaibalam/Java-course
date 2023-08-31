import java.util.Random;
import java.util.stream.IntStream;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"azul","amarillo","rojo","verde","blanco","negro"};
        double aleatorio = Math.random();
        System.out.println("aleatorio = " + aleatorio);

        aleatorio *= colores.length;
        System.out.println("aleatorio = " + aleatorio);

        aleatorio = Math.floor(aleatorio);
        System.out.println("aleatorio = " + aleatorio);

        System.out.println("colores = " + colores[(int) aleatorio]);

        Random randomObj = new Random();
        int randomInt = randomObj.nextInt(7);
        System.out.println("randomInt = " + randomInt);

        Random ranDom = new Random();
        int a = 100000;
        int b = 999999;
        int c = ranDom.nextInt(a,b);
        System.out.println("c Random number = " + c);
        IntStream res = ranDom.ints(1,a,b);
        int tkn = res.sum();
        System.out.println("tkn : "+tkn);


        long randomLong = randomObj.nextLong();
        System.out.println("randomLong = " + randomLong);

        //para generar un numero entre un rango
        int between = 25 + randomObj.nextInt(50-25+1);
        System.out.println("between = " + between);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores[randomInt] = " + colores[randomInt]);
    }
}
