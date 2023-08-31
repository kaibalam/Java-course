import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        try {
            System.out.println("Ingrese una fecha con formato: \"dd-MM-yyyy\"");
            Date fecha = format.parse(sc.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format.format(fecha) = " + format.format(fecha));

            Date fecha2 = new Date();
            if(fecha.after(fecha2)){
                System.out.println("Fecha del usuario es mayor que la fecha2");
            } else if(fecha.before(fecha2)){
                System.out.println("fecha es anterior que fecha2");
            } else if (fecha.equals(fecha2)) {
                System.out.println("fecha es igual a fecha2");
            }

            if(fecha.compareTo(fecha2) > 0){
                System.out.println("fecha es mayor que fecha2");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha es anteror que fecha2");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("fecha es igual a fecha2");
            }


        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
