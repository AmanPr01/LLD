package AdvanceLanguageModule;

public class Test implements Runnable {

    private static final Object hello = new Object();
    private int start;
    private int end;

    public Test(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public synchronized void run() {
        synchronized (hello) {
            for (int i = start; i <= end; i++) {
                System.out.println(Thread.currentThread().getName()+ " : " + i);
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Test(1, 50));
        Thread t2 = new Thread(new Test(51, 100));

        t1.start();
        t2.start();
    }
}
