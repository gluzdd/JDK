package Stream2;

public class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;
    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
    }
    //Синхронизированные вызовы call.
    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}
