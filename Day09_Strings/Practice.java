
public class Practice {
    public static void main(String[] args) {

        String firstName = "Darshan";
        String lastName = "Kaware";

        // Join two strings
        String fullName = firstName + " " + lastName;

        System.out.println("Full Name: " + fullName);

        // Length of string
        System.out.println("Length: " + fullName.length());

        // Convert to uppercase
        System.out.println("Uppercase: " + fullName.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + fullName.toLowerCase());

        // Find character using index
        System.out.println("First character: " + fullName.charAt(0));

        // Check whether string contains a word
        System.out.println("Contains Darshan: " + fullName.contains("Darshan"));

        // Compare strings
        String name = "Darshan";

        System.out.println("Names are equal: " + firstName.equals(name));

        // Replace a word
        System.out.println("Replaced name: " + fullName.replace("Darshan", "Rahul"));

        // Extract part of a string
        System.out.println("Substring: " + fullName.substring(0, 7));
    }
}