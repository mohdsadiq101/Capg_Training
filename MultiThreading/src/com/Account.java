package com;

public class Account implements Runnable {
    private double accBalance = 20000;

    public void withdraw(String name, double amt) {
        synchronized (this) {
            if (amt < accBalance) {
                System.out.println(name + " is going to withdraw");
                accBalance -= amt;
                System.out.println(name + " has available balance is " + accBalance);
            } else {
                System.out.println(name + " has not enough balance");
            }
        }
        System.out.println(name + " has available balance " + accBalance);
    }


//    public static void withdraw(String name, double amt) {
//        synchronized (Account.class) {
//            if (amt < accBalance) {
//                System.out.println(name + " is going to withdraw");
//                accBalance -= amt;
//                System.out.println(name + " has available balance is " + accBalance);
//            } else {
//                System.out.println(name + " has not enough balance");
//            }
//        }
//        System.out.println(name + " has available balance " + accBalance);
//    }

    @Override
    public void run() {
        withdraw(Thread.currentThread().getName(), 10000);
    }
}

