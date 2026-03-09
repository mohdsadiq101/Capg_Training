package Exception;

public class AgeValidator {
    public static void validateAge(int age) throws InvalidAgeException  {
        if (age < 18) {
            throw new InvalidAgeException("Age must be above 18");
        }
        System.out.println("Valid Age");
    }
}
