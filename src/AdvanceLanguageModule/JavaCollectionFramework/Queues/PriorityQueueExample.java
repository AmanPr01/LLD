package AdvanceLanguageModule.JavaCollectionFramework.Queues;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(15);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
