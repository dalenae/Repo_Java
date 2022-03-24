package Classcode;

import sun.lwawt.macosx.CSystemTray;

import java.util.Locale;

public class Homework6 {
    public static void main(String[] args) {
        String words= "make America great again";                             //Question 1
        String [] wordsArray = words.split(" ");
        String magaAbv = "";
        for (int i=0 ; i < wordsArray.length ; i++) {
            magaAbv += wordsArray[i].toUpperCase().charAt(0);
        } System.out.println(magaAbv);

        String words2 = "Good Morning";
        String [] words2Array = words2.split(" ");
        String goodMorningAbv = "";
        for (int i=0 ; i < words2Array.length ; i++) {
            goodMorningAbv += words2Array[i].toUpperCase().charAt(0); }
        System.out.println(goodMorningAbv);

        String words3 = "happy birthday to you dear friend";
        String [] words3Array = words3.split(" ");
        String happyBirthdayAbv = "";
        for (int i=0 ; i < words3Array.length ; i++) {
            happyBirthdayAbv += words3Array[i].toUpperCase().charAt(0); }
        System.out.println(happyBirthdayAbv);

        String words4 = "hEllo";
        String [] words4Array = words4.split(" ");
        String helloAbv = "";
        for (int i=0 ; i < words4Array.length ; i++) {
            helloAbv += words4Array[i].toUpperCase().charAt(0); }
        System.out.println(helloAbv);

        String words5 = "Air ballon";
        String [] words5Array = words5.split(" ");
        String airBalAbv = "";
        for (int i=0 ; i< words5Array.length ; i++) {
            airBalAbv+= words5Array[i].toUpperCase().charAt(0); }
        System.out.println(airBalAbv);

                                                                         // Question 2
        String reverseWords ="";
        int lastIndex = words.length()-1;
        for (int i=0 ; i<=lastIndex ; i++) {
            reverseWords += words.charAt(lastIndex-i); }
        System.out.println(reverseWords);

        String reverseWords2 = "";
        int lastIndex2 = words2.length()-1;
        for (int i=0 ; i<=lastIndex2 ; i++) {
            reverseWords2 += words2.charAt(lastIndex2-i); }
        System.out.println(reverseWords2);

        String wordLearn = "learn";
        String reverseWord3 = "";
        int lastIndex3 = wordLearn.length()-1;
        for (int i=0 ; i<=lastIndex3 ; i++) {
            reverseWord3 += wordLearn.charAt(lastIndex3-i); }
        System.out.println(reverseWord3);

        String reverseWord4 = "";
        int lastIndex4 = words3.length()-1;
        for (int i=0 ; i<=lastIndex4 ; i++) {
            reverseWord4 += words3.charAt(lastIndex4-i); }
        System.out.println(reverseWord4);

                                                                        //Question 3
        String wordsL = words.toLowerCase();
        String wordsT = "";
        for (int i=0 ; i < wordsL.length() ; i++) {
            wordsT += words.substring(0,1).toUpperCase(); }
        System.out.println(wordsT);










    }
}
