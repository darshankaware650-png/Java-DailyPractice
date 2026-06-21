class Student {

    private String name;
    private int age;

    // Setter method
    public void setName(String newName) {
        name = newName;
    }

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setAge(int newAge) {
        age = newAge;
    }

    // Getter method
    public int getAge() {
        return age;
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setName("Darshan");
        student1.setAge(19);

        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
    }
}