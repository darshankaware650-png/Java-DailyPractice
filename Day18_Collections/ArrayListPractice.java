import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        // add elements
        students.add("Darshan");
        students.add("Rahul");
        students.add("Priya");
        students.add("Amit");

        System.out.println("Students: " + students);

        // get element
        System.out.println("First student: " + students.get(0));

        // change element
        students.set(1, "Rohan");
        System.out.println("After update: " + students);

        // remove element
        students.remove("Amit");
        System.out.println("After remove: " + students);

        // size
        System.out.println("Total students: " + students.size());

        // check element
        System.out.println("Is Priya present? " + students.contains("Priya"));

        // print using loop
        System.out.println("\nAll students:");

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}