package AdvanceLanguageModule.JavaCollectionFramework.Maps;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Aman", 1);
        map.put("Scaler", 2);
        map.put("Academy", 3);

        System.out.println("ConcurrentHashMap:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
