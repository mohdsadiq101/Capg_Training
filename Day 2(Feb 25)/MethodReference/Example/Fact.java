package MethodReference.Example;

public class Fact {
    public static void main(String[] args) {
        IFact f= FindFact::origFact;
        System.out.println(f.factOfInterface(6));
    }
}
