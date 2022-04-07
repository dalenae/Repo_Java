package Classcode;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Homework8 {
    public static void generateTimeline(int input) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("ha");
        Calendar cal = Calendar.getInstance();
        System.out.println("Now");

        for (int i= 0 ; i < input ; i++) {
            cal.add(Calendar.HOUR,2);
            Date dateCal = cal.getTime();
            System.out.println(dateFormat.format(dateCal).toLowerCase());
        }

        System.out.println(generateTimeline(5););

    }
}
