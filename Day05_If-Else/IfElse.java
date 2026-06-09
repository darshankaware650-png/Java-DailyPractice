public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Program 1: Even or Odd
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        // Program 2: Pass or Fail
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 35) {
            System.out.println("You are Pass");
        } else {
            System.out.println("You are Fail");
        }

        // Program 3: Positive, Negative or Zero
        System.out.print("Enter another number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Number is Positive");
        } else if (number < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is Zero");
        }

        sc.close();
    }
}

