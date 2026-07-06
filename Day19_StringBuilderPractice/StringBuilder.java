public class StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Darshan");

        // Print original string
        System.out.println("Original: " + sb);

        // Character at index
        System.out.println("Character at index 2: " + sb.charAt(2));

        // Change a character
        sb.setCharAt(0, 'K');
        System.out.println("After change: " + sb);

        // Insert text
        sb.insert(0, "Mr. ");
        System.out.println("After insert: " + sb);

        // Delete characters
        sb.delete(0, 4);
        System.out.println("After delete: " + sb);

        // Append text
        sb.append(" Kaware");
        System.out.println("After append: " + sb);

        // Reverse text
        sb.reverse();
        System.out.println("Reverse: " + sb);
    }
}