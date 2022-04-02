package Classcode;

public class Homework7 {

    // Create a method to make abbreviation for a given sentence
    public static String makeAbbreviation(String inputStr) {
        String [] inputStrArray = inputStr.split(" ");
        String makeAbbreviation = "";
        for (int i=0 ; i <inputStrArray.length ; i++) {
            makeAbbreviation += inputStrArray[i].toUpperCase().charAt(0); }
        return makeAbbreviation;

        }

    // Create a method that will change the given sentence in Titlecase
    public static String toTitleCase(String input){
        String[] wordArray = input.split(" ");
        String result = "";
        int i=0;
        while (i<wordArray.length){
            result += wordArray[i].substring(0,1).toUpperCase()+wordArray[i].substring(1).toLowerCase()+" ";
            i++;
        }
        result = result.trim();
        return result;
    }

    //Create method to find the maximum value from given int-array
    public static int maxArrayValue(int[] input) {
        int maxValue = input[0];
    int i = 0;
        while (i < input.length){
        if (input[i] > maxValue) {
            maxValue = input[i];
        }
        i++;

    } return maxValue; }

    //Create a method to find if the given string is palindrome (DO NOT ignore case)
        public static boolean isPalindrome(String strInput1) {
            String reverse = "";
            boolean isPalindrome = false;
            for (int i = strInput1.length() - 1; i >= 0; i--) {
                reverse += strInput1.charAt(i);
            }
            if (strInput1.equalsIgnoreCase(reverse)) {
                System.out.println("String is Palindrome");
                isPalindrome = true;
            } else {
                System.out.println("String is not Palindrome");
            }
            return isPalindrome; }


    //Create a method to find the longest String in the given String-array
     public static String longestString(String[] input) {
         String longestValue = input[0];
         int i = 0;
         do {
             if (input[i].length() > longestValue.length()) {
                 longestValue = input[i];
             }
             i++;
         } while (i < input.length);
         return longestValue;
     }

    public static void main(String[] args) {
        System.out.println(makeAbbreviation("make America great again"));
        System.out.println(makeAbbreviation("outfit of the day"));
        System.out.println(makeAbbreviation("happy birthday to you"));
        System.out.println(makeAbbreviation("Good morning"));
        System.out.println(makeAbbreviation("Happy new Year"));
        System.out.println(makeAbbreviation("Happy birthday to you dear"));



    } }
