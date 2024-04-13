package Seminar5.Task2;

public class Switcher {
    static Boolean switcher;
    static boolean flag;
    public static void main(String[] args) {
        switcher = false;
        flag = true;
        Thread threadA = new Thread() {
            @Override
            public void run() {
                while (flag) {
                    switcher = !switcher;
                    System.out.println(switcher);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread threadB = new Thread() {
            @Override
            public void run() {
                int count = 20;
                while (count != 0) {
                    if (switcher) {
                        count--;
                        System.out.println("count -> " + count);
                    } else {
                        switcher = true;
                    }
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                flag = false;
            }
        };
        threadA.setDaemon(true);
        threadA.start();
        threadB.start();
    }
}
