package Classcode;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Homework8 {
    public static String generateTimeline(int input) {
        Date currDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("ha");
        String dateValue = dateFormat.format(currDate);
        String generateTimeline = "";

        for (int i= 0 ; i <= input ; i += 2) {
        }
        return generateTimeline;

    }

    public static void main(String[] args) {
        System.out.println(generateTimeline(5));
    }
}
