package Examples.Prac2;

public class FactoryMethod {
    public Student createObject() {
        Student s = new Student();
        s.setName("Sadiq");
        s.setMarks(98);
        return s;
    }
}
