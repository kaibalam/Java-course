import java.util.Scanner;

public class TareaSistemaDeIngresoNotas {
    public static void main(String[] args) {
        Double[] notas = new Double[20];
        Scanner sc = new Scanner(System.in);
        boolean error = false;
        int uno = 0;
        int index5 = 0;
        int index4 = 0;
        double promCinco = 0.0;
        double promCuatro = 0.0;
        for (int i = 0; i < notas.length; i++){
            System.out.println("Ingrese nota "+(i+1)+" en numeros del 1.0 a 7.0 : ");
            notas[i] = sc.nextDouble();
            double nota = notas[i];
            if (nota == 1){
                uno++;
            }
            if (nota >=5) {
                promCinco = promCinco + nota;
                index5++;
            }
            if (nota <= 4){
                promCuatro = promCuatro + nota;
                index4++;
            }

            if (nota == 0) {
                System.out.println("Error finalizando programa!");
                error = true;
                break;
            }


        }

        if (error){

        } else {
            System.out.println("El número de notas menores o iguales a cuatro es "+index4+" y su promedio es = " + promCuatro/index4);
            System.out.println("El número de las notas mayores a cinco es "+index5+" y su promedio es = " + promCinco/index5);
            System.out.println("Las veces que la nota fué uno es = " + uno);
        }

    }
}

