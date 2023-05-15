//Selection sort in descending order

public class SortingAssignment{
    public static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            int maxPos = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[maxPos]<arr[j]){
                    maxPos = j;
                }
            }
            //swap
            int temp = arr[maxPos];
            arr[maxPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        System.out.print("The elements of array are: ");
        printArray(arr);
        System.out.println();
        selectionSort(arr);
        System.out.print("Elements of array after sorting are: ");
        printArray(arr);

    }

}
