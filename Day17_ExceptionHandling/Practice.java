public class Practice {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            int result = a / b; // ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
            System.out.println("Exception: " + e);

        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");
    }
}