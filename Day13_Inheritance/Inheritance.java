class Animal {
    String name;
    int age;

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println(name + " is barking: Woof Woof!");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Tommy";
        dog1.age = 3;

        System.out.println("Dog Name: " + dog1.name);
        System.out.println("Dog Age: " + dog1.age);

        dog1.eat();     // inherited from Animal
        dog1.sleep();   // inherited from Animal
        dog1.bark();    // Dog's own method
    }
}