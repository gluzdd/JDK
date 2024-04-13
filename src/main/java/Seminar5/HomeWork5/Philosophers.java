package Seminar5.HomeWork5;

import java.util.concurrent.CountDownLatch;
public class Philosophers implements Runnable {
    static private final int TIME_TO_EAT = 500;

    private final String name;
    private final int timeToThink;
    private final CountDownLatch latch;

    public Philosophers(String name, int timeToThink, CountDownLatch latch) {
        this.name = name;
        this.latch = latch;
        this.timeToThink = timeToThink;
    }

    void think() {
        System.out.println(Thread.currentThread().getName() + " is thinking!");
        try {
            Thread.sleep(timeToThink);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " is interrupted!");
        }
    }
    static synchronized void haveLunch() {
        try {
            Thread.sleep(TIME_TO_EAT);
        } catch (InterruptedException e) {
            System.out.println("Is interrupted!");
        }
    }
    @Override
    public void run() {
        for (int i = 1; i < 4; i++) {
            haveLunch();
            switch (i) {
                case 1 -> Main.latch1.countDown();
                case 2 -> Main.latch2.countDown();
                case 3 -> Main.latch3.countDown();
            }
            System.out.println(name + " had lunch " + i + " time(s)");
            think();

            try {
                switch (i) {
                    case 1 -> Main.latch1.await();
                    case 2 -> Main.latch2.await();
                    case 3 -> Main.latch3.await();
                }
            } catch (InterruptedException e) {
                System.out.println("Interrupted " + Thread.currentThread().getName());
            }
        }
        latch.countDown();
    }
}
