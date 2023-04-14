 //DIAMOND
 public class AdvPatterns{
    public static void diamond(int n){
        //1st half
        //outer loop
        for(int i = 1; i <= n; i++){
            //spaces - n-i
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            //stars - 2i - 1
            for(int j = 1; j <= (2 * i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for(int i = n; i >= 1; i--){
            //spaces - n-i
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            //stars - 2*i-2
            for(int j = 1; j <= (2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String args[]){
        diamond(4);

    }
 }
