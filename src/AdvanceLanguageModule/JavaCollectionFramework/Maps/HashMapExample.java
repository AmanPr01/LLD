package AdvanceLanguageModule.JavaCollectionFramework.Maps;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aman", 1);
        map.put("Scaler", 2);
        map.put("Academy", 3);

        System.out.println("HashMap:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
