package Seminar5.Task3;

import java.util.concurrent.CountDownLatch;

public class Runner extends Thread {
    private final int delay;
    private final CountDownLatch latch;
    private final String name;

    public Runner(int delay, CountDownLatch latch, String name) {

        this.delay = delay;
        this.latch = latch;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(delay);
            latch.countDown();
            System.out.println(name + " I'm ready!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
