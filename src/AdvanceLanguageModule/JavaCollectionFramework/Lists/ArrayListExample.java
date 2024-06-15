package AdvanceLanguageModule.JavaCollectionFramework.Lists;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Aman");
        list.add("Scaler");
        list.add("Academy");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
