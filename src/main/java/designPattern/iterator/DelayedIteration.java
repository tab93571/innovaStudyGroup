package designPattern.iterator;

import java.util.*;

public class DelayedIteration {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Iterator<Integer> iterator = numbers.iterator();

        // Initial iteration
        System.out.println("First part of iteration:");
        if (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Delaying the iteration
        // (Simulation of other tasks or waiting period)
        try {
            Thread.sleep(1000); // Simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Resuming iteration
        System.out.println("Continued iteration:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

