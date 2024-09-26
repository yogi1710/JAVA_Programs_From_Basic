// package Threads;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Inner Thread");
        }
    }
}

class TJoins {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++)
            System.out.println("Outer Thread");
    }
}
