public class ReverseArray {
    public static void reverse(int a[]){
        int start = 0; int end = a.length-1;
        while(start < end){
            //swap
            int temp = a[end];
            a[end] = a[start];
            a[start] = temp;

            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int a[] = {2,4,6,8,10};
        System.out.print("Elements of array are: ");
        for(int i = 0; i < a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        reverse(a);
        System.out.print("Reversed array: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

         
    }
    
}
