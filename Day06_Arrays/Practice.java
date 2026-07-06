import java.util.*;

public class Practice{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] numbers = new int[size];
    
    for(int i=0; i<size; i++){
        numbers[i] = sc.nextInt();
    }
    System.out.println("Enter Number: ");
    int x = sc.nextInt();

    for(int i=0; i<numbers.length; i++){
        if(numbers[i] == x){
            System.out.println("Number found at Index: "+ i);
        }
    }
}
}