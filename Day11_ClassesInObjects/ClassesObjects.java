class Student {

    // Properties
    String name;
    int rollNumber;
    double marks;

    // Method
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {

        // Creating an object
        Student student1 = new Student();

        // Assigning values
        student1.name = "Darshan";
        student1.rollNumber = 101;
        student1.marks = 85.5;

        // Calling method
        student1.displayDetails();
    }
}