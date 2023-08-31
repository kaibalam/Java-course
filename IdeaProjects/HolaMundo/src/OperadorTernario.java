import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        //variable = condicion_ ? si es verdadero : si es falso;
        String variable = 7 == 7 ? "Si es verdadero" : "si es falso";

        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;
        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        promedio = (matematicas + ciencias + historia)/3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese nota de matemáticas entre 2.0 - 7.0: ");
        matematicas = sc.nextDouble();

        System.out.println("Ingrese nota de cienicas entre 2.0 - 7.0: ");
        ciencias = sc.nextDouble();

        System.out.println("Ingrese nota de historia entre 2.0 - 7.0: ");
        historia = sc.nextDouble();

        promedio = (matematicas + ciencias + historia)/3;
        estado = promedio >= 5.49 ? "aprobado":"reprobado";

        System.out.println("estado = " + estado);
        System.out.println("promedio = " + promedio);


    }
}
