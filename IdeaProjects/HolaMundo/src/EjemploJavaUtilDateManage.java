import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateManage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        Calendar caledar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();

        caledar1.set(Calendar.DAY_OF_MONTH,Calendar.getInstance().getMinimum(Calendar.DAY_OF_MONTH));
        caledar1.set(Calendar.HOUR,0);
        caledar1.set(Calendar.MINUTE,0);
        caledar1.set(Calendar.SECOND,0);
        caledar1.set(Calendar.MILLISECOND,0);

        System.out.println("caledar1 = " + caledar1.getTime());

        calendar2.set(Calendar.MONTH,Calendar.FEBRUARY);
        calendar2.getMaximum(Calendar.DAY_OF_MONTH);
        //calendar2.set(Calendar.DAY_OF_MONTH,calendar2.getMaximum(Calendar.DAY_OF_MONTH));
        calendar2.set(Calendar.HOUR,0);
        calendar2.set(Calendar.MINUTE,0);
        calendar2.set(Calendar.SECOND,0);
        calendar2.set(Calendar.MILLISECOND,0);

        System.out.println("calendar2 = " + calendar2.getTime());
    }
}
