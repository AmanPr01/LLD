package AdvanceLanguageModule.AdvanceOOPConcepts.StaticMembers.StaticInJava;

public class Client {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        Counter.displayCount();
    }
}
