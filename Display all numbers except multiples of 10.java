//DISPLAY ALL NUMBERS GIVEN BY USER EXCEPT MULTIPLES OF 10
import java.util.*;
public class JavaBasics2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your number: ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                continue;
            }System.out.println(n);
        }while(true);
    }
}
