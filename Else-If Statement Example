//INCOME TAX CALCULATOR USING ELSE-IF STATEMENT
import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter income: ");
        int income = sc.nextInt();
        int tax;
        if(income < 500000){
            tax = 0;
            System.out.println("Your tax is: " +  tax);
            System.out.println("Your income with 0% tax is: " + income);
        }else if(income >= 500000 && income < 1000000){
            tax = (int) (0.2 * income);
            System.out.println("Your tax is: " +  tax);
            System.out.println("Your income with 20% tax is: " + (income - (0.2 * income)));
        }else{
            tax =(int) (0.3 * income);
            System.out.println("Your tax is: " +  tax);
            System.out.println("Your income with 30% of tax is: " + (income - (0.3 * income)));
        }
    }
}
