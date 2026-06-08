package Day04_Loops;

public class PatternLoop {
    public static void main(String[] args) {

        // 1. Simple star pattern
        System.out.println("Star Pattern:");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2. Number pattern
        System.out.println("\nNumber Pattern:");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // 3. Reverse star pattern
        System.out.println("\nReverse Star Pattern:");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}