class DisplayValue {
    public synchronized void wish(String name) {
        // By using the syscournized for the method the data incoustincency problem is solved 
        // Now the one thread completes the exection without any interuption of another thread
        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning : ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
    }
}

class MyThread1 extends Thread {
    DisplayValue d;
    String name;

    MyThread1(DisplayValue d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.wish(name);
    }
}

public class UsingSyncournized {
    public static void main(String args[]) {
        DisplayValue d1 = new DisplayValue();
        MyThread1 t1 = new MyThread1(d1, "Yogi");
        t1.start();
        MyThread1 t2 = new MyThread1(d1, "Manju");
        t2.start();
        MyThread1 t3 = new MyThread1(d1, "Hari");
        t3.start();
    }
}