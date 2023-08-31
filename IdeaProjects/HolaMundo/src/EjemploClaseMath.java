import java.lang.management.ManagementFactory;

public class EjemploClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);
        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5,1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5,1.2);
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        long entero = Math.round(3.5);
        System.out.println("entero = " + entero);

        entero = Math.round(Math.PI);
        System.out.println("entero PI = " + entero);

        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(10,3);
        System.out.println("potencia = " + potencia);

        double raizCuad = Math.sqrt(5);
        System.out.println("raizCuad = " + raizCuad);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("convertir de radianes a grados = " + grados);

        double radians = Math.toRadians(90.00);
        System.out.println("convertir de grados a radianes = " + radians);

        System.out.println("Seno de 90 sin(90): "+ Math.sin(radians));
        System.out.println("Coseno de 90:" + Math.cos(radians));

        radians = Math.toRadians(180);
        System.out.println("Print cos(180) = " + Math.cos(radians));

        radians = Math.toRadians(0.00);
        System.out.println("Print cos(180) = " + Math.cos(radians));

    }
}
