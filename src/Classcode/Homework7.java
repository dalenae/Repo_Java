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

    public static void main(String[] args) {
        System.out.println(makeAbbreviation("make America great again"));
        System.out.println(makeAbbreviation("outfit of the day"));
        System.out.println(makeAbbreviation("happy birthday to you"));
        System.out.println(makeAbbreviation("Good morning"));
        System.out.println(makeAbbreviation("Happy new Year"));
        System.out.println(makeAbbreviation("Happy birthday to you dear"));
    }

    // Create a method that will change the given sentence in Titlecase
    public static String makeTitleCase(String inputStr) {
        String inputStrL = inputStr.toLowerCase();
        String makeTitleCase = "";
        makeTitleCase = inputStrL.substring(0,1).toUpperCase();
        return makeTitleCase; }

   public static int findMaxInArray(int[] inputArray) {
     int maxNum = inputArray[0];
      if (inputArray[1] > maxNum)
        maxNum = inputArray[1];
    if (inputArray[2] > maxNum)
      maxNum = inputArray[2];



    //Create a method to find if the given string is palindrome (DO NOT ignore case)
    public static boolean isPalindrome(String strInput1) {
        String reverse = "";
        for (int i = strInput1.length() - 1; i >= 0; i--) {
            reverse += strInput1.charAt(i);
            if (strInput1.equals(reverse)) {
                System.out.println("String is Palindrome");
            } else {
                System.out.println("String is not Palindrome");
                return isPalindrome("");

            } }
        }