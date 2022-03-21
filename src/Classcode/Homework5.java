package Classcode;

import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {
        String countryName = "Canada";               //Question 1
        System.out.println("Country Name -> " + countryName);
        String[] array = new String[] {"C","a","n","a","d","a"};
        System.out.println("The length of the country name is " + array.length);


        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WElL."; //Question 2
        String[] words = sentence2.split(" ");
        System.out.println("Number of words in sentence ->" + words.length);

        String sentence3 = "make America great again";           //Question 3
        String[] words2 = sentence3.split(" ");
        System.out.println(words2[0].toUpperCase().substring(0,1));
        System.out.println(words2[1].toUpperCase().substring(0,1));
        System.out.println(words2[2].toUpperCase().substring(0,1));
        System.out.println(words2[3].toUpperCase().charAt(0));

        String sentence4 = "outfit of the day";
        String[] words3 =sentence4.split(" ");
        System.out.println(words3[0].toUpperCase().charAt(0));
        System.out.println(words3[1].toUpperCase().charAt(0));
        System.out.println(words3[2].toUpperCase().substring(0,1));
        System.out.println(words3[3].toUpperCase().substring(0,1));

        String sentence5 = "happy birthday to you";
        String[] words4 =sentence5.split(" ");
        System.out.println(words4[0].toUpperCase().substring(0,1));
        System.out.println(words4[1].toUpperCase().substring(0,1));
        System.out.println(words4[2].toUpperCase().charAt(0));
        System.out.println(words4[3].toUpperCase().charAt(0));
    }

}
