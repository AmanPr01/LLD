package AdvanceLanguageModule.JavaCollectionFramework.Maps;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Aman", 1);
        map.put("Scaler", 2);
        map.put("Academy", 3);

        System.out.println("TreeMap:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
