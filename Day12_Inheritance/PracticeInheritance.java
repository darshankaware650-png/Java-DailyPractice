class Animal {
    String name = "Animal";

    void eat() {
        System.out.println("Animal eats food");
    }
}

// Dog inherits properties and methods from Animal
class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

public class PracticeInheritance {
    public static void main(String[] args) {

        Dog d = new Dog();

        System.out.println(d.name); // inherited variable
        d.eat();                    // inherited method
        d.bark();                   // Dog's own method
    }
}