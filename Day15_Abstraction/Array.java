import java.util.*;

public class Array{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter No. of cols: ");
        int cols = sc.nextInt();

        int [][] Matrix = new int[rows][cols];

        // Input
        System.out.println("Enter numbers in array: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                Matrix[i][j]= sc.nextInt();
            }
        }
    
        // Output
        System.out.println("Array is: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}