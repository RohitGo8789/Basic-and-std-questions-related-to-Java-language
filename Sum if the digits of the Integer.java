//sum of the digits of the integer
public class Functions{
    public static void sumInt(int n){
        int sum = 0;
        for(int i = n; i > 0;i++){
        int lastDig = n % 10;
        sum += lastDig;
        n = n/10;
        }System.out.println(sum);
        
    }
    public static void main(String args[]){
        sumInt(567);

    }
}
