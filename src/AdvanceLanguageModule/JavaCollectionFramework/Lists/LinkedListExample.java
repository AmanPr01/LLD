package AdvanceLanguageModule.JavaCollectionFramework.Lists;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Aman");
        list.add("Scaler");
        list.add("Academy");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
