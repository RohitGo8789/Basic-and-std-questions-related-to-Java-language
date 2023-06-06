import java.util.*;
//Largest and smallest number in array
public class LargestNoArray {
    public static int LargestNo(int numbers[]){
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE;//+infinity
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
            //smallest value
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest no.: " + smallest);
        return largest; 

    }
    
    public static void main(String args[]){
        int numbers[] = {1,4,6,9,3};
        System.out.println("Largest No.: " + LargestNo(numbers));
    }
    
}
