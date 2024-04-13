package Seminar5;

public class ObjectA {
    public void stepFirst(ObjectB objectB) {
        objectB.stepTwo();
    }
    public void stepTwo() {
        System.out.println(Thread.currentThread().getName() + " -> secondstep");
    }
}
