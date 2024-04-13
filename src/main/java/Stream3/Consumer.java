package Stream3;

public class Consumer implements Runnable{
    Q q;
    Thread t;

    public Consumer(Q q) {
        this.q = q;
        t = new Thread(this, "Потребитель");
    }
    public void run() {
        while (true) {
            q.get();
        }
    }
}
