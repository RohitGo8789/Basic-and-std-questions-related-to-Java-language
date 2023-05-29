//A program that reads a set of integers, and then prints the sum of the even and odd integers
import java.util.*;
public class JavaBasics2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        int choice;
        int EvenSum = 0;
        int OddSum = 0;
        do{
            System.out.print("Enter the number: ");
            num = sc.nextInt();

            if(num % 2 == 0){
                EvenSum += num;
            }else{
                OddSum += num;
            }

            System.out.println("If you want to continue press 1 otherwise press 0: ");
            choice = sc.nextInt();
        }while(choice == 1);

        System.out.println("Sum of even numbers are: " + EvenSum);
        System.out.println("Sum of odd numbers are: " + OddSum);
    }
}
