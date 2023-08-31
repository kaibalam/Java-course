import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTimeValidation {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();

        String fecha = "14-03-2023";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

        System.out.println("today = " + fecha);

    }
}
