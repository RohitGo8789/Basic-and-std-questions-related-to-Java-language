//CHECK IF A NUMBER IS PRIME OR NOT
import java.util.*;
public class JavaBasics2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n == 2){
            System.out.println(n + " is a prime number");
        }else{
            //for(int i = 2; i <= n-1; i++){
                for(int i = 2; i <= Math.sqrt(n); i++){ // to make the code more optimise we use (n)^1/2 instead of (n-1)
                if(n % i == 0){ //n is a multiple of i(i not equal to 1 or n)
                    isPrime = false; 
                } 
            }
            if(isPrime == true){
                System.out.println(n + " is a prime number");
            }else{
                System.out.println(n + " is not a prime number");
            }

        }
        
    }
}
