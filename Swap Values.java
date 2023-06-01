//swap values
public class Functions{
    public static void swapValue(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a is " + a);
        System.out.println("b is " + b);
    }
    public static void main(String args[]){
        int a = 5;
        int b = 10;
        swapValue(a,b);
    }
}
