package Exception;

public class Example {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (ArithmeticException e) {
//            System.out.println("Arithmetic Exception");
            throw  new ArithmeticException();
        } finally{
            System.out.println("finally");
//            throw new ArithmeticException();
        }
    }
}
