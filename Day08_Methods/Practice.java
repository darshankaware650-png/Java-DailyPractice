import java.util.Scanner;
public class Practice{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        String firstName=sc.next();
        String lastName=sc.next();
        String fullName = firstName+" "+lastName;

        System.out.println("FullName is: "+ fullName);
        // Using Functions
        // 1st:  .length() to calculate length of string 
        System.out.println("length of string is: "+fullName.length());

        // 2nd is .charAt:  using for finding the letter at specific index or printing alphabets index wise
        // using loop for printing all imdex alphabets
        for(int i=0; i<fullName.length(); i++){
        System.out.println(fullName.charAt(i));
        }

        // Now we will create two strings and compare them 
        // if the string1==string2 then output will be zero
        // if the string1!=string2 then output will be negative
        String name1 = "DARSHAN";
        String name2 = "DARSHAN";
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}