public class Practice {
    public static void main(String[] args){
        int n = 5;
        //Firts Half
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            int spaces= 2*(n-i);
            for(int j=i; j<=spaces; j++){
                System.out.print(" ");
            }
        }

        //Second Half

    }
}
