package Functional_Interface;

public class Add implements ICalculator{
    public int calculate(int a, int b){
        return a+b;
    }

    public void m1(){
        System.out.println("Default Method Overriden");
    }

    public static void main(String[] args) {
        Add obj = new Add();
        System.out.println(obj.calculate(10,5));
//        obj.m2();
    }
}

