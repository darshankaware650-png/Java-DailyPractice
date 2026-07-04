import java.util.*;
public class Practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //taking input from uder
        int size = sc.nextInt();  //taking array size as input from user
        int [] numbers = new int[size];  //considering array of the size given
        

        //Input
        for(int i=0; i<size; i++){
            numbers[i]= sc.nextInt();  //giving input in array 
        }

        //Output
        for(int i=0; i<size; i++){
            System.out.print(numbers[i] + " "); // getting output array
        }
        
    }
}