package com;

public class DemonThread implements Runnable{
    @Override
    public void run(){
        while(true){
            System.out.println(Thread.currentThread().getName()+" is Running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        DemonThread obj = new DemonThread();
        Thread t1 = new Thread(obj);
        t1.setDaemon(true);  // this will make the t1 thread depend on main thread so when main thread is terminated t1 will be terminated as well
        t1.start();
        String str ="HELLO";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            Thread.sleep(1000);
        }
        System.out.println(Thread.currentThread().isAlive());
    }
}
