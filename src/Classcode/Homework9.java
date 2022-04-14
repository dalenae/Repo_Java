package Classcode;

import java.util.ArrayList;
import java.util.List;

public class Homework9 {

    //Question 1
    //"HAPPY" ,      [Happy, GroW, LeaRN, PeaCEfUL, Learning, HAPPy, Growing, ListeN]
    public static int getCount(String valToCheck, ArrayList<String> arrayList) {
        int getCount = 0;
        for (String strVal : arrayList) {
            if (strVal.equalsIgnoreCase(valToCheck)) {
                getCount++;
            }
        }
        return getCount;
    }
    //Question 2
    //Create method that will return the number of ArrayList-values contains the given String (ignoring the case)
    public static int getContainsCount(String valToCheck, ArrayList<String> arrayList) {
        int getContainsCount = 0;
        for (String val: arrayList) {
            if (val.toLowerCase().contains(valToCheck.toLowerCase())) {
                getContainsCount++;
            }
        }  return getContainsCount;           }

   //Question 3
    //Create a method to return an int-array after removing input-int-value from an input-int-array

   // public static int[] removeNumFromIntArray(int numToRemove, int[] numbers) {
       // List<Integer> myArrayList = new ArrayList<>();
       // int[] finalArray = new int[myArrayList.size()];    }


        public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Happy");
        names.add("GroW");
        names.add("LeaRN");
        names.add("PeaCEfUl");
        names.add("Learning");
        names.add("HAPPy");
        names.add("Growing");
        names.add("ListeN");
        System.out.println(names);
        System.out.println(getCount("HAPPY",names));
        System.out.println(getContainsCount("ea",names));

    }
}
