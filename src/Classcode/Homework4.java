package Classcode;

import java.util.Locale;

public class Homework4 {
    public static void main(String[] args) {

        //Task 1
        String sentence1 = "hhhh";
        System.out.println(sentence1.length());
        String result1= (sentence1.length() >= 5) ? "10" : "15";
        System.out.println(sentence1.length() + " is " + result1);

        //Task 2
        String myname = "dalenaeyasu";
        System.out.println("length of my name -> " + myname.length());
        System.out.println(myname.endsWith("e"));    // result false
        System.out.println(myname.contains("a"));      //result true

        //Task 3
        String task3 = "View the lATesT neWs and BreAKINg news TodAy for U.S., WorLD, WeATheR";
        String valueToCheck = "kINg";

        String lowerCaseTask3 = task3.toLowerCase();
        String lowerCaseValueToCheck = valueToCheck.toLowerCase();
        boolean isContain_king = task3.contains(valueToCheck);
        System.out.println("isContain_king -> " + isContain_king);


        String valueToCheck2 = "EW";
        String lowerCaseValueToCheck2 = valueToCheck2.toLowerCase();
        System.out.println(lowerCaseValueToCheck2);
        System.out.println(task3.indexOf(lowerCaseValueToCheck2));      //result is 2




    }
}
