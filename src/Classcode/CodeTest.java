package Classcode;

import javax.swing.*;

public class CodeTest {

    public static int[] sortArray(int[] inInput) {
        int[] intArray = new int[]{0};
        int[] sortArray = {0};
        int temp = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        return sortArray;
    }

    // Create a method to return the sum of digits in input-int-value
    public static int sumOfNumbers(int numbers) {
        int sumOfNumbers = 0;
        int remainder = 0;
        while (numbers > 0) {
            remainder = numbers % 10;
            sumOfNumbers += remainder;
            numbers = numbers / 10;
        }
        return sumOfNumbers;
    }

    public static int[] afterRemovingValue(int[] givenArray) {
        int[] afterRemovingValue = {0};
        int valueRemoved = 0;
        int[] b = new int[givenArray.length - 1];
        for (int i = 0, d = 0; i < givenArray.length; i++) {
            if (givenArray[i] != valueRemoved) {
                b[d] = givenArray[i];
                d++;
            }

        }
        return afterRemovingValue;
    }

    public static void printCommonString(String[] array1, String[] array2) {
        String printCommonString = "";
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    printCommonString += (array1[i]);
                }
            }
        }
        System.out.println(printCommonString);
    }
    public static void main(String[] args) {
        //int[] arrayOne = {32, 54, 12, 67, 2, 5};
        //System.out.println(sortArray(arrayOne));
        System.out.println("input value one= 123");
        System.out.println("returned value one= " + sumOfNumbers(123));
        System.out.println("input value two= 323");
        System.out.println("returned two= " + sumOfNumbers(323));
        System.out.println("input value three= 90");
        System.out.println("returned three= " + sumOfNumbers(90));
       // int[] inputArr = {32, 54, 12, 67, 2, 5};
        //int[] outputArr = afterRemovingValue(inputArr);
        //System.out.println(outputArr);
        String[] arr1 = {"happY", "king", "peace", "living standard"};
        String[] arr2 = {"king kong", "Happy", "PEACE"};
       printCommonString(arr1,arr2);

    }


}

























