abstract class Animal {

    // Abstract method
    abstract void sound();

    // Normal method
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows.");
    }
}

public class AbstractionPractice {
    public static void main(String[] args) {

        Animal dog = new Dog();
        dog.sound();
        dog.eat();

        Animal cat = new Cat();
        cat.sound();
        cat.eat();
    }
}