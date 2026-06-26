public class ExceptionPractice {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("You cannot divide a number by zero.");
        }

        System.out.println("Program ended successfully.");
    }
}