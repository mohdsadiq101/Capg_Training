package Examples.Prac2;

public class Main {
    public static void main(String[] args) {
        IDemo obj = new FactoryMethod()::createObject;
        Student s = obj.createStudent();
        System.out.println(s.getName());
        System.out.println(s.getMarks());
    }
}
