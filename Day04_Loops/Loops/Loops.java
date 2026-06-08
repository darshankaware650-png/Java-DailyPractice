package Day04_Loops;

public class Loops {
    public static void main(String[] args) {

        // 1. For loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // 2. While loop
        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Number: " + j);
            j++;
        }

        // 3. Do-while loop
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println("Number: " + k);
            k++;
        } while (k <= 5);

        // 4. Sum of numbers from 1 to 10
        int sum = 0;
        for (int n = 1; n <= 10; n++) {
            sum = sum + n;
        }
        System.out.println("\nSum from 1 to 10: " + sum);

        // 5. Multiplication table
        int table = 5;
        System.out.println("\nTable of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " x " + i + " = " + (table * i));
        }
    }
}