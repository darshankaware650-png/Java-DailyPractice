public class Practice {

    // 1. Method without parameter and without return type
    public static void greet() {
        System.out.println("Welcome to Java Methods!");
    }

    // 2. Method with parameters and without return type
    public static void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    // 3. Method without parameters but with return type
    public static int getNumber() {
        return 100;
    }

    // 4. Method with parameters and return type
    public static int multiply(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {

        // Calling method without parameter
        greet();

        // Calling method with parameters
        add(10, 20);

        // Calling method with return type
        int number = getNumber();
        System.out.println("Returned Number = " + number);

        // Calling method with parameters and return type
        int result = multiply(5, 6);
        System.out.println("Multiplication = " + result);
    }
}