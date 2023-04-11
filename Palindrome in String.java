public class PalindromeInString {
    public static boolean checkPalindrome(String str){
        for(int i = 0; i <str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }    

        }
        return true;
    }
    public static void main(String args[]){
        String name = "abbua";
        boolean ans = checkPalindrome(name);
        if(ans==true){
            System.out.println("palindrome string");
        }else{
            System.out.println("not a palindrome string");
        }
    }
}
