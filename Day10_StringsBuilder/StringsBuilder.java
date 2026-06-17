public class StringsBuilder {
    public static void main(String[] args) {

        StringBuilder name = new StringBuilder("Darshan");

        System.out.println("Original: " + name);

        name.append(" Kaware");
        System.out.println("After append: " + name);

        name.insert(0, "Mr. ");
        System.out.println("After insert: " + name);

        name.replace(0, 3, "Hello");
        System.out.println("After replace: " + name);

        name.delete(0, 6);
        System.out.println("After delete: " + name);

        name.reverse();
        System.out.println("After reverse: " + name);
    }
}