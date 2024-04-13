package Seminar5.HomeWork5;

import java.util.concurrent.CountDownLatch;
/* Задание 1. В качестве задачи предлагается решить
классическую задачу про обедающих философов
Условие:
● Есть пять философов (потоки), которые могут либо
обедать (выполнение кода) либо размышлять
(ожидание).
● Каждый философ должен пообедать три раза. Каждый
прием пищи длиться 500 миллисекунд
● После каждого приема пищи философ должен
размышлять
● Не должно возникнуть общей блокировки
● Философы не должны есть больше одного раза подряд
*/
public class Main {
    static CountDownLatch latch1 = new CountDownLatch(5);
    static CountDownLatch latch2 = new CountDownLatch(5);
    static CountDownLatch latch3 = new CountDownLatch(5);
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(5);

        Thread herodotus = new Thread(new Philosophers("Herodotus", 1500, latch), "Herodotus");
        Thread euclid = new Thread(new Philosophers("Euclid", 2500, latch), "Euclid");
        Thread pythagoras = new Thread(new Philosophers("Pythagoras", 1000, latch), "Pythagoras");
        Thread socrates = new Thread(new Philosophers("Socrates", 900, latch), "Socrates");
        Thread aristotle = new Thread(new Philosophers("Aristotle", 300, latch), "Aristotle");

        herodotus.start();
        euclid.start();
        pythagoras.start();
        socrates.start();
        aristotle.start();

        System.out.println("_______________".repeat(7));
        try {
            latch.await();
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " is interrupted!");
        }

        System.out.println("_______________".repeat(7));
        System.out.println("All philosophers are fed at last!");
    }
}
