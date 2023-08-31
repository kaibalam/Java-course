import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendarGetDate {
    public static int endDay(int mes, int anio){
        int numeroDias = 0;
        switch (mes){
            case 0:
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                numeroDias = 31;
                break;
            case 3:
            case 5:
            case 8:
            case 10:
                numeroDias = 30;
                break;
            case 1:
                if(anio%400 == 0 || (anio%4 == 0 && !(anio%100 == 0))){
                    numeroDias = 29;
                } else {
                    numeroDias = 28;
                }
                break;
            default:
                numeroDias = 0;
        }

        return numeroDias;
    }
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("calendario = " + calendario.getTime());
        int month = calendario.get(Calendar.MONTH);
        int year = calendario.get(Calendar.YEAR);
        int endDay = endDay(month,year);
        int startDay = 1;

        calendario.set(Calendar.YEAR, year);
        System.out.println("Calendar.YEAR = " + calendario.get(Calendar.YEAR));
        calendario.set(Calendar.MONTH,month);
        System.out.println("Calendar.MONTH = " + calendario.get(Calendar.MONTH));
        calendario.set(Calendar.DAY_OF_MONTH,startDay);

        Date startDate;
        startDate = calendario.getTime();
        System.out.println("startDate = " + startDate);
        calendario.set(Calendar.DAY_OF_MONTH,endDay);
        Date endDate;
        endDate = calendario.getTime();
        System.out.println("endDate = " + endDate);

        System.out.println("startDate = " + format.format(startDate));
        System.out.println("endDate = " + format.format(endDate));

        Date thisDate = new Date();
        System.out.println("thisDate = " + thisDate);


    }

}

