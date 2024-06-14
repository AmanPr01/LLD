package AdvanceLanguageModule.ConcurrencyAndMultithreading.ConcurrencyVsParallelism.Parallelism;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ParallelTask extends RecursiveTask<Integer> {

    private int start, end;

    public ParallelTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= 10) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        }
        else {
            int middle = (start + end) / 2;
            ParallelTask leftTask = new ParallelTask(start, middle);
            ParallelTask rightTask = new ParallelTask(middle + 1, end);
//            leftTask.fork();
//            int rightResult = rightTask.compute();
//            int leftResult = leftTask.join();
//            return leftResult + rightResult;
            return leftTask.compute() + rightTask.compute();
        }
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ParallelTask parallelTask = new ParallelTask(1, 100);
        int result = forkJoinPool.invoke(parallelTask);
        System.out.println("Sum from 1 to 100: " + result);
    }
}
