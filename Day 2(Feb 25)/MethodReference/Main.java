package MethodReference;

public class Main {
    public static void main(String[] args) {
        IDemo d=new Demo("ffffff")::getName;
        System.out.println(d.createName("Sadiq"));
    }
}
