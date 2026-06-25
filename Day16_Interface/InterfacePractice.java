interface Animal {
    void sound();
}

class Dog implements Animal {

    public void sound() {
        System.out.println("Dog says: Bow Bow");
    }
}

class Cat implements Animal {

    public void sound() {
        System.out.println("Cat says: Meow Meow");
    }
}

public class InterfacePractice {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();
    }
}