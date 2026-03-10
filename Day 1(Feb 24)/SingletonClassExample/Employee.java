package SingletonClassExample;

public class Employee {
    private String name;
    private static Employee emp;
    private Employee() {
        System.out.println("Object created");
    }

    public static Employee getEmployee() {
        if(emp==null)
            emp=new Employee();
        return emp;
    }
    public static void m1() {
        System.out.println("Static Method m1 of Employee");
    }
}
