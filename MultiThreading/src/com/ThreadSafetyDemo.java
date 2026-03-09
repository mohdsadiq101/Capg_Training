package com;

public class ThreadSafetyDemo implements Runnable{
    @Override
    public void run(){

    }

    public void printMessage(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println(name);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadSafetyDemo obj1 =new ThreadSafetyDemo();
//        ThreadSafetyDemo
    }
}
