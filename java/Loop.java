/*
 * Copyright (c) 2024.
 * Saman beheshtian
 * amintado@gmail.com
 * +989353466620
 * https://yiiman.ir
 */

public class Loop {
    public static void main(String[] args) {
        long endNumber = 1000000000L;
        long startTime = System.nanoTime();
System.out.println("Hello");
        for (long i = 1; i <= endNumber; i++) {
            if (i == endNumber) {
                long endTime = System.nanoTime();
                double elapsedTime = (endTime - startTime) / 1_000_000_000.0;
                System.out.println("End after: " + elapsedTime + " seconds");
            }
        }
    }
}
