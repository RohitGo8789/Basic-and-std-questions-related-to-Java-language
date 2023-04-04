import java.util.*;
//Binary Search
public class BinarySearch {

    public static int BSearch(int arr[],int key){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            //comparisons
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] > key){ //left
                end = mid-1;
            }else{
                start = mid+1; //right
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,4,7,9,12,15};
        System.out.print("Elements of array are: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter the element that you want to search for: ");
        int key = sc.nextInt();
        int index = BSearch(arr,key);
        if(index == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + index);
        }


    }
    
}
