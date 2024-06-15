package AdvanceLanguageModule.JavaCollectionFramework.Sets;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Aman");
        set.add("Scaler");
        set.add("Academy");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
