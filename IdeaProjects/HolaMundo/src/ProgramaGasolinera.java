import java.util.Scanner;

public class ProgramaGasolinera {
    public static void main(String[] args) {
        double capacidad = 0.0;
        double capa = 0.0;
        String res = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cantidad en litros: ");
        capacidad = sc.nextDouble();

        res = capacidad == 70 ? "Estanque lleno" : res;
        res = capacidad >= 60 && capacidad < 70 ? "Estanque casi lleno" : res;
        res = capacidad >= 40 && capacidad < 60 ? "Estanque 3/4" : res;
        res = capacidad >= 35 && capacidad < 40 ? "medio estanque": res;
        res = capacidad >= 20 && capacidad < 35 ? "Suficiente" : res;
        res = capacidad >= 1 && capacidad < 20 ? "Insuficiente" : res;
        System.out.println(res);

    }
}
