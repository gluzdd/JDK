package Stream3;

public class PC {
    public static void main(String[] args) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        // Запускаем гуська
        p.t.start();
        c.t.start();
        System.out.println("Нажмите <Ctrl-c>, чтобы остановить программу.");
    }
}
