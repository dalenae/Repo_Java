package Classcode;

import java.util.*;

public class Homework10 {
    //Question-1: Create a method that can return if a given-String-Array has duplicate values or not.
    //Input: String-Array
    //Return type: boolean
    public static boolean arrayHasDuplicates(String[] inputArray) {
        boolean arrayHasDuplicates = false;
        List<String> names = new ArrayList<>(Arrays.asList(inputArray));
        Set<String> setNames = new HashSet<>(names);
        int arrayLength = inputArray.length;
        int setNamesSize = setNames.size();

        arrayHasDuplicates = arrayLength == setNamesSize;
        return arrayHasDuplicates;
    }
    //Question-2: Create a method that would return the duplicate values of given-String-array (ignore the case)
    //Input: String-Array
    //Return type:     (one of these -> Array, List, Set)

    public static List duplicateValues(String[] inputArray) {
        String[] duplicateValues = {""};





    }



}
