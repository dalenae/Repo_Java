package Classcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Homework11 {
    //Question 1: Create a method that will the HashMap<Integer, String> as Input
    //print the keys with common values (ignoring cases)
    public static void findKeysWithSameValue(Map<Integer, String> inputMap) {
        Set<Integer> allKeys = inputMap.keySet();
        Set<Integer> keysWithSameValue = new HashSet<>();
        Map<String, String> result = new HashMap<>();

        for (Integer key : allKeys) { // key = 102
            keysWithSameValue.clear();
            for (Integer innerKey : allKeys) {  // innerKey = 101, 103, 104, 105, 106
                if (!key.equals(innerKey) && inputMap.get(key).equalsIgnoreCase(inputMap.get(innerKey))) {
                    keysWithSameValue.add(key);
                    keysWithSameValue.add(innerKey);
                }
            }
            if (keysWithSameValue.size() > 0) {
                result.put(inputMap.get(key).toUpperCase(), keysWithSameValue.toString());
            }
        }
        if (result.size() > 0) {
            Set<String> commonKeys = result.keySet();
            for (String commonKey : commonKeys) {
                System.out.println(commonKey + " is present with keys = " + result.get(commonKey));
            }
        } else {
            System.out.println("No keys have common values");
        }
    }

}
