class Student {
    String name;
    int age;
    String branch;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Darshan";
        s1.age = 19;
        s1.branch = "Computer Engineering";

        s1.displayInfo();
    }
}