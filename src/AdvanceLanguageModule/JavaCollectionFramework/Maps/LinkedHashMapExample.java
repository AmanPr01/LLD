package AdvanceLanguageModule.JavaCollectionFramework.Maps;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Aman", 1);
        map.put("Scaler", 2);
        map.put("Academy", 3);

        System.out.println("LinkedHashMap:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
