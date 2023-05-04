//Palindrome no.
public class Functions{
    public static void isPalindrome(int n){
        int palin = n;
        int reverse = 0;

        while(palin != 0){
            int rem = palin % 10;
            reverse = reverse * 10 + rem;
            palin = palin/10;
        }
        if(reverse == n){
            System.out.println("It is a palindrome no.");
            
        }else{
            System.out.println("It is not a palindrome no.");
            
        }
    }
    public static void main(String args[]){
        isPalindrome(263);

    }
}
