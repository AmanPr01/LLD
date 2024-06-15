package AdvanceLanguageModule.JavaCollectionFramework.Sets;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Aman");
        set.add("Scaler");
        set.add("Academy");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
