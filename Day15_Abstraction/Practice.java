abstract class Practice {

    // Abstract method
    abstract void sound();

    // Normal method
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Practice {

    // Implementing abstract method
    void sound() {
        System.out.println("Dog barks.");
    }
}

public class Practice {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.eat();
    }
}