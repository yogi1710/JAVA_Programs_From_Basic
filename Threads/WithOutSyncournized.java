class Display {
    public void wish(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
    }
}

class MyThread extends Thread {
    Display d;
    String name;

    MyThread(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.wish(name);
    }
}

public class WithOutSyncournized {
    public static void main(String args[]) {
        Display d1 = new Display();
        MyThread t1 = new MyThread(d1, "Yogi");
        t1.start();
        MyThread t2 = new MyThread(d1, "Manju");
        t2.start();
        MyThread t3 = new MyThread(d1, "Hari");
        t3.start();
        // Here 3 threads perform at the same time, this leads to data incoustincency
        // that is called as Syncournization.
    }
}