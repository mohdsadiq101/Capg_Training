package com;

public class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+"is Running");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        //t1.run();
        t1.start();
        t1.setName("Sadiq");
    }
}
