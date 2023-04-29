import java.util.*;
public class linearSearch {
    public static int LinearSearch(int arr[], int key){
        //linear searching
         for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        //taking input of array
        System.out.print("Enter elements of array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //printing the array
        System.out.print("Elements of array are: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter element that you want to search for: ");
        int key = sc.nextInt();

        int index = LinearSearch(arr,key);
        if(index == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + index);
        }
        
        

    }
}  
