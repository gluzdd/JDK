package Stream;

public class ThreadDemo {
    public static void main(String[] args) {
        NewThread nt1 = new NewThread("One");
        NewThread nt2 = new NewThread("Two");
        NewThread nt3 = new NewThread("Three");
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();
        System.out.println("Поток One работает: " +
                nt1.t.isAlive());
        System.out.println("Поток Two работает: " +
                nt2.t.isAlive());
        System.out.println("Поток Three работает: " +
                nt3.t.isAlive());
//        Ожидание заверщения потоков.
        try {
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Поток One работает: " +
                nt1.t.isAlive());
        System.out.println("Поток Two работает: " +
                nt2.t.isAlive());
        System.out.println("Поток Three работает: " +
                nt3.t.isAlive());
        System.out.println("Завершение главного потока.");
    }

}
