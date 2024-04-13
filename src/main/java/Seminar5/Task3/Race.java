package Seminar5.Task3;

import java.util.concurrent.CountDownLatch;

public class Race {
    public static void main(String[] args) throws InterruptedException{
        CountDownLatch latch = new CountDownLatch(3);

        Thread runner1 = new Runner(3000, latch, "First");
        Thread runner2 = new Runner(2000, latch, "Second");
        Thread runner3 = new Runner(5000, latch, "Third");


        runner1.start();
        runner2.start();
        runner3.start();

        latch.await();
        System.out.println("На старт!");
        Thread.sleep(1000);
        System.out.println("Внимание!");
        Thread.sleep(1000);
        System.out.println("Марш!");
    }
}
