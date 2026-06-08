package Day04_Loops;

public class LoopPractice {
    public static void main(String[] args) {

        // 1. Print numbers from 1 to 10
        System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 2. Print even numbers from 1 to 20
        System.out.println("\nEven numbers from 1 to 20:");
        for (int i = 2; i <= 20; i = i + 2) {
            System.out.println(i);
        }

        // 3. Print odd numbers from 1 to 20
        System.out.println("\nOdd numbers from 1 to 20:");
        for (int i = 1; i <= 20; i = i + 2) {
            System.out.println(i);
        }

        // 4. Reverse counting from 10 to 1
        System.out.println("\nReverse counting:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // 5. Sum of first 10 numbers
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }

        System.out.println("\nSum of 1 to 10: " + sum);

        // 6. Factorial of 5
        int number = 5;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("\nFactorial of 5: " + factorial);

        // 7. Multiplication table of 7
        int table = 7;

        System.out.println("\nTable of 7:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " x " + i + " = " + (table * i));
        }

        // 8. Print square of numbers
        System.out.println("\nSquares from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " square = " + (i * i));
        }
    }
}