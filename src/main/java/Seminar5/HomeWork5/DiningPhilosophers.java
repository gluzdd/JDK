package Seminar5.HomeWork5;
/*
1. Есть пять философов(потоки), которые либо обедают(выполнение кода) либо размышлять(ожидание).
2. Каждый философ должен пообедать три раза. Каждый приём пищи длится 500 мс.
3. После каждого приёма пищи философ должен размышлятью
4. Не должно возникнуть общей блокировки.
5. Философы не должны есть больше одного раза подряд.
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DiningPhilosophers {
    private Lock[] forks;
    private int numOfPhilosophers;

    public DiningPhilosophers(int n) {
        this.numOfPhilosophers = n;
        forks = new Lock[numOfPhilosophers];
        for (int i = 0; i < forks.length; i++) {
            forks[i] = new ReentrantLock();
        }
    }

    public void startDining() {
        Thread[] philosophers = new Thread[numOfPhilosophers];
        for (int i = 0; i < numOfPhilosophers; i++) {
            final int philosopherIndex = i;
            philosophers[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 3; j++) { // каждый философ должен пообедать три раза
                        eat(philosopherIndex);
                        think(philosopherIndex);
                    }
                }
            });
            philosophers[i].start();
        }
    }

    private void think(int philosopherIndex) {
        System.out.println("Философ " + philosopherIndex + " размышляет.");
        try {
            Thread.sleep((long) (Math.random() * 1000)); // философ размышляет случайное время от 0 до 1 секунды
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void eat(int philosopherIndex) {
        int leftForkIndex = philosopherIndex;
        int rightForkIndex = (philosopherIndex + 1) % numOfPhilosophers; // для последнего философа правой вилки будет первая
        if (leftForkIndex > rightForkIndex) {
            int temp = leftForkIndex;
            leftForkIndex = rightForkIndex;
            rightForkIndex = temp;
        }
        forks[leftForkIndex].lock(); // захватываем левую вилку
        forks[rightForkIndex].lock(); // захватываем правую вилку
        System.out.println("Философ " + philosopherIndex + " ест.");
        try {
            Thread.sleep(500); // каждый приём пищи длится 500 мс.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        forks[leftForkIndex].unlock(); // освобождаем левую вилку
        forks[rightForkIndex].unlock(); // освобождаем правую вилку
    }

    public static void main(String[] args) {
        DiningPhilosophers d = new DiningPhilosophers(5); // для примера создадим 5 философов
        d.startDining();
    }
}
